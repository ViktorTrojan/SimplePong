package mjtv.game;

import java.awt.Color;
import java.awt.Graphics;

public class Paddle {

    public static enum POS {
        LEFT,
        RIGHT
    }

    public static int HEIGHT = 200, WIDTH = 20, SPACE = 20;
    public float x, y, x2, y2;
    public float yVel;
    public float speed = 20;
    public float acceleration;
    public Color color;
    public POS pos;

    public Paddle(POS pos) {
        this.pos = pos;
        acceleration = 1;
        yVel = 0;
        setDefaultPostion();
    }

    public void run() {
        if (Math.abs(yVel) < 1f && acceleration < 1f) {
            yVel = 0;
        }
        yVel *= acceleration;
        y += yVel;
        y2 = y + HEIGHT;

        if (Collision.collideWallTop(y)) {
            y = 0;
            y2 = y + HEIGHT;
        }
        if (Collision.collideWallBottom(y2)) {
            y2 = 1080;
            y = y2 - HEIGHT;
        }
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect((int) Frame.cW(x), (int) Frame.cH(y), (int) Frame.cW(WIDTH), (int) Frame.cH(HEIGHT));
    }

    public void setDefaultPostion() {
        if (pos == POS.LEFT) {
            this.x = SPACE;
            this.y = 1080 / 2 - HEIGHT / 2;
            this.x2 = WIDTH + SPACE;
            this.y2 = 1080 / 2 + HEIGHT / 2;
        } else if (pos == POS.RIGHT) {
            this.x = 1920 - SPACE - WIDTH;
            this.y = 1080 / 2 - HEIGHT / 2;
            this.x2 = 1920 - SPACE;
            this.y2 = 1080 / 2 + HEIGHT / 2;
        }
    }
}
