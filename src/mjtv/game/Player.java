package mjtv.game;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

    // Player class holds paddle, score,...
    public int score;
    public Paddle paddle;
    public Color color;

    public Player(Paddle.POS pos) {
        score = 0;
        paddle = new Paddle(pos);
    }

    public void drawScore(Graphics g) {
        int fontSize = (int) Frame.cH(100);
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

    public void run() {
        paddle.run();
    }
}