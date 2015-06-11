package slidinggame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author zurai_000
 */
public class XML {

    ArrayList<String> points = new ArrayList<String>();
    ArrayList<String> name = new ArrayList<String>();
//check if the file Scores.xml exist if not create it
    public void CheckforFile() {
        File f = new File("Scores.xml");
        if (f.exists() && !f.isDirectory()) {

        } else {
            try {
                OutputStream fout = new FileOutputStream("Scores.xml");
                OutputStream bout = new BufferedOutputStream(fout);
                OutputStreamWriter out = new OutputStreamWriter(bout, "8859_1");

                out.write("<?xml version=\"1.0\" ");
                out.write("encoding=\"ISO-8859-1\"?>\r\n");
                out.write("<class>\r\n");
                out.write("<Scores>\r\n");

                out.write("</Scores> \r\n");

                out.write("</class>\r\n");

                out.flush();  // Don't forget to flush!
                out.close();
            } catch (UnsupportedEncodingException e) {
                System.out.println(
                        "This VM does not support the Latin-1 character set."
                );
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
//write Scores.xml
    public void SetScore(int score, String name) {
        try {
            String filepath = "Scores.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            //Get the student element by tag name directly
            Node Scores = doc.getElementsByTagName("Scores").item(0);

            //append a new node to first student
            Element Score = doc.createElement("Score");
            Element Name = doc.createElement("name");
            Element point = doc.createElement("points");
            Name.appendChild(doc.createTextNode(name));
            point.appendChild(doc.createTextNode(score + ""));
            Score.appendChild(Name);
            Score.appendChild(point);
            Scores.appendChild(Score);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);

            System.out.println("Done");
        } catch (ParserConfigurationException pce) {
        } catch (TransformerException | IOException | SAXException tfe) {
        }

    }
//read Scores.xml
    public void ReadXML() {
        try {
            String filepath = "Scores.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            //Get the student element by tag name directly
            NodeList nodelist = doc.getElementsByTagName("Score");

            System.out.print(nodelist.getLength());

            for (int i = 0; i < nodelist.getLength(); i++) {

                Element Score = (Element) doc.getElementsByTagName("Score").item(i);
                points.add(i, Score.getElementsByTagName("points").item(0).getTextContent());
                name.add(i, Score.getElementsByTagName("name").item(0).getTextContent());

            }

        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(XML.class
                    .getName()).log(Level.SEVERE, null, ex);
        }

    }
}
