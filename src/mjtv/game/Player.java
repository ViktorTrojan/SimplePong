package mjtv.game;

import java.awt.Color;
import java.awt.Graphics2D;

public class Player {

    // Player class holds paddle, score,...
    public int score;
    public Paddle paddle;
    public Color color;

    public Player(Paddle.POS pos) {
        score = 0;
        paddle = new Paddle(pos);
    }

    public void drawScore(Graphics2D g2) {
        int fontSize = (int) Frame.cW(100);
        if (paddle.pos == Paddle.POS.LEFT) {
            Draw.drawString(g2, String.valueOf(score), (int) (Frame.cW(1920 / 2 - Draw.getStringWidth(String.valueOf(score), fontSize, g2) / 2) - fontSize), (int) Frame.cH(20), (int) Frame.cH(fontSize));
        } else if (paddle.pos == Paddle.POS.RIGHT) {
            Draw.drawString(g2, String.valueOf(score), (int) (Frame.cW(1920 / 2 - Draw.getStringWidth(String.valueOf(score), fontSize, g2) / 2) + fontSize), (int) Frame.cH(20), (int) Frame.cH(fontSize));
        }
    }

    public void draw(Graphics2D g2) {
        paddle.draw(g2);
        g2.setColor(color);
        drawScore(g2);
    }

    public void run() {
        paddle.run();
    }
}