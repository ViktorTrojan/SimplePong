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

    public static boolean paddleCollision(Ball b, Paddle p) {
        return (b.x2 > p.x && b.x < p.x2 && b.y2 > p.y && b.y < p.y2);
    }
}