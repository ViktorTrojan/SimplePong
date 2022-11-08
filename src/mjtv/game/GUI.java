package mjtv.game;

import mjtv.Main;
import mjtv.socket.Client;
import mjtv.socket.Network;
import mjtv.socket.Server;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    public void toggleAll(boolean flag) {
        PLAYER1.setEnabled(flag);
        PLAYER2.setEnabled(flag);
        IP.setEnabled(flag);
        JOIN.setEnabled(flag);
        STARTSERVER.setEnabled(flag);
    }

    public void setSocketStatus(String s) {
        SOCKETSTATUS.setText(s);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Wrapper = new mjtv.game.StyleTabbedPane();
        MainMenu = new javax.swing.JPanel();
        PLAY = new mjtv.game.StyleButton();
        HELP = new mjtv.game.StyleButton();
        QUIT = new mjtv.game.StyleButton();
        Play = new javax.swing.JPanel();
        IP = new javax.swing.JTextField();
        IPLABEL = new javax.swing.JLabel();
        SOCKETSTATUS = new javax.swing.JLabel();
        PLAYER1 = new mjtv.game.StyleButton();
        PLAYER2 = new mjtv.game.StyleButton();
        JOIN = new mjtv.game.StyleButton();
        STARTSERVER = new mjtv.game.StyleButton();
        returnToMainFromPlay = new mjtv.game.StyleButton();
        Help = new javax.swing.JPanel();
        Description = new javax.swing.JTextPane();
        returnToMainFromHelp = new mjtv.game.StyleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PLAY.setText("PLAY");
        PLAY.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        PLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYActionPerformed(evt);
            }
        });

        HELP.setText("HELP");
        HELP.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        HELP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HELPActionPerformed(evt);
            }
        });

        QUIT.setText("QUIT");
        QUIT.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        QUIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QUITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
        MainMenu.setLayout(MainMenuLayout);
        MainMenuLayout.setHorizontalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HELP, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLAY, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(PLAY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HELP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QUIT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        Wrapper.addTab("main", MainMenu);

        IP.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        IP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IP.setText("127.0.0.1");

        IPLABEL.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        IPLABEL.setText("IP:");

        SOCKETSTATUS.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        PLAYER1.setText("1 PLAYER");
        PLAYER1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        PLAYER2.setText("2 PLAYER");
        PLAYER2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        PLAYER2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYER2ActionPerformed(evt);
            }
        });

        JOIN.setText("JOIN");
        JOIN.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        JOIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOINActionPerformed(evt);
            }
        });

        STARTSERVER.setText("START SERVER");
        STARTSERVER.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        STARTSERVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTSERVERActionPerformed(evt);
            }
        });

        returnToMainFromPlay.setText("Return To Main");
        returnToMainFromPlay.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        returnToMainFromPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMainFromPlayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlayLayout = new javax.swing.GroupLayout(Play);
        Play.setLayout(PlayLayout);
        PlayLayout.setHorizontalGroup(
            PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(returnToMainFromPlay, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(PLAYER2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(PLAYER1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlayLayout.createSequentialGroup()
                        .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PlayLayout.createSequentialGroup()
                                .addComponent(IPLABEL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IP, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(STARTSERVER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JOIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(SOCKETSTATUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PlayLayout.setVerticalGroup(
            PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PlayLayout.createSequentialGroup()
                        .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IPLABEL)
                            .addComponent(PLAYER1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PLAYER2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STARTSERVER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(JOIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SOCKETSTATUS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnToMainFromPlay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        Wrapper.addTab("play", Play);

        Description.setEditable(false);
        Description.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Description.setText("Ping Pong is a Game where you have to defend your Net with a Paddel. First Player to reach 10 Points Wins!\nPlayer1 movement W - S\nPlayer 2 movement ↑ - ↓\n\nCredits:\nM - Coding\nJ - Graphics Designer\nT - Tidullu dreck\nV - Coding\n\n");

        returnToMainFromHelp.setText("Return To Main");
        returnToMainFromHelp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        returnToMainFromHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMainFromHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HelpLayout = new javax.swing.GroupLayout(Help);
        Help.setLayout(HelpLayout);
        HelpLayout.setHorizontalGroup(
            HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Description, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
            .addGroup(HelpLayout.createSequentialGroup()
                .addComponent(returnToMainFromHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        HelpLayout.setVerticalGroup(
            HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpLayout.createSequentialGroup()
                .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnToMainFromHelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        Wrapper.addTab("help", Help);

        getContentPane().add(Wrapper, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void QUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QUITActionPerformed

    private void PLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYActionPerformed
        Wrapper.setSelectedIndex(1);
    }//GEN-LAST:event_PLAYActionPerformed

    private void HELPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HELPActionPerformed
        Wrapper.setSelectedIndex(2);
    }//GEN-LAST:event_HELPActionPerformed

    private void PLAYER2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYER2ActionPerformed
        Main.instance.game.start();
    }//GEN-LAST:event_PLAYER2ActionPerformed

    private void JOINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JOINActionPerformed
        setSocketStatus("");
        Main.instance.game.client = new Client(IP.getText(), Network.PORT);
    }//GEN-LAST:event_JOINActionPerformed

    private void STARTSERVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTSERVERActionPerformed
        toggleAll(false);
        Main.instance.game.server = new Server(Network.PORT);
    }//GEN-LAST:event_STARTSERVERActionPerformed

    private void returnToMainFromPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMainFromPlayActionPerformed
        Wrapper.setSelectedIndex(0);
    }//GEN-LAST:event_returnToMainFromPlayActionPerformed

    private void returnToMainFromHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMainFromHelpActionPerformed
        Wrapper.setSelectedIndex(0);
    }//GEN-LAST:event_returnToMainFromHelpActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Description;
    private mjtv.game.StyleButton HELP;
    private javax.swing.JPanel Help;
    private javax.swing.JTextField IP;
    private javax.swing.JLabel IPLABEL;
    private mjtv.game.StyleButton JOIN;
    private javax.swing.JPanel MainMenu;
    private mjtv.game.StyleButton PLAY;
    private mjtv.game.StyleButton PLAYER1;
    private mjtv.game.StyleButton PLAYER2;
    private javax.swing.JPanel Play;
    private mjtv.game.StyleButton QUIT;
    private javax.swing.JLabel SOCKETSTATUS;
    private mjtv.game.StyleButton STARTSERVER;
    private mjtv.game.StyleTabbedPane Wrapper;
    private mjtv.game.StyleButton returnToMainFromHelp;
    private mjtv.game.StyleButton returnToMainFromPlay;
    // End of variables declaration//GEN-END:variables

}
