package mjtv.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import mjtv.socket.Client;
import mjtv.socket.Network.STATE;
import mjtv.socket.Server;

public class Game {

    public static final int FPS = 60;
    public Fpscounter fpscounter;
    public Draw draw;
    public JFrame jf;

    public Ball ball;
    public Player[] player;

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
        player[0] = new Player(Paddel.LEFT);
        player[0].color = Color.BLUE;
        player[0].paddel.color = Color.BLUE;
        player[1] = new Player(Paddel.RIGHT);
        player[1].color = Color.RED;
        player[1].paddel.color = Color.RED;
    }

    public void init() {
        ball = new Ball();
        initPlayers();
        fpscounter = new Fpscounter(FPS);
        createFrame();
    }

    private void createFrame() {
        jf = new JFrame();
        jf.setTitle("Ping-Pong");
        jf.setIconImage(new ImageIcon("src/res/images/logo.png").getImage());
        draw = new Draw();
        draw.setPreferredSize(new Dimension((int) Frame.WIDTH, (int) Frame.HEIGHT));
        jf.getContentPane().add(draw);
        jf.addKeyListener(draw);
        jf.pack(); // sizes the frame so that all its contents are at or above their preferred sizes
        jf.setLocationRelativeTo(null); // center Window
        jf.requestFocus();
        jf.setVisible(true);
    }

    public void draw(Graphics2D g) {
        g.setColor(new Color(128, 128, 128));
        g.fillRect(0, 0, (int) Frame.cW(1920), (int) Frame.cW(1080));

        for (Player p : player) {
            p.draw(g);
        }
        ball.draw(g);
    }

    public void run() {
        for (Player p : player) {
            p.run();
        }
        ball.run();

        // send own paddel and ball position
        if (getSocket == STATE.SERVER) {
            String paddelPos = player[0].paddel.x + ":" + player[0].paddel.y + ":" + player[0].paddel.x2 + ":" + player[0].paddel.y2;
            String ballPos = ball.x + ":" + ball.y + ":" + ball.x2 + ":" + ball.y2;
            server.sendToClient(paddelPos + "," + ballPos);
        } // send own paddel
        else if (getSocket == STATE.CLIENT) {
            String paddelPos = player[0].paddel.x + ":" + player[0].paddel.y + ":" + player[0].paddel.x2 + ":" + player[0].paddel.y2;
            client.sendToServer(paddelPos);
        }
    }

    public void scored() {
        ball.resetBall();
    }
}
