package mjtv.game;

public class Collision {
    // all the collision calculation,...
    
    public static boolean collideWallTop(float y) {
        return y <= 0;
    }
    
    public static boolean collideWallBottom(float y) {
        return y >= 1080;
    }
    
    public static boolean collideWallLeft(float x) {
        return x <= 0;
    }
    
    public static boolean collideWallRight(float x) {
        return x >= 1920;
    }
    
    public static boolean collideRectHorizontal(float x, float x2, float x3, float x4) {
        return x <= x4 && x2 >= x3;
    }
    
    public static boolean collideRectVertical(float y, float y2, float y3, float y4) {
        return y <= y4 && y2 >= y3;
    }
    
    public static boolean collideRect(float x, float y, float x2, float y2, float x3, float y3, float x4, float y4) {
        return (collideRectHorizontal(x, x2, x3, x4) && collideRectVertical(y, y2, y3, y4));
    }
    /*
    
    public static boolean collideRectHorizontal(float x, float x2, float x3, float x4, int location) {
        if(location==Paddel.LEFT){
            return x <= x4;
        }else if(location==Paddel.RIGHT){
            return x2 >= x3;
        }
        return false;
    }
    
    public static boolean collideRectVertical(float y, float y2, float y3, float y4) {
        return y <= y4 && y2 >= y3;
    }
    
    public static boolean collideRect(float x, float y, float x2, float y2, float x3, float y3, float x4, float y4, int location) {
        return (collideRectHorizontal(x, x2, x3, x4, location) && collideRectVertical(y, y2, y3, y4));
    }
*/
    
}
