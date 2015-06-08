/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slidinggame;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.JOptionPane;

/**
 *
 * @author zurai_000
 */
public class Display extends javax.swing.JFrame {

    /**
     * Creates new form Screen_Intro
     */
         //variables

    public int[][] correctArray = new int[3][3];
    ImageIcon[] images = new ImageIcon[9];
    JButton[][] buttonsArray = new JButton[3][3];
    int[][] userArray = new int[3][3];
    int moves;

    public Display() {
        initComponents();
//sets the board at the start
        /*
         Correct Array
         Randomized UserArray
         Images to location
            
         */
        setStart();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog_Intro = new javax.swing.JDialog();
        lblTitle = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnInstructions = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        comboboxPictureSelection = new javax.swing.JComboBox();
        lblInfo1 = new javax.swing.JLabel();
        lblDisplayPicture = new javax.swing.JLabel();
        Dialog_GameOver = new javax.swing.JDialog();
        lblTitle2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblTxt = new javax.swing.JLabel();
        btnExit1 = new javax.swing.JButton();
        lblTitle1 = new javax.swing.JLabel();
        btn_0 = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_Back = new javax.swing.JButton();
        lblmoves = new javax.swing.JLabel();

        Dialog_Intro.setBackground(new java.awt.Color(0, 0, 0));
        Dialog_Intro.setMinimumSize(new java.awt.Dimension(400, 400));
        Dialog_Intro.setName("Intro_Dialog"); // NOI18N

        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slidinggame/title.jpg"))); // NOI18N

        btnStart.setText("START PLAYING");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnInstructions.setText("Instructions");
        btnInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructionsActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        comboboxPictureSelection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Image 1", "Image 2", "Image 3" }));
        comboboxPictureSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxPictureSelectionActionPerformed(evt);
            }
        });

        lblInfo1.setText("Please select the image to unscramble:");

        lblDisplayPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisplayPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Image1_Original.jpg"))); // NOI18N

        javax.swing.GroupLayout Dialog_IntroLayout = new javax.swing.GroupLayout(Dialog_Intro.getContentPane());
        Dialog_Intro.getContentPane().setLayout(Dialog_IntroLayout);
        Dialog_IntroLayout.setHorizontalGroup(
            Dialog_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_IntroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Dialog_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDisplayPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dialog_IntroLayout.createSequentialGroup()
                        .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Dialog_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnInstructions, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dialog_IntroLayout.createSequentialGroup()
                        .addComponent(lblInfo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboboxPictureSelection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        Dialog_IntroLayout.setVerticalGroup(
            Dialog_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_IntroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(Dialog_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo1)
                    .addComponent(comboboxPictureSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDisplayPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(Dialog_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Dialog_IntroLayout.createSequentialGroup()
                        .addComponent(btnInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        Dialog_GameOver.setMinimumSize(new java.awt.Dimension(400, 400));
        Dialog_GameOver.setName("Intro_Dialog"); // NOI18N

        lblTitle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slidinggame/title.jpg"))); // NOI18N

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTxt.setText("Insert G.O text here");

        btnExit1.setText("Exit");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Dialog_GameOverLayout = new javax.swing.GroupLayout(Dialog_GameOver.getContentPane());
        Dialog_GameOver.getContentPane().setLayout(Dialog_GameOverLayout);
        Dialog_GameOverLayout.setHorizontalGroup(
            Dialog_GameOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_GameOverLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Dialog_GameOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Dialog_GameOverLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Dialog_GameOverLayout.setVerticalGroup(
            Dialog_GameOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_GameOverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Dialog_GameOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lblTitle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/title.jpg"))); // NOI18N

        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/a1.jpg"))); // NOI18N
        btn_0.setPreferredSize(new java.awt.Dimension(125, 125));
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/a2.jpg"))); // NOI18N
        btn_1.setPreferredSize(new java.awt.Dimension(125, 125));
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/a3.jpg"))); // NOI18N
        btn_2.setPreferredSize(new java.awt.Dimension(125, 125));

        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/a4.jpg"))); // NOI18N
        btn_3.setPreferredSize(new java.awt.Dimension(125, 125));

        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/a5.jpg"))); // NOI18N
        btn_4.setPreferredSize(new java.awt.Dimension(125, 125));

        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/a6.jpg"))); // NOI18N
        btn_5.setPreferredSize(new java.awt.Dimension(125, 125));

        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/a7.jpg"))); // NOI18N
        btn_6.setPreferredSize(new java.awt.Dimension(125, 125));

        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/a8.jpg"))); // NOI18N
        btn_7.setPreferredSize(new java.awt.Dimension(125, 125));

        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/a9.jpg"))); // NOI18N
        btn_8.setPreferredSize(new java.awt.Dimension(125, 125));

        btn_Back.setText("Back");
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        lblmoves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmoves.setText("Moves left: 31");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblmoves, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblmoves, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed

        new Display().setVisible(true);
        Dialog_Intro.dispose();


    }//GEN-LAST:event_btnStartActionPerformed

    private void btnInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstructionsActionPerformed
        JOptionPane.showMessageDialog(null, "Insert instructions here.");
    }//GEN-LAST:event_btnInstructionsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        Dialog_Intro.setVisible(true);
        Dialog_GameOver.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackActionPerformed
        Dialog_Intro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_BackActionPerformed

    private void comboboxPictureSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxPictureSelectionActionPerformed
        
        int pictureSelected = comboboxPictureSelection.getSelectedIndex();
        if (pictureSelected == 0) {
            System.out.println(0);
        lblDisplayPicture.setIcon(new ImageIcon("src\\resources\\Image1_Original.jpg"));}
        else if (pictureSelected == 1)
            lblDisplayPicture.setIcon(new ImageIcon("src\\resources\\Image2_Original.jpg"));
        else if (pictureSelected == 2)
            lblDisplayPicture.setIcon(new ImageIcon("src\\resources\\Image3_Original.jpg"));
        
    }//GEN-LAST:event_comboboxPictureSelectionActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        
    }//GEN-LAST:event_btn_1ActionPerformed
//GameOverScreen

    void DisplayGOScreen(String GOText) {
        lblTxt.setText(GOText);
        Dialog_GameOver.setVisible(true);
        this.setVisible(false);
    }

    //assign correct array numbers
    public void setStart() {
        // <editor-fold defaultstate="collapsed" desc="Initialization">   
        correctArray[0][0] = 1;
        correctArray[0][1] = 2;
        correctArray[0][2] = 3;
        correctArray[1][0] = 4;
        correctArray[1][1] = 5;
        correctArray[1][2] = 6;
        correctArray[2][0] = 7;
        correctArray[2][1] = 8;
        correctArray[2][2] = 9;
        

        buttonsArray[0][0] = btn_0;
        buttonsArray[0][1] = btn_1;
        buttonsArray[0][2] = btn_2;
        buttonsArray[1][0] = btn_3;
        buttonsArray[1][1] = btn_4;
        buttonsArray[1][2] = btn_5;
        buttonsArray[2][0] = btn_6;
        buttonsArray[2][1] = btn_7;
        buttonsArray[2][2] = btn_8;

        images[0] = new ImageIcon("src\\slidinggame\\Test_1.jpg");
        images[1] = new ImageIcon("src\\slidinggame\\Test_2.jpg");
        images[2] = new ImageIcon("src\\slidinggame\\Test_3.jpg");
        images[3] = new ImageIcon("src\\slidinggame\\Test_4.jpg");
        images[4] = new ImageIcon("src\\slidinggame\\Test_5.jpg");
        images[5] = new ImageIcon("src\\slidinggame\\Test_6.jpg");
        images[6] = new ImageIcon("src\\slidinggame\\Test_7.jpg");
        images[7] = new ImageIcon("src\\slidinggame\\Test_8.jpg");
        images[8] = new ImageIcon("src\\slidinggame\\Test_9.jpg");
        // </editor-fold>
//randomize location of pictures

        int[] used = new int[9];
        int tracker = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int tempvar = (int) (Math.random() * 9) + 1;
                used[tracker] = Randomizer(used, tempvar);
                userArray[i][j] = used[tracker];
                tracker++;
            }
        }
        System.out.print(Arrays.deepToString(userArray));

        ImageToNumber();
           for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (userArray[i][j]==9){
                buttonsArray[i][j].setEnabled(false);
                buttonsArray[i][j].setIcon(null);
                }
            }
        }

        moves = 31;
    }
//assign pictures to location

    void ImageToNumber(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttonsArray[i][j].setIcon(images[(userArray[i][j]-1)]);
            }
        }
    }
       //randomize pictures
 
    public int Randomizer(int[] A, int B) {
        if (linearSearch(A, B)) {
            B = (int) (Math.random() * 9) + 1;
            return Randomizer(A, B);
        } else {
            return B;
        }

    }
//look if location has been used

    public boolean linearSearch(int[] A, int B) {
        for (int k = 0; k < A.length; k++) {
            if (A[k] == B) {
                return true;
            }
        }
        return false;
    }
//compare user array and correct array and then display win if won or loss if lost

    void checkArray(int userArray[][]) {
        int count = 0;
        for (int i = 0; i < correctArray.length; i++) {
            for (int j = 0; j < correctArray.length; j++) {
                if (userArray[i][j] == correctArray[i][j]) {
                    count++;
                    System.out.print(userArray[i][j] + "\t" + correctArray[i][j]);
                    System.out.println(count);
                }
            }
        }
        moves--;
        if (count == 9) {
            String txt = "YOU WON";
            DisplayGOScreen(txt);

        } else if (moves <= 0) {
            String txt = "YOU LOST";
            DisplayGOScreen(txt);
        }

        lblmoves.setText("Moves left: " + moves);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().Dialog_Intro.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Dialog_GameOver;
    private javax.swing.JDialog Dialog_Intro;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnInstructions;
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_Back;
    private javax.swing.JComboBox comboboxPictureSelection;
    private javax.swing.JLabel lblDisplayPicture;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JLabel lblmoves;
    // End of variables declaration//GEN-END:variables
}
