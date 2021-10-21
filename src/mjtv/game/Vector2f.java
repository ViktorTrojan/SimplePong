package mjtv.game;

public class Vector2f {

    public float x, y;

    public Vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getLength() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public void normalize() {
        float l = getLength();
        this.x = 1 / l * x;
        this.y = 1 / l * y;
    }

    public static Vector2f normalize(float x, float y) {
        float l = (float) Math.sqrt(x * x + y * y);
        x = 1 / l * x;
        y = 1 / l * y;
        return new Vector2f(x, y);
    }
}
