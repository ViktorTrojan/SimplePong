package mjtv.game;

import java.awt.Color;
import java.awt.Graphics;
import mjtv.Main;

public class Player {

    public boolean firstUP = false, firstDOWN = false;
    public boolean pressingUP = false, pressingDOWN = false;

    // Player class holds paddle, score,...
    public int score;
    public Paddle paddle;
    public Color color;

    public Player(Paddle.POS pos) {
        score = 0;
        paddle = new Paddle(pos);
    }

    public void drawScore(Graphics g) {
        int fontSize = (int) Frame.cW(100);
        if (paddle.pos == Paddle.POS.LEFT) {
            Draw.drawString(g, String.valueOf(score), (int) (Frame.cW(1920 / 2 - Draw.getStringWidth(String.valueOf(score), fontSize, g) / 2) - fontSize), (int) Frame.cH(20), (int) Frame.cH(fontSize));
        } else if (paddle.pos == Paddle.POS.RIGHT) {
            Draw.drawString(g, String.valueOf(score), (int) (Frame.cW(1920 / 2 - Draw.getStringWidth(String.valueOf(score), fontSize, g) / 2) + fontSize), (int) Frame.cH(20), (int) Frame.cH(fontSize));
        }
    }

    public void draw(Graphics g) {
        paddle.draw(g);
        g.setColor(color);
        drawScore(g);
    }

    public void eventUP() {
        pressingUP = true;
        if (pressingDOWN) {
            paddle.accel = Config.DECEL;
        } else {
            moveUP();
        }
    }

    public void eventDOWN() {
        pressingDOWN = true;
        if (pressingUP) {
            paddle.accel = Config.DECEL;
        } else {
            moveDOWN();
        }
    }

    public void releaseUP() {
        pressingUP = false;
        if (pressingDOWN) {
            moveDOWN();
        } else {
            paddle.accel = Config.DECEL;
        }
    }

    public void releaseDOWN() {
        pressingDOWN = false;
        if (pressingUP) {
            moveUP();
        } else {
            paddle.accel = Config.DECEL;
        }
    }

    public void moveUP() {
        paddle.accel = Config.ACCEL;
        paddle.yVel = -paddle.speed;
    }

    public void moveDOWN() {
        paddle.accel = Config.ACCEL;
        paddle.yVel = +paddle.speed;
    }

    public void run() {
        paddle.run();
    }
}
