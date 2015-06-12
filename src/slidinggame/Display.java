/*
    Zuraiz Zafar and Aashir Khan
    June 5, 2015
    This program simulates a sliding puzzle game. An image is sliced into 9 pieces
    and randomized on a 3x3 grid. Using the "empty" tile as a means of moving around
    picture parts, the player is required to rearrage the individual smaller pictures
    to replicate the original image configuration. A highscore system is also 
    in place to store the scores of the end user
*/
package slidinggame;

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
    XML xml = new XML();
    public int[][] correctArray = new int[3][3];
    ImageIcon[] images = new ImageIcon[9];

    JButton[][] buttonsArray = new JButton[3][3];
    int[][] userArray = new int[3][3];
    int moves;
    public int selection;
    String Player = "nameless";
    String[] score;
    boolean canSwitch; //whether the clicked button is able to move tiles

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
        lblDisplayPicture = new javax.swing.JLabel();
        Dialog_GameOver = new javax.swing.JDialog();
        lblTitle2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblTxt = new javax.swing.JLabel();
        btnExit1 = new javax.swing.JButton();
        lblDisplayGameOverResult = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HighScore = new javax.swing.JTextArea();
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
        lblCompareImage = new javax.swing.JLabel();

        Dialog_Intro.setBackground(new java.awt.Color(0, 0, 0));
        Dialog_Intro.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        Dialog_Intro.setMinimumSize(new java.awt.Dimension(428, 615));
        Dialog_Intro.setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        Dialog_Intro.setName("Intro_Dialog"); // NOI18N
        Dialog_Intro.setResizable(false);
        Dialog_Intro.setSize(new java.awt.Dimension(406, 620));

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/title.jpg"))); // NOI18N

        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/start_intro.jpg"))); // NOI18N
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnInstructions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/instructionsImage.jpg"))); // NOI18N
        btnInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstructionsActionPerformed(evt);
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exitImage.jpg"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblDisplayPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisplayPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/1_main.png"))); // NOI18N

        javax.swing.GroupLayout Dialog_IntroLayout = new javax.swing.GroupLayout(Dialog_Intro.getContentPane());
        Dialog_Intro.getContentPane().setLayout(Dialog_IntroLayout);
        Dialog_IntroLayout.setHorizontalGroup(
            Dialog_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_IntroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Dialog_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Dialog_IntroLayout.createSequentialGroup()
                        .addGroup(Dialog_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Dialog_IntroLayout.createSequentialGroup()
                                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(Dialog_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(lblDisplayPicture))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Dialog_IntroLayout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
        );
        Dialog_IntroLayout.setVerticalGroup(
            Dialog_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_IntroLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDisplayPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Dialog_IntroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Dialog_IntroLayout.createSequentialGroup()
                        .addComponent(btnInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        Dialog_GameOver.setMinimumSize(new java.awt.Dimension(400, 400));
        Dialog_GameOver.setName("Intro_Dialog"); // NOI18N

        lblTitle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/title.jpg"))); // NOI18N

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backImage_GameOver.jpg"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTxt.setText("Insert G.O text here");

        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/exitImage_GameOver.jpg"))); // NOI18N
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        lblDisplayGameOverResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisplayGameOverResult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/highscoresImage.jpg"))); // NOI18N

        HighScore.setEditable(false);
        HighScore.setBackground(new java.awt.Color(0, 204, 0));
        HighScore.setColumns(20);
        HighScore.setRows(5);
        jScrollPane1.setViewportView(HighScore);

        javax.swing.GroupLayout Dialog_GameOverLayout = new javax.swing.GroupLayout(Dialog_GameOver.getContentPane());
        Dialog_GameOver.getContentPane().setLayout(Dialog_GameOverLayout);
        Dialog_GameOverLayout.setHorizontalGroup(
            Dialog_GameOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dialog_GameOverLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Dialog_GameOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(lblTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitle2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Dialog_GameOverLayout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(lblDisplayGameOverResult, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Dialog_GameOverLayout.setVerticalGroup(
            Dialog_GameOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_GameOverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDisplayGameOverResult, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(Dialog_GameOverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnExit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        lblTitle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/title.jpg"))); // NOI18N

        btn_0.setPreferredSize(new java.awt.Dimension(125, 125));
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });

        btn_1.setPreferredSize(new java.awt.Dimension(125, 125));
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        btn_2.setPreferredSize(new java.awt.Dimension(125, 125));
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });

        btn_3.setPreferredSize(new java.awt.Dimension(125, 125));
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });

        btn_4.setPreferredSize(new java.awt.Dimension(125, 125));
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });

        btn_5.setPreferredSize(new java.awt.Dimension(125, 125));
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });

        btn_6.setPreferredSize(new java.awt.Dimension(125, 125));
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });

        btn_7.setPreferredSize(new java.awt.Dimension(125, 125));
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });

        btn_8.setPreferredSize(new java.awt.Dimension(125, 125));
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });

        btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/backImage.jpg"))); // NOI18N
        btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackActionPerformed(evt);
            }
        });

        lblmoves.setForeground(new java.awt.Color(255, 51, 0));
        lblmoves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmoves.setText("Moves: 0");

        lblCompareImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/1_main.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle1)
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
                                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblmoves, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCompareImage))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCompareImage))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmoves, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {

        new Display().setVisible(true);
        Dialog_Intro.dispose();

    }

    private void btnInstructionsActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Insert instructions here.");
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        Dialog_Intro.setVisible(true);
        Dialog_GameOver.setVisible(false);
    }

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void btn_BackActionPerformed(java.awt.event.ActionEvent evt) {
        Dialog_Intro.setVisible(true);
        this.setVisible(false);
    }

//for the following 9 buttons
    //when the button is clicked it looks at the button array to see if any 
    //button is disabled beside it, if true then replace there locations in the user Array. it runs the ImageToArray function to assign new images to the buttons then checks it to see if the player has won
    //also, if the button is not able to move positions, the moves counter is not changed
    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {
        int temp;

        if (!buttonsArray[0][1].isEnabled() || !buttonsArray[1][0].isEnabled()) {

            if (!buttonsArray[0][1].isEnabled()) {
                temp = userArray[0][1];
                userArray[0][1] = userArray[0][0];
                userArray[0][0] = temp;
            } else if (!buttonsArray[1][0].isEnabled()) {
                temp = userArray[1][0];
                userArray[1][0] = userArray[0][0];
                userArray[0][0] = temp;
            }
            moves--;
        }

        ImageToNumber();
        checkArray(userArray);

    }

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {
        int temp;

        if (!buttonsArray[0][0].isEnabled() || !buttonsArray[1][1].isEnabled() || !buttonsArray[0][2].isEnabled()) {

            if (!buttonsArray[0][0].isEnabled()) {
                temp = userArray[0][0];
                userArray[0][0] = userArray[0][1];
                userArray[0][1] = temp;

            } else if (!buttonsArray[1][1].isEnabled()) {
                temp = userArray[1][1];
                userArray[1][1] = userArray[0][1];
                userArray[0][1] = temp;

            } else if (!buttonsArray[0][2].isEnabled()) {
                temp = userArray[0][2];
                userArray[0][2] = userArray[0][1];
                userArray[0][1] = temp;
            }
            moves--;
        }

        ImageToNumber();
        checkArray(userArray);
    }

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {
        int temp;

        if (!buttonsArray[0][1].isEnabled() || !buttonsArray[1][2].isEnabled()) {

            if (!buttonsArray[0][1].isEnabled()) {
                temp = userArray[0][1];
                userArray[0][1] = userArray[0][2];
                userArray[0][2] = temp;

            } else if (!buttonsArray[1][2].isEnabled()) {
                temp = userArray[1][2];
                userArray[1][2] = userArray[0][2];
                userArray[0][2] = temp;

            }
            moves--;
        }
        ImageToNumber();
        checkArray(userArray);
    }

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {
        int temp;

        if (!buttonsArray[0][0].isEnabled() || !buttonsArray[1][1].isEnabled() || !buttonsArray[2][0].isEnabled()) {

            if (!buttonsArray[0][0].isEnabled()) {
                temp = userArray[0][0];
                userArray[0][0] = userArray[1][0];
                userArray[1][0] = temp;

            } else if (!buttonsArray[1][1].isEnabled()) {
                temp = userArray[1][1];
                userArray[1][1] = userArray[1][0];
                userArray[1][0] = temp;

            } else if (!buttonsArray[2][0].isEnabled()) {
                temp = userArray[2][0];
                userArray[2][0] = userArray[1][0];
                userArray[1][0] = temp;

            }
            moves--;
        }

        ImageToNumber();
        checkArray(userArray);
    }

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {
        int temp;

        if (!buttonsArray[0][1].isEnabled() || !buttonsArray[1][0].isEnabled() || !buttonsArray[1][2].isEnabled() || !buttonsArray[2][1].isEnabled()) {

            if (!buttonsArray[0][1].isEnabled()) {
                temp = userArray[0][1];
                userArray[0][1] = userArray[1][1];
                userArray[1][1] = temp;

            } else if (!buttonsArray[1][0].isEnabled()) {
                temp = userArray[1][0];
                userArray[1][0] = userArray[1][1];
                userArray[1][1] = temp;

            } else if (!buttonsArray[1][2].isEnabled()) {
                temp = userArray[1][2];
                userArray[1][2] = userArray[1][1];
                userArray[1][1] = temp;

            } else if (!buttonsArray[2][1].isEnabled()) {
                temp = userArray[2][1];
                userArray[2][1] = userArray[1][1];
                userArray[1][1] = temp;

            }
            moves--;
        }

        ImageToNumber();
        checkArray(userArray);
    }

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {
        int temp;

        if (!buttonsArray[0][2].isEnabled() || !buttonsArray[2][2].isEnabled() || !buttonsArray[1][1].isEnabled()) {

            if (!buttonsArray[0][2].isEnabled()) {
                temp = userArray[0][2];
                userArray[0][2] = userArray[1][2];
                userArray[1][2] = temp;

            }
            if (!buttonsArray[2][2].isEnabled()) {
                temp = userArray[2][2];
                userArray[2][2] = userArray[1][2];
                userArray[1][2] = temp;

            }
            if (!buttonsArray[1][1].isEnabled()) {
                temp = userArray[1][1];
                userArray[1][1] = userArray[1][2];
                userArray[1][2] = temp;

            }
            moves--;
        }

        ImageToNumber();
        checkArray(userArray);
    }

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {
        int temp;

        if (!buttonsArray[1][0].isEnabled() || !buttonsArray[2][1].isEnabled()) {

            if (!buttonsArray[1][0].isEnabled()) {
                temp = userArray[1][0];
                userArray[1][0] = userArray[2][0];
                userArray[2][0] = temp;

            }
            if (!buttonsArray[2][1].isEnabled()) {
                temp = userArray[2][1];
                userArray[2][1] = userArray[2][0];
                userArray[2][0] = temp;

            }
            moves--;
        }

        ImageToNumber();
        checkArray(userArray);
    }

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {
        int temp;

        if (!buttonsArray[2][0].isEnabled() || !buttonsArray[2][2].isEnabled() || !buttonsArray[1][1].isEnabled()) {

            if (!buttonsArray[2][0].isEnabled()) {
                temp = userArray[2][0];
                userArray[2][0] = userArray[2][1];
                userArray[2][1] = temp;

            }
            if (!buttonsArray[2][2].isEnabled()) {
                temp = userArray[2][2];
                userArray[2][2] = userArray[2][1];
                userArray[2][1] = temp;

            }
            if (!buttonsArray[1][1].isEnabled()) {
                temp = userArray[1][1];
                userArray[1][1] = userArray[2][1];
                userArray[2][1] = temp;
                checkArray(userArray);

            }
            moves--;
        }

        ImageToNumber();
        checkArray(userArray);
    }

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {
        int temp;
        
        if (!buttonsArray[1][2].isEnabled() || !buttonsArray[2][1].isEnabled()) {
        
        if (!buttonsArray[1][2].isEnabled()) {
            temp = userArray[1][2];
            userArray[1][2] = userArray[2][2];
            userArray[2][2] = temp;

        }
        if (!buttonsArray[2][1].isEnabled()) {
            temp = userArray[2][1];
            userArray[2][1] = userArray[2][2];
            userArray[2][2] = temp;

        }
        moves--;
        }
        
        ImageToNumber();
        checkArray(userArray);

    }

//write and read score from the XML.java 
    //also get user name and display in textArea
    void DisplayGOScreen(String GOText) {
        lblTxt.setText(GOText);
        Player = JOptionPane.showInputDialog("Please enter your name");
        Dialog_GameOver.setVisible(true);

        xml.SetScore(moves, Player);
        xml.ReadXML();
        this.setVisible(false);

        HighScore.setText("NAME\t\t                                SCORE\n");
        for (int i = 0; i < xml.points.size(); i++) {
            HighScore.append(i + "\t" + xml.name.get(i) + "\t\t                                  " + xml.points.get(i) + "\n");

        }

    }

    //assign correct array numbers
    public void setStart() {
        // <editor-fold defaultstate="collapsed" desc="Initialization">   

        //this sets the correct array values
        correctArray[0][0] = 1;
        correctArray[0][1] = 2;
        correctArray[0][2] = 3;
        correctArray[1][0] = 4;
        correctArray[1][1] = 5;
        correctArray[1][2] = 6;
        correctArray[2][0] = 7;
        correctArray[2][1] = 8;
        correctArray[2][2] = 9;

        //these are the button locations
        buttonsArray[0][0] = btn_0;
        buttonsArray[0][1] = btn_1;
        buttonsArray[0][2] = btn_2;
        buttonsArray[1][0] = btn_3;
        buttonsArray[1][1] = btn_4;
        buttonsArray[1][2] = btn_5;
        buttonsArray[2][0] = btn_6;
        buttonsArray[2][1] = btn_7;
        buttonsArray[2][2] = btn_8;
//image icons
        images[0] = new ImageIcon("src\\resources\\1_1.jpg");
        images[1] = new ImageIcon("src\\resources\\1_2.jpg");
        images[2] = new ImageIcon("src\\resources\\1_3.jpg");
        images[3] = new ImageIcon("src\\resources\\1_4.jpg");
        images[4] = new ImageIcon("src\\resources\\1_5.jpg");
        images[5] = new ImageIcon("src\\resources\\1_6.jpg");
        images[6] = new ImageIcon("src\\resources\\1_7.jpg");
        images[7] = new ImageIcon("src\\resources\\1_8.jpg");
        images[8] = new ImageIcon("src\\resources\\1_9.jpg");

        // </editor-fold>
        //randomize location of pictures
        //this looks for and assigns random positions to a position
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
        ImageToNumber();

        xml.CheckforFile();
        moves = 10000;
    }

//assign pictures to location it also sets the card with the number 9 to be disabled and to not have an icon
    void ImageToNumber() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttonsArray[i][j].setEnabled(true);

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                buttonsArray[i][j].setIcon(images[(userArray[i][j] - 1)]);
                if (userArray[i][j] == 9) {
                    buttonsArray[i][j].setEnabled(false);
                    buttonsArray[i][j].setIcon(null);
                }
            }
        }

    }

//called from setStart(). this function looks for a random number in the used array if it has been used it assigns it a new number
    public int Randomizer(int[] A, int B) {
        if (linearSearch(A, B)) {
            B = (int) (Math.random() * 9) + 1;
            return Randomizer(A, B);
        } else {
            return B;
        }

    }

//this function looks for a random number in the used array
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
                }
            }
        }

        if (count == 9) {
            String txt = "YOU WON";
            DisplayGOScreen(txt);

        } else if (moves <= 0) {
            String txt = "YOU LOST";
            DisplayGOScreen(txt);
        }

        lblmoves.setText("Moves: " + (10000 - moves));
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
    private javax.swing.JTextArea HighScore;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCompareImage;
    private javax.swing.JLabel lblDisplayGameOverResult;
    private javax.swing.JLabel lblDisplayPicture;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle1;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JLabel lblmoves;
    // End of variables declaration//GEN-END:variables
}
