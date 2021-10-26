package mjtv.gui;

import mjtv.Main;
import mjtv.game.Sound;
import mjtv.socket.Client;
import mjtv.socket.Network;
import mjtv.socket.Network.STATE;
import mjtv.socket.Server;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
        this.setResizable(false);
    }

    public void toggleAll(boolean flag) {
        local.setEnabled(flag);
        ip.setEnabled(flag);
        join.setEnabled(flag);
        host.setEnabled(flag);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Wrapper = new mjtv.gui.StyleTabbedPane();
        MainMenu = new javax.swing.JPanel();
        play = new javax.swing.JButton();
        help = new javax.swing.JButton();
        quit = new javax.swing.JButton();
        Play = new javax.swing.JPanel();
        local = new javax.swing.JButton();
        host = new javax.swing.JButton();
        join = new javax.swing.JButton();
        ip = new javax.swing.JTextField();
        ipLabel = new javax.swing.JLabel();
        returnToMainFromPlay = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        Help = new javax.swing.JPanel();
        description = new javax.swing.JTextPane();
        returnToMainFromHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        play.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        play.setText("PLAY");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        help.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        help.setText("HELP");
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        quit.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        quit.setText("QUIT");
        quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainMenuLayout = new javax.swing.GroupLayout(MainMenu);
        MainMenu.setLayout(MainMenuLayout);
        MainMenuLayout.setHorizontalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(play)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(help)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quit)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        Wrapper.addTab("main", MainMenu);

        local.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        local.setText("LOCAL");
        local.setActionCommand("Local");
        local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localActionPerformed(evt);
            }
        });

        host.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        host.setText("HOST");
        host.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostActionPerformed(evt);
            }
        });

        join.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        join.setText("JOIN");
        join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinActionPerformed(evt);
            }
        });

        ip.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ip.setText("127.0.0.1");

        ipLabel.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ipLabel.setText("IP:");

        returnToMainFromPlay.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        returnToMainFromPlay.setText("Return To Main");
        returnToMainFromPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMainFromPlayActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PlayLayout = new javax.swing.GroupLayout(Play);
        Play.setLayout(PlayLayout);
        PlayLayout.setHorizontalGroup(
            PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnToMainFromPlay)
                    .addGroup(PlayLayout.createSequentialGroup()
                        .addComponent(local, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PlayLayout.createSequentialGroup()
                                .addComponent(ipLabel)
                                .addGap(7, 7, 7)
                                .addComponent(ip, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(join, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PlayLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        PlayLayout.setVerticalGroup(
            PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(local)
                    .addComponent(ipLabel)
                    .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ip, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(host)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(join)
                .addGap(56, 56, 56)
                .addComponent(cancel)
                .addGap(37, 37, 37)
                .addComponent(returnToMainFromPlay)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        Wrapper.addTab("play", Play);

        description.setEditable(false);
        description.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        description.setText("Ping Pong is a Game where you have to defend your Net with a Paddel. First Player to reach 10 Points Wins!\nPlayer1 movement W - S\nPlayer 2 movement ↑ - ↓\n\nCredits:\nM - Coding\nJ - Graphics Designer\nT - Tidullu dreck\nV - Coding\n\n");

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
                .addContainerGap(367, Short.MAX_VALUE))
            .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        HelpLayout.setVerticalGroup(
            HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpLayout.createSequentialGroup()
                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnToMainFromHelp)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        Wrapper.addTab("help", Help);

        getContentPane().add(Wrapper, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        Wrapper.setSelectedIndex(1);
    }//GEN-LAST:event_playActionPerformed

    private void helpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpActionPerformed
        Wrapper.setSelectedIndex(2);
    }//GEN-LAST:event_helpActionPerformed

    private void quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitActionPerformed

    private void localActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localActionPerformed
        Main.instance.game.initWithFrame();
    }//GEN-LAST:event_localActionPerformed

    private void joinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinActionPerformed
        toggleAll(false);
        Main.instance.game.getSocket = STATE.CLIENT;
        Main.instance.game.initClient(ip.getText());
    }//GEN-LAST:event_joinActionPerformed

    private void hostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostActionPerformed
        toggleAll(false);
        Main.instance.game.getSocket = STATE.SERVER;
        Main.instance.game.initServer();
    }//GEN-LAST:event_hostActionPerformed

    private void returnToMainFromHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMainFromHelpActionPerformed
        Wrapper.setSelectedIndex(0);
    }//GEN-LAST:event_returnToMainFromHelpActionPerformed

    private void returnToMainFromPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMainFromPlayActionPerformed
        Wrapper.setSelectedIndex(0);
    }//GEN-LAST:event_returnToMainFromPlayActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        toggleAll(true);
        Main.instance.game.getSocket = STATE.NONE;
    }//GEN-LAST:event_cancelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Help;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JPanel Play;
    private mjtv.gui.StyleTabbedPane Wrapper;
    private javax.swing.JButton cancel;
    private javax.swing.JTextPane description;
    private javax.swing.JButton help;
    private javax.swing.JButton host;
    private javax.swing.JTextField ip;
    private javax.swing.JLabel ipLabel;
    private javax.swing.JButton join;
    private javax.swing.JButton local;
    private javax.swing.JButton play;
    private javax.swing.JButton quit;
    private javax.swing.JButton returnToMainFromHelp;
    private javax.swing.JButton returnToMainFromPlay;
    // End of variables declaration//GEN-END:variables

}
