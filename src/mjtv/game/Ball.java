package mjtv.game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import mjtv.Main;
import mjtv.Vector2f;

public class Ball {

    public static int SIZE = 40, SPEED = 16;

    public float x, y, x2, y2;
    public float xVel, yVel, speed = SPEED;
    public Color color;

    // trail //
    ArrayList<Vector2f> trail = new ArrayList<>();
    Color trailColor;
    // trail //

    public Ball() {
        color = new Color(255, 255, 255);
        trailColor = new Color(235, 215, 255);
        reset();
    }

    public void SetDirection(float newdirx, float newdiry) {
        Vector2f v = new Vector2f(newdirx, newdiry);
        v.normalize();
        xVel = v.x * speed;
        yVel = v.y * speed;
    }

    public float GetReflection(Paddle p, float hity) {
        // Make sure the hity variable is within the height of the paddle
        if (hity < 0) {
            hity = 0;
        } else if (hity > (p.y2 - p.y)) {
            hity = p.y2 - p.y;
        }

        // Everything above the center of the paddle is reflected upward
        // while everything below the center is reflected downward
        hity -= (p.y2 - p.y) / 2.0f;

        // Scale the reflection, making it fall in the range -2.0f to 2.0f
        return 2.0f * (hity / ((p.y2 - p.y) / 2.0f));
    }

    public void updatePosition() {
        x += xVel;
        y += yVel;
        x2 = x + SIZE;
        y2 = y + SIZE;
    }

    public boolean checkWin() {
        if (x >= 1920) {
            Main.instance.game.player[0].score++;
            if (Main.instance.game.player[0].score == Game.WINPOINTS) {
                Main.instance.game.winner = Game.WINNER.PLAYER1;
            }
            Main.instance.game.scored();
            return true;
        } else if (x2 <= 0) {
            Main.instance.game.player[1].score++;
            if (Main.instance.game.player[1].score == Game.WINPOINTS) {
                Main.instance.game.winner = Game.WINNER.PLAYER2;
            }
            Main.instance.game.scored();
            return true;
        }
        return false;
    }

    public boolean paddleCollision() {
        float my = y + SIZE / 2f;
        Paddle p1 = Main.instance.game.player[0].paddle;
        Paddle p2 = Main.instance.game.player[1].paddle;
        if (Collision.paddleCollision(this, p1)) {
            //x = p1.x2;
            speed *= 1.05;
            SetDirection(1, GetReflection(p1, my - p1.y));
            return true;
        }

        if (Collision.paddleCollision(this, p2)) {
            //x = p2.x - SIZE;
            speed *= 1.05;
            SetDirection(-1, GetReflection(p2, my - p2.y));
            return true;
        }
        return false;
    }

    public boolean wallCollision() {
        if (Collision.collideWallTop(y)) {
            y = 0;
            yVel = -yVel;
            return true;
        }
        if (Collision.collideWallBottom(y2)) {
            y = 1080 - SIZE;
            yVel = -yVel;
            return true;
        }
        return false;
    }

    public boolean checkCollision() {
        if (wallCollision()) {
            Sound.wallhit.play(70);
            return true;
        }

        if (paddleCollision()) {
            Sound.paddlehit.play(100);
            return true;
        }
        return false;
    }

    public void run() {
        trail.add(new Vector2f(x + SIZE / 2, y + SIZE / 2));
        if (trail.size() >= SIZE / 2) {
            trail.remove(0);
        }
        updatePosition();
        if (checkWin()) {
            return;
        }
        if (checkCollision()) {
            return;
        }
    }

    public void drawTrail(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
        for (int i = 0; i < trail.size() - 1; i++) {
            int j = (trail.size() - 1 - i) * (160 / SIZE);
            g2d.setColor(new Color(trailColor.getRed() - j, trailColor.getGreen() - j, trailColor.getBlue() - j));
            g2d.setStroke(new BasicStroke(Frame.cW(i+1)));
            g2d.draw(new Line2D.Float(Frame.cW(trail.get(i).x), Frame.cH(trail.get(i).y), Frame.cW(trail.get(i + 1).x), Frame.cH(trail.get(i + 1).y)));
        }
    }

    public void draw(Graphics g) {
        drawTrail(g);
        g.setColor(color);
        g.fillOval((int) Frame.cW(x), (int) Frame.cH(y), (int) Frame.cW(SIZE), (int) Frame.cW(SIZE));
    }

    public void reset() {
        trail.clear();
        speed = SPEED;
        randomVelocity();
        setDefaultPostion();
    }

    public void randomVelocity() {
        SetDirection((float) (Math.random() * 2) + 1, (float) (Math.random() * 2) + 1);
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
