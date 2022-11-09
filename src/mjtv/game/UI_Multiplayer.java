package mjtv.game;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import mjtv.Main;
import mjtv.socket.Client;
import mjtv.socket.Network;
import mjtv.socket.Server;

public class UI_Multiplayer extends javax.swing.JPanel {

    public UI_Multiplayer() {
        FlatLightLaf.setup();
        UIManager.put("TextComponent.arc", 10);
        initComponents();
        
        inp_ip.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "127.0.0.1");
    }
    
    public void toggleAll(boolean flag) {
        lbl_hostIP.setEnabled(flag);
        btn_host.setEnabled(flag);
        btn_join.setEnabled(flag);
        inp_ip.setEnabled(flag);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new components.panel.Panel();
        btn_join = new components.button.Button();
        inp_ip = new javax.swing.JTextField();
        lbl_hostIP = new javax.swing.JLabel();
        btn_host = new components.button.Button();
        btn_back = new components.button.Button();
        hostIP = new javax.swing.JLabel();

        setBackground(new java.awt.Color(243, 243, 251));

        panel1.setBackground(new java.awt.Color(230, 230, 244));

        btn_join.setText("Join");
        btn_join.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btn_join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_joinActionPerformed(evt);
            }
        });

        inp_ip.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        lbl_hostIP.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        lbl_hostIP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_hostIP.setText("Host IP:");

        btn_host.setText("Host");
        btn_host.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btn_host.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hostActionPerformed(evt);
            }
        });

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/images/back.png"))); // NOI18N
        btn_back.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        hostIP.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        hostIP.setForeground(new java.awt.Color(36, 84, 40));
        hostIP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(lbl_hostIP, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inp_ip, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_join, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_host, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hostIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_hostIP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inp_ip)
                    .addComponent(btn_join, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_host, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hostIP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        hostIP.setText("");
        toggleAll(true);
        GUI.e.setIndex(0);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_hostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hostActionPerformed
        toggleAll(false);
        Main.instance.game.server = new Server(Network.PORT);
        hostIP.setText(Main.instance.game.server.getHostIP());
    }//GEN-LAST:event_btn_hostActionPerformed

    private void btn_joinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_joinActionPerformed
        Main.instance.game.client = new Client(inp_ip.getText(), Network.PORT);
    }//GEN-LAST:event_btn_joinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.button.Button btn_back;
    private components.button.Button btn_host;
    private components.button.Button btn_join;
    private javax.swing.JLabel hostIP;
    private javax.swing.JTextField inp_ip;
    private javax.swing.JLabel lbl_hostIP;
    private components.panel.Panel panel1;
    // End of variables declaration//GEN-END:variables
}
