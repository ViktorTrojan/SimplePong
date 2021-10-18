package mjtv.gui;

import java.awt.Color;
import java.io.File;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mjtv.Main;
import mjtv.game.Game;
import mjtv.socket.Client;
import mjtv.socket.Network;
import mjtv.socket.Network.STATE;
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

        Wrapper = new mjtv.gui.StyleTabbedPane();
        MainMenu = new javax.swing.JPanel();
        PLAY = new javax.swing.JButton();
        HELP = new javax.swing.JButton();
        QUIT = new javax.swing.JButton();
        Play = new javax.swing.JPanel();
        PLAYER1 = new javax.swing.JButton();
        PLAYER2 = new javax.swing.JButton();
        STARTSERVER = new javax.swing.JButton();
        JOIN = new javax.swing.JButton();
        IP = new javax.swing.JTextField();
        IPLABEL = new javax.swing.JLabel();
        returnToMainFromPlay = new javax.swing.JButton();
        SOCKETSTATUS = new javax.swing.JLabel();
        Help = new javax.swing.JPanel();
        Description = new javax.swing.JTextPane();
        returnToMainFromHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PLAY.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        PLAY.setText("PLAY");
        PLAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYActionPerformed(evt);
            }
        });

        HELP.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        HELP.setText("HELP");
        HELP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HELPActionPerformed(evt);
            }
        });

        QUIT.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        QUIT.setText("QUIT");
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
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PLAY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HELP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(PLAY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HELP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QUIT)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        Wrapper.addTab("main", MainMenu);

        PLAYER1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        PLAYER1.setText("1 PLAYER");
        PLAYER1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYER1ActionPerformed(evt);
            }
        });

        PLAYER2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        PLAYER2.setText("2 PLAYER");
        PLAYER2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYER2ActionPerformed(evt);
            }
        });

        STARTSERVER.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        STARTSERVER.setText("START SERVER");
        STARTSERVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTSERVERActionPerformed(evt);
            }
        });

        JOIN.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        JOIN.setText("JOIN");
        JOIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOINActionPerformed(evt);
            }
        });

        IP.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        IP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IP.setText("127.0.0.1");

        IPLABEL.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        IPLABEL.setText("IP:");

        returnToMainFromPlay.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        returnToMainFromPlay.setText("Return To Main");
        returnToMainFromPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMainFromPlayActionPerformed(evt);
            }
        });

        SOCKETSTATUS.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        javax.swing.GroupLayout PlayLayout = new javax.swing.GroupLayout(Play);
        Play.setLayout(PlayLayout);
        PlayLayout.setHorizontalGroup(
            PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlayLayout.createSequentialGroup()
                        .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PLAYER1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(PLAYER2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PlayLayout.createSequentialGroup()
                                .addComponent(IPLABEL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IP))
                            .addComponent(STARTSERVER, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JOIN)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PlayLayout.createSequentialGroup()
                        .addComponent(returnToMainFromPlay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SOCKETSTATUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PlayLayout.setVerticalGroup(
            PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PlayLayout.createSequentialGroup()
                        .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PLAYER1)
                            .addComponent(IP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IPLABEL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PLAYER2)
                            .addComponent(STARTSERVER)))
                    .addComponent(JOIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(returnToMainFromPlay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SOCKETSTATUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        Wrapper.addTab("play", Play);

        Description.setEditable(false);
        Description.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Description.setText("Ping Pong is a Game where you have to defend your Net with a Paddel. First Player to reach 10 Points Wins!\nPlayer1 movement W - S\nPlayer 2 movement ↑ - ↓\n\nCredits:\nM - Coding\nJ - Graphics Designer\nT - Tidullu dreck\nV - Coding\n\n");

        returnToMainFromHelp.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        returnToMainFromHelp.setText("Return to Main");
        returnToMainFromHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMainFromHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HelpLayout = new javax.swing.GroupLayout(Help);
        Help.setLayout(HelpLayout);
        HelpLayout.setHorizontalGroup(
            HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(returnToMainFromHelp)
                .addContainerGap(358, Short.MAX_VALUE))
            .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        HelpLayout.setVerticalGroup(
            HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpLayout.createSequentialGroup()
                .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnToMainFromHelp)
                .addGap(0, 21, Short.MAX_VALUE))
        );

        Wrapper.addTab("help", Help);

        getContentPane().add(Wrapper, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYActionPerformed
        Wrapper.setSelectedIndex(1);
    }//GEN-LAST:event_PLAYActionPerformed

    private void HELPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HELPActionPerformed
        Wrapper.setSelectedIndex(2);
    }//GEN-LAST:event_HELPActionPerformed

    private void QUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_QUITActionPerformed

    private void PLAYER1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYER1ActionPerformed

    }//GEN-LAST:event_PLAYER1ActionPerformed

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

    private void returnToMainFromHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMainFromHelpActionPerformed
        Wrapper.setSelectedIndex(0);
    }//GEN-LAST:event_returnToMainFromHelpActionPerformed

    private void returnToMainFromPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMainFromPlayActionPerformed
        Wrapper.setSelectedIndex(0);
    }//GEN-LAST:event_returnToMainFromPlayActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Description;
    private javax.swing.JButton HELP;
    private javax.swing.JPanel Help;
    private javax.swing.JTextField IP;
    private javax.swing.JLabel IPLABEL;
    private javax.swing.JButton JOIN;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JButton PLAY;
    private javax.swing.JButton PLAYER1;
    private javax.swing.JButton PLAYER2;
    private javax.swing.JPanel Play;
    private javax.swing.JButton QUIT;
    private javax.swing.JLabel SOCKETSTATUS;
    private javax.swing.JButton STARTSERVER;
    private mjtv.gui.StyleTabbedPane Wrapper;
    private javax.swing.JButton returnToMainFromHelp;
    private javax.swing.JButton returnToMainFromPlay;
    // End of variables declaration//GEN-END:variables

}
