package mjtv;

import java.io.IOException;
import javax.imageio.ImageIO;
import mjtv.game.Game;
import mjtv.gui.GUI;

public class Main {
    public static Main instance;
    public GUI mainMenu;
    public Game game;

    public Main() {
        instance = this;
        createMainMenu();
        game = new Game();
    }

    public void createMainMenu() {
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        mainMenu = new GUI();
        mainMenu.setTitle("Main Menu"); // set the Title
        try {
            mainMenu.setIconImage(ImageIO.read(getClass().getResource("/res/images/Logo.png")));
        } catch (IOException ex) {
            System.out.println("Couldn't Load Logo for Main Menu!");
        }
        mainMenu.setLocationRelativeTo(null); // Center Window on Screen
        mainMenu.setVisible(true); // Make Window Visible
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}