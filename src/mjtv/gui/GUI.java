package mjtv.gui;

import java.awt.Color;
import mjtv.Main;
import mjtv.socket.Network.STATE;

public class GUI extends javax.swing.JFrame {
    
    public Color bg;

    public GUI() {
        initComponents();
        this.setResizable(false);
        bg = this.cancel.getBackground();
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
        returnToMainFromPlay = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ipLabel = new javax.swing.JLabel();
        ip = new javax.swing.JTextField();
        Help = new javax.swing.JPanel();
        description = new javax.swing.JTextPane();
        returnToMainFromHelp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Wrapper.setBackground(new java.awt.Color(102, 102, 102));
        Wrapper.setAlignmentX(0.0F);
        Wrapper.setAlignmentY(0.0F);

        MainMenu.setAlignmentX(0.0F);
        MainMenu.setAlignmentY(0.0F);
        MainMenu.setPreferredSize(new java.awt.Dimension(469, 315));

        play.setBackground(new java.awt.Color(0, 172, 181));
        play.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        play.setText("PLAY");
        play.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playMouseExited(evt);
            }
        });
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        help.setBackground(new java.awt.Color(0, 172, 181));
        help.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        help.setText("HELP");
        help.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                helpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                helpMouseExited(evt);
            }
        });
        help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpActionPerformed(evt);
            }
        });

        quit.setBackground(new java.awt.Color(0, 172, 181));
        quit.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        quit.setText("QUIT");
        quit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quitMouseExited(evt);
            }
        });
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
                .addContainerGap()
                .addGroup(MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(play, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(help, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainMenuLayout.setVerticalGroup(
            MainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(help, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        Wrapper.addTab("main", MainMenu);

        local.setBackground(new java.awt.Color(0, 172, 181));
        local.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        local.setText("PLAY LOCAL");
        local.setActionCommand("Local");
        local.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        local.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        local.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                localMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                localMouseExited(evt);
            }
        });
        local.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localActionPerformed(evt);
            }
        });

        host.setBackground(new java.awt.Color(0, 172, 181));
        host.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        host.setText("HOST");
        host.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        host.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        host.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hostMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hostMouseExited(evt);
            }
        });
        host.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostActionPerformed(evt);
            }
        });

        join.setBackground(new java.awt.Color(0, 172, 181));
        join.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        join.setText("JOIN");
        join.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        join.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        join.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                joinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                joinMouseExited(evt);
            }
        });
        join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinActionPerformed(evt);
            }
        });

        returnToMainFromPlay.setBackground(new java.awt.Color(0, 172, 181));
        returnToMainFromPlay.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        returnToMainFromPlay.setText("Return To Main");
        returnToMainFromPlay.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        returnToMainFromPlay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        returnToMainFromPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnToMainFromPlayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnToMainFromPlayMouseExited(evt);
            }
        });
        returnToMainFromPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMainFromPlayActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(0, 172, 181));
        cancel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        cancel.setText("CANCEL");
        cancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        cancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancel.setMaximumSize(new java.awt.Dimension(120, 60));
        cancel.setMinimumSize(new java.awt.Dimension(120, 60));
        cancel.setPreferredSize(new java.awt.Dimension(120, 60));
        cancel.setVerticalTextPosition(javax.swing.SwingConstants.CENTER);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        ipLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        ipLabel.setText("IP:");

        ip.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        ip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ip.setText("127.0.0.1");
        ip.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ipLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ip, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
            .addComponent(ip)
        );

        javax.swing.GroupLayout PlayLayout = new javax.swing.GroupLayout(Play);
        Play.setLayout(PlayLayout);
        PlayLayout.setHorizontalGroup(
            PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(local, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                        .addComponent(host, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                    .addComponent(returnToMainFromPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(join, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PlayLayout.setVerticalGroup(
            PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlayLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlayLayout.createSequentialGroup()
                        .addComponent(local, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PlayLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(join, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(PlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(returnToMainFromPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        Wrapper.addTab("play", Play);

        description.setEditable(false);
        description.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        description.setText("Pong is a Game where you have to defend your Net with a Paddel. First Player to reach 10 Points Wins! Have Fun!\nLeft Player movement: UP(W) - DOWN(S)\nRight Player movement: UP(↑) - DOWN(↓)\n\nCredits: \nM - Coding\nJ - Graphics Designer\nT - Management\nV - Coding");

        returnToMainFromHelp.setBackground(new java.awt.Color(0, 172, 181));
        returnToMainFromHelp.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        returnToMainFromHelp.setText("Return To Main");
        returnToMainFromHelp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        returnToMainFromHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnToMainFromHelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnToMainFromHelpMouseExited(evt);
            }
        });
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
                .addGroup(HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(description, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addGroup(HelpLayout.createSequentialGroup()
                        .addComponent(returnToMainFromHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        HelpLayout.setVerticalGroup(
            HelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HelpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(returnToMainFromHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void returnToMainFromPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMainFromPlayActionPerformed
        Wrapper.setSelectedIndex(0);
    }//GEN-LAST:event_returnToMainFromPlayActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        toggleAll(true);
        Main.instance.game.getSocket = STATE.NONE;
    }//GEN-LAST:event_cancelActionPerformed

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        this.cancel.setBackground(Color.red);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        this.cancel.setBackground(bg);
    }//GEN-LAST:event_cancelMouseExited

    private void joinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinMouseEntered
        this.join.setBackground(Color.GREEN);
    }//GEN-LAST:event_joinMouseEntered

    private void joinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinMouseExited
        this.join.setBackground(bg);
    }//GEN-LAST:event_joinMouseExited

    private void localMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_localMouseEntered
        this.local.setBackground(Color.GREEN);
    }//GEN-LAST:event_localMouseEntered

    private void localMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_localMouseExited
        this.local.setBackground(bg);
    }//GEN-LAST:event_localMouseExited

    private void hostMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hostMouseEntered
        this.host.setBackground(Color.GREEN);
    }//GEN-LAST:event_hostMouseEntered

    private void hostMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hostMouseExited
        this.host.setBackground(bg);
    }//GEN-LAST:event_hostMouseExited

    private void returnToMainFromPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnToMainFromPlayMouseEntered
        this.returnToMainFromPlay.setBackground(Color.BLUE);
    }//GEN-LAST:event_returnToMainFromPlayMouseEntered

    private void returnToMainFromPlayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnToMainFromPlayMouseExited
        this.returnToMainFromPlay.setBackground(bg);
    }//GEN-LAST:event_returnToMainFromPlayMouseExited

    private void returnToMainFromHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMainFromHelpActionPerformed
        Wrapper.setSelectedIndex(0);
    }//GEN-LAST:event_returnToMainFromHelpActionPerformed

    private void returnToMainFromHelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnToMainFromHelpMouseEntered
        this.returnToMainFromHelp.setBackground(Color.BLUE);
    }//GEN-LAST:event_returnToMainFromHelpMouseEntered

    private void returnToMainFromHelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnToMainFromHelpMouseExited
        this.returnToMainFromHelp.setBackground(bg);
    }//GEN-LAST:event_returnToMainFromHelpMouseExited

    private void playMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseEntered
        this.play.setBackground(Color.GREEN);
    }//GEN-LAST:event_playMouseEntered

    private void playMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseExited
        this.play.setBackground(bg);
    }//GEN-LAST:event_playMouseExited

    private void helpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseEntered
        this.help.setBackground(Color.GREEN);
    }//GEN-LAST:event_helpMouseEntered

    private void helpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpMouseExited
        this.help.setBackground(bg);
    }//GEN-LAST:event_helpMouseExited

    private void quitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseEntered
        this.quit.setBackground(Color.RED);
    }//GEN-LAST:event_quitMouseEntered

    private void quitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quitMouseExited
        this.quit.setBackground(bg);
    }//GEN-LAST:event_quitMouseExited

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton join;
    private javax.swing.JButton local;
    private javax.swing.JButton play;
    private javax.swing.JButton quit;
    private javax.swing.JButton returnToMainFromHelp;
    private javax.swing.JButton returnToMainFromPlay;
    // End of variables declaration//GEN-END:variables

}
