package mjtv.game;

import java.awt.Color;
import java.awt.Graphics;

public class Player {
    // Player class holds paddel, score,...
    public int score;
    public Paddel paddel;
    public static float scoreXMiddleLineSpace, scoreYSpace;
    public static int fontSize;
    public Color color;
    
    public Player(int location) {
        score = 0;
        paddel = new Paddel(location);
        fontSize = 100;
        scoreXMiddleLineSpace = 25.0f;
        scoreYSpace = -15.0f;
    }
    
    public void draw(Graphics g) {
        paddel.draw(g);
        g.setColor(color);
        if(paddel.location==Paddel.LEFT){
            Draw.drawString(g, String.valueOf(score), (int)(Frame.cW(1920/2-scoreXMiddleLineSpace)-100), (int)Frame.cH(scoreYSpace), (int)Frame.cH(fontSize));
        }else if(paddel.location==Paddel.RIGHT){
            Draw.drawString(g, String.valueOf(score), (int)Frame.cW(1920/2+scoreXMiddleLineSpace), (int)Frame.cH(scoreYSpace), (int)Frame.cH(fontSize));
        }
    }
    
    public void run(){
        paddel.run();
    }
    
    public boolean checkIfWin(int pointsToWin){
        return score>=pointsToWin;
    }
    
    
}
