package mjtv.game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import mjtv.socket.Client;
import mjtv.socket.Network.STATE;
import mjtv.socket.Server;

public class Game {

    public static enum WINNER {
        NONE,
        PLAYER1,
        PLAYER2
    }

    public static final int FPS = 60, WINPOINTS = 10;
    public Fpscounter fpscounter;
    public Draw draw;
    public JFrame jf;

    public Ball ball;
    public Player[] player;
    public WINNER winner = WINNER.NONE;

    //socket
    public STATE getSocket = STATE.NONE;
    public Server server;
    public Client client;
    //socket

    public Game() {
        Frame.initSize();
    }

    public void initPlayers() {
        player = new Player[2];
        player[0] = new Player(Paddle.POS.LEFT);
        player[0].color = Color.BLUE;
        player[0].paddle.color = Color.BLUE;
        player[1] = new Player(Paddle.POS.RIGHT);
        player[1].color = Color.RED;
        player[1].paddle.color = Color.RED;
    }

    public void init() {
        fpscounter = new Fpscounter(FPS);
        ball = new Ball();
        initPlayers();
        createFrame();
    }

    private void createFrame() {
        jf = new JFrame();
        if (getSocket == STATE.SERVER) {
            jf.setTitle("Server Ping-Pong");
        } else if (getSocket == STATE.CLIENT) {
            jf.setTitle("Client Ping-Pong");
        } else {
            jf.setTitle("Ping-Pong");
        }
        jf.setIconImage(new ImageIcon("src/res/images/logo.png").getImage());
        draw = new Draw();
        draw.setPreferredSize(new Dimension((int) Frame.WIDTH, (int) Frame.HEIGHT));
        //draw.resizeListener(jf);

        jf.getContentPane().add(draw);
        jf.addKeyListener(draw);
        jf.pack(); // sizes the frame so that all its contents are at or above their preferred sizes
        jf.setLocationRelativeTo(null); // center Window
        jf.requestFocus();
        jf.setVisible(true);
    }

    public void drawBackground(Graphics2D g2) {
        g2.setColor(new Color(128, 128, 128));
        g2.fillRect(0, 0, (int) Frame.cW(1920), (int) Frame.cW(1080));
    }

    public void drawMiddleLine(Graphics2D g2) {
        float lineWidth = Frame.cW(12);
        Graphics2D g2d = (Graphics2D) g2.create();
        g2d.setColor(new Color(128, 128, 255));
        BasicStroke bs1 = new BasicStroke(lineWidth, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0, new float[]{lineWidth * 2}, 0);
        g2d.setStroke(bs1);
        g2d.drawLine((int) Frame.cW(1920 / 2), 0, (int) Frame.cW(1920 / 2), (int) Frame.cW(1080));
    }

    public void drawEndScreen(Graphics2D g2) {
        int w = (int) Frame.cW(800), h = (int) Frame.cH(650);
        g2.setColor(new Color(255, 255, 255, 200));
        g2.fillRect((int) Frame.cW(1920 / 2 - w), (int) Frame.cH(1080 / 2 - h), (int) Frame.cW(w * 2), (int) Frame.cH(h * 2));

        g2.setColor(new Color(0, 0, 0));
        if (winner == WINNER.PLAYER1) {
            Draw.drawString(g2, "Player 1 Won!", (int) Frame.cW(1920 / 2 - w), (int) Frame.cH(1080 / 2 - h), (int) Frame.cH(40));
        } else Draw.drawString(g2, "Player 2 Won!", (int) Frame.cW(1920 / 2 - w), (int) Frame.cH(1080 / 2 - h), (int) Frame.cH(40));
    }

    public void draw(Graphics2D g2) {
        drawBackground(g2);
        drawMiddleLine(g2);

        for (Player p : player) {
            p.draw(g2);
        }
        ball.draw(g2);

        if (winner != WINNER.NONE) {
            drawEndScreen(g2);
        }
    }

    public void run() {
        if (winner != WINNER.NONE) {
            return;
        }

        for (Player p : player) {
            p.run();
        }

        ball.run();

        // send own paddle and ball position
        if (getSocket == STATE.SERVER) {

            String paddelPos = player[0].paddle.x + ":" + player[0].paddle.y + ":" + player[0].paddle.x2 + ":" + player[0].paddle.y2;
            String ballPos = ball.x + ":" + ball.y + ":" + ball.xVel + ":" + ball.yVel;
            server.sendToClient(paddelPos + ":" + ballPos);
        } // send own paddle
        else if (getSocket == STATE.CLIENT) {
            String paddelPos = player[1].paddle.x + ":" + player[1].paddle.y + ":" + player[1].paddle.x2 + ":" + player[1].paddle.y2;
            client.sendToServer(paddelPos);
        }
    }

    public void scored() {
        ball.reset();
        for (Player p : player) {
            p.paddle.setDefaultPostion();
        }
    }
}