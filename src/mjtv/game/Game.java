package mjtv.game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import mjtv.socket.Client;
import mjtv.socket.Network;
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

    public void initWithFrame() {
        init();
        createFrame();
    }
    
    public void init() {
        fpscounter = new Fpscounter(FPS);
        ball = new Ball();
        initPlayers();
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
        jf.setResizable(false); 
        jf.getContentPane().add(draw);
        jf.addKeyListener(draw);
        jf.pack(); // sizes the frame so that all its contents are at or above their preferred sizes
        jf.setMaximumSize(jf.getPreferredSize());
        jf.setMinimumSize(jf.getPreferredSize());
        jf.setPreferredSize(jf.getPreferredSize());
        jf.setSize(jf.getPreferredSize());
        jf.setLocationRelativeTo(null); // center Window
        jf.requestFocus();
        jf.setVisible(true);
    }

    public void drawBackground(Graphics g) {
        g.setColor(new Color(128, 128, 128));
        g.fillRect(0, 0, (int) Frame.cW(1920), (int) Frame.cH(1080));
    }

    public void drawMiddleLine(Graphics g) {
        float lineWidth = Frame.cW(12);
        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setColor(new Color(128, 128, 255));
        BasicStroke bs1 = new BasicStroke(lineWidth, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0, new float[]{lineWidth * 2}, 0);
        g2d.setStroke(bs1);
        g2d.drawLine((int) Frame.cW(1920 / 2), (int) Frame.cH(0), (int) Frame.cW(1920 / 2), (int) Frame.cH(1080));
    }

    public void drawEndScreen(Graphics g) {
        int w = (int)Frame.WIDTH/2;
        int h = (int)Frame.HEIGHT*3/8;
        int x = (int)Frame.WIDTH/2-w/2;
        int y = (int)Frame.HEIGHT/2-h/2;
        int fontWinSize = h/4;
        int fontLoseSize = h/5;
        int fontReplayQuitSize = h/8;
        int space = h/14;
        int border = (int) Frame.cW(12);
        
        //background
        g.setColor(new Color(128, 128, 255));
        g.fillRect(x, y, w, h);
        
        //border
        g.setColor(new Color(0, 0, 0));        
        g.fillRect(x,          y,           w,        border);
        g.fillRect(x,          y,           border,   h);
        g.fillRect(x,          y+h-border,  w,        border);
        g.fillRect(x+w-border, y,           border,        h);
        
        //win + lose message
        g.setColor(new Color(0, 0, 0));
        String messageWin = "", messageLose = "";
        if(winner == WINNER.PLAYER1){
            messageWin = "Left Player won!";
            messageLose = "Right Player lost!";
        }else{
            messageWin = "Right Player won!";
            messageLose = "Left Player lost!";
        }
        Draw.drawString(g, messageWin, x+w/2-(int)Draw.getStringWidth(messageWin, fontWinSize, g)/2, y+space, fontWinSize);
        Draw.drawString(g, messageLose, x+w/2-(int)Draw.getStringWidth(messageLose, fontLoseSize, g)/2, y+2*space+fontLoseSize, fontLoseSize);
        
        //replay message
        String messageReplay = "Press (I) to Replay";
        Draw.drawString(g, messageReplay, x+w/4-(int)Draw.getStringWidth(messageReplay, fontReplayQuitSize, g)/2, y+h-2*space-fontReplayQuitSize, fontReplayQuitSize);
        
        //quit message
        String messageQuit = "Press (O) to Quit";
        Draw.drawString(g, messageQuit, x+w*3/4-(int)Draw.getStringWidth(messageQuit, fontReplayQuitSize, g)/2, y+h-2*space-fontReplayQuitSize, fontReplayQuitSize);
    }

    public void draw(Graphics g) {
        drawBackground(g);
        drawMiddleLine(g);

        for (Player p : player) {
            p.draw(g);
        }
        ball.draw(g);

        if (winner != WINNER.NONE) {
            drawEndScreen(g);
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

    public void reset() {
        ball.reset();
        for (Player p : player) {
            p.paddle.setDefaultPostion();
        }
    }
    
    public void replay() {
        winner = WINNER.NONE;
        init();
        reset();
        run();
    }
    
    public void initServer(){
        if(server==null){
            server = new Server(Network.PORT);
        }
    }
    
    public void initClient(String ip){
        if(client==null){
            client = new Client(ip, Network.PORT);
        }
    }
}