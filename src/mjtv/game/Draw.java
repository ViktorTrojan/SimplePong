package mjtv.game;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import mjtv.Main;
import mjtv.socket.Network;

public class Draw extends JLabel implements KeyListener {

    @Override
    protected void paintComponent(Graphics g) {
        Main.instance.game.fpscounter.run();
        Main.instance.game.draw(g);
        repaint();
    }

    public static void drawString(Graphics g, String s, int x, int y, int size) {//, String fontName, int style, int size) {
        Font f = new Font("Calibri", Font.PLAIN, size);
        g.setFont(f);
        g.drawString(s, x, y + size);
    }

    public static float getStringWidth(String text, int size, Graphics g) {
        Font f = new Font("Calibri", Font.PLAIN, size);
        return g.getFontMetrics(f).stringWidth(text);
    }

    public static Graphics2D getGraphics2D(Graphics g, boolean aliasing) {
        Graphics2D g2 = (Graphics2D) g;
        if (aliasing) {
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        return g2;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W) {
            Main.instance.game.player[0].paddle.acceleration = 1f;
            Main.instance.game.player[0].paddle.yVel = -Main.instance.game.player[0].paddle.speed;
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            Main.instance.game.player[0].paddle.acceleration = 1f;
            Main.instance.game.player[0].paddle.yVel = +Main.instance.game.player[0].paddle.speed;
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            Main.instance.game.player[1].paddle.acceleration = 1f;
            Main.instance.game.player[1].paddle.yVel = -Main.instance.game.player[1].paddle.speed;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Main.instance.game.player[1].paddle.acceleration = 1f;
            Main.instance.game.player[1].paddle.yVel = +Main.instance.game.player[1].paddle.speed;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_S) {
            Main.instance.game.player[0].paddle.acceleration = 0.8f;
        } else if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
            Main.instance.game.player[1].paddle.acceleration = 0.8f;
        }

        if (Main.instance.game.winner != Game.WINNER.NONE) {
            if (e.getKeyCode() == KeyEvent.VK_I) {
                Main.instance.game.replay();
            } else if (e.getKeyCode() == KeyEvent.VK_O) {
                if (Main.instance.game.getSocket == Network.STATE.CLIENT) {
                    Main.instance.game.client.out.close();
                } else if (Main.instance.game.getSocket == Network.STATE.SERVER) {
                    Main.instance.game.server.out.close();
                }
                Main.instance.game.jf.dispose();
            }
        }
    }

    public void resizeListener(JFrame jf) {
        jf.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent componentEvent) {
                System.out.println("RESIZED!");
            }
        });
    }
}
