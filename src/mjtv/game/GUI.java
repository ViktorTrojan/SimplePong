package mjtv.game;

public class GUI extends javax.swing.JFrame {

    public static GUI e;

    public GUI() {
        initComponents();
        e = this;
    }

    public void toggleAll(boolean flag) {
//        PLAYER1.setEnabled(flag);
//        PLAYER2.setEnabled(flag);
//        IP.setEnabled(flag);
//        JOIN.setEnabled(flag);
//        STARTSERVER.setEnabled(flag);
    }

    public void setSocketStatus(String s) {
//        SOCKETSTATUS.setText(s);
    }

    public void setIndex(int index) {
        styleTabbedPane1.setSelectedIndex(index);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        styleTabbedPane1 = new mjtv.game.StyleTabbedPane();
        uI_MainMenu1 = new mjtv.game.UI_MainMenu();
        uI_Multiplayer1 = new mjtv.game.UI_Multiplayer();
        uI_Settings1 = new mjtv.game.UI_Settings();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        styleTabbedPane1.addTab("tab1", uI_MainMenu1);
        styleTabbedPane1.addTab("tab2", uI_Multiplayer1);
        styleTabbedPane1.addTab("tab3", uI_Settings1);

        getContentPane().add(styleTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -34, 510, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private mjtv.game.StyleTabbedPane styleTabbedPane1;
    private mjtv.game.UI_MainMenu uI_MainMenu1;
    private mjtv.game.UI_Multiplayer uI_Multiplayer1;
    private mjtv.game.UI_Settings uI_Settings1;
    // End of variables declaration//GEN-END:variables

}
