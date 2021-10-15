package mjtv.game;

import java.awt.Color;
import java.awt.Graphics;
import mjtv.Main;

public class Paddel {
    // Paddel class holds position, xvel,...
    public static int HEIGHT = 200, WIDTH = 22, SPACE = 20;
    public float x, y, x2, y2;
    public float yVel;
    public float speed;
    public float acceleration;
    public int location; 
    public static final int LEFT = 0;
    public static final int RIGHT = 1;  
    public static final float DEFAULTSPEED = 7.0f;
    public Color color;
    
    public Paddel(int location) {
        this.location = location;
        setDefaultPostion();
        yVel = 0;
        speed = DEFAULTSPEED;
        acceleration = 1.001f;
    }
    
    public void run() {  
            y += yVel;
            y2 = y + HEIGHT;

            speed *= acceleration;

            if (Collision.collideWallTop(y)) {
                y = 0;
                y2 = y+HEIGHT;
            }
            if (Collision.collideWallBottom(y2)) {
                y2 = 1080;
                y = y2-HEIGHT;
            }
    }
    
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect((int) Frame.cW(x), (int) Frame.cH(y), (int)Frame.cW(WIDTH), (int)Frame.cW(HEIGHT));
    }
    
    public void setDefaultPostion(){
        if(location==LEFT){
            this.x = SPACE;
            this.y = 1080/2-HEIGHT/2;
            this.x2 = WIDTH+SPACE;
            this.y2 = 1080/2+HEIGHT/2;
        }else if(location==RIGHT){
            this.x = 1920-SPACE-WIDTH;
            this.y = 1080/2-HEIGHT/2;
            this.x2 = 1920-SPACE;
            this.y2 = 1080/2+HEIGHT/2;
        } 
    }
}
