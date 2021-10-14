package mjtv.gui;

import java.awt.event.KeyEvent;
import javax.swing.JButton;

public class GUI extends javax.swing.JFrame {
    
    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Wrapper = new javax.swing.JTabbedPane();
        MainMenu = new javax.swing.JPanel();
        PLAY = new javax.swing.JButton();
        HELP = new javax.swing.JButton();
        QUIT = new javax.swing.JButton();
        Play = new javax.swing.JPanel();
        PLAYER1 = new javax.swing.JButton();
        PLAYER2 = new javax.swing.JButton();
        JoinLocal1 = new javax.swing.JButton();
        JoinLocal = new javax.swing.JButton();
        enterIP1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        returnToMainFromPlay = new javax.swing.JButton();
        Help = new javax.swing.JPanel();
        Description = new javax.swing.JTextPane();
        returnToMainFromHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Wrapper.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

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
                .addGap(47, 47, 47)
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PLAY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HELP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QUIT, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(PLAY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HELP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QUIT)
                .addContainerGap(247, Short.MAX_VALUE))
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

        JoinLocal1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        JoinLocal1.setText("START SERVER");
        JoinLocal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinLocal1ActionPerformed(evt);
            }
        });

        JoinLocal.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        JoinLocal.setText("JOIN");
        JoinLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinLocalActionPerformed(evt);
            }
        });

        enterIP1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        enterIP1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enterIP1.setText("127.0.0.1");
        enterIP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterIP1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setText("IP:");

        returnToMainFromPlay.setText("Return To Main");
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
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlayLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PLAYER1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(PLAYER2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PlayLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enterIP1))
                            .addComponent(JoinLocal1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JoinLocal))
                    .addGroup(PlayLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(returnToMainFromPlay)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PlayLayout.setVerticalGroup(
            PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlayLayout.createSequentialGroup()
                        .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PLAYER1)
                            .addComponent(enterIP1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PLAYER2)
                            .addComponent(JoinLocal1)))
                    .addComponent(JoinLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addComponent(returnToMainFromPlay)
                .addGap(30, 30, 30))
        );

        Wrapper.addTab("play", Play);

        Description.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        Description.setText("Ping Pong is a Game that was Developed to make people rage quit quick brown fox jumps over ...");

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
                .addGap(0, 205, Short.MAX_VALUE)
                .addComponent(returnToMainFromHelp)
                .addGap(0, 206, Short.MAX_VALUE))
            .addGroup(HelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        HelpLayout.setVerticalGroup(
            HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(returnToMainFromHelp)
                .addGap(0, 64, Short.MAX_VALUE))
        );

        Wrapper.addTab("help", Help);

        getContentPane().add(Wrapper, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PLAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYActionPerformed
        Wrapper.setSelectedIndex(1);
    }//GEN-LAST:event_PLAYActionPerformed

    private void HELPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HELPActionPerformed
        Wrapper.setSelectedIndex(2);
    }//GEN-LAST:event_HELPActionPerformed

    private void QUITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QUITActionPerformed
        dispose();
    }//GEN-LAST:event_QUITActionPerformed

    private void PLAYER1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYER1ActionPerformed
        
    }//GEN-LAST:event_PLAYER1ActionPerformed

    private void PLAYER2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYER2ActionPerformed
        
    }//GEN-LAST:event_PLAYER2ActionPerformed

    private void JoinLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinLocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JoinLocalActionPerformed

    private void JoinLocal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinLocal1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JoinLocal1ActionPerformed

    private void enterIP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterIP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterIP1ActionPerformed

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
    private javax.swing.JButton JoinLocal;
    private javax.swing.JButton JoinLocal1;
    private javax.swing.JPanel MainMenu;
    private javax.swing.JButton PLAY;
    private javax.swing.JButton PLAYER1;
    private javax.swing.JButton PLAYER2;
    private javax.swing.JPanel Play;
    private javax.swing.JButton QUIT;
    private javax.swing.JTabbedPane Wrapper;
    private javax.swing.JTextField enterIP1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton returnToMainFromHelp;
    private javax.swing.JButton returnToMainFromPlay;
    // End of variables declaration//GEN-END:variables

    
}
