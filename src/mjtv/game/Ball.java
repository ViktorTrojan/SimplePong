package mjtv.game;

import java.awt.Color;
import java.awt.Graphics;
import mjtv.Main;

public class Ball {

    public static int SIZE = 70;
    public float x, y, x2, y2;
    public float xVel, yVel;
    public float acceleration;
    public boolean collided;
    public static final float MAXXVEL = 4.2f;
    public static final float MINXVEL = 3.8f;
    public static final float MAXYVEL = 5.2f;
    public static final float MINYVEL = 4.8f;

    public Ball() {
        acceleration = 1.0007f;
        collided = false;
        resetBall();
    }

    public void paddelCollision() {
        for (Player p : Main.instance.game.player) {
            if (Collision.collideRect(x, y, x2, y2, p.paddel.x, p.paddel.y, p.paddel.x2, p.paddel.y2)) {
                xVel = -xVel;
                collided = true;
            }
//            else if (y <= p.paddel.y && y >= p.paddel.y2 && x >= p.paddel.x) {
//
//                // Get the position of the center of the ball
//                float mx = x + rad;
//                float my = y + rad;
//
//                // Get the position of the corner of the paddle
//                float px = p.paddel.x2;
//                float py = p.paddel.y;
//                if (y + SIZE > p.paddel.y) {
//                    // if the ball is below the top edge, use the bottom corner
//                    // of the paddle - else use the top corner of the paddle
//                    py += p.paddel.y2 - p.paddel.y;
//                }
//
//                // Do some trig to determine if the ball surface touched the paddle edge
//                // Calc the distance (C = sqrt(A^2 + B^2))
//                float dist = (float) Math.pow(Math.pow(mx - px, 2) + Math.pow(my - py, 2), 0.5);
//
//                // Check if the distance is within the padding zone
//                if (dist <= rad && dist >= rad) {
//                    // Get the angle of contact as Arc-sin of dx/dy
//                    float angle = (float) Math.asin(mx - px / my - py);
//
//                    // Adjust the velocity accordingly
//                    yVel = (-yVel * (float) Math.cos(angle)) + (-xVel * (float) Math.sin(angle));
//                    xVel = (-xVel * (float) Math.cos(angle)) + (-yVel * (float) Math.sin(angle));
//                }
//            }
        }
    }

    public void run() {
        x += xVel;
        y += yVel;
        x2 = x + SIZE;
        y2 = y + SIZE;

        //acceleration
        xVel *= acceleration;
        yVel *= acceleration;
        
        if (x2 <= 0) {
            Main.instance.game.player[1].score++;
            resetBall();

        }
        if (x >= 1920) {
            Main.instance.game.player[0].score++;
            resetBall();
        }

        if (Collision.collideWallTop(y)) {
            yVel = -yVel;
            collided = true;
        }
        if (Collision.collideWallBottom(y2)) {
            yVel = -yVel;
            collided = true;
        }

        paddelCollision();
        
        if (collided) {
            collided = false;
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval((int) Frame.cW(x), (int) Frame.cH(y), (int) Frame.cW(SIZE), (int) Frame.cW(SIZE));
    }

    public void resetBall() {
        randomVelocity();
        setDefaultPostion();
    }

    public void randomVelocity() {
        xVel = (float) (Math.random() * (MAXXVEL - MINXVEL) + MINXVEL);
        yVel = (float) (Math.random() * (MAXYVEL - MINYVEL) + MINYVEL);
        if (Math.random() < 0.5) {
            xVel = -xVel;
        }
        if (Math.random() < 0.5) {
            yVel = -yVel;
        }
    }

    public void setDefaultPostion() {
        this.x = 1920 / 2 - SIZE / 2;
        this.y = 1080 / 2 - SIZE / 2;
        this.x2 = this.x + SIZE;
        this.y2 = this.y + SIZE;
    }
}
