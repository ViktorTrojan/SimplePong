package mjtv.util;

// MATHHELPER CLASS

public class MH {

    static {

    }

    public static float sin(float val) {
        return (float) Math.sin(toRAD(val));
    }

    public static float cos(float val) {
        return (float) Math.cos(toRAD(val));
    }

    public static float tan(float val) {
        return (float) Math.tan(toRAD(val));
    }

    public static float asin(float val) {
        return (float) Math.toDegrees(Math.asin(val));
    }

    public static float acos(float val) {
        return (float) Math.toDegrees(Math.acos(val));
    }

    public static float atan(float val) {
        return (float) Math.toDegrees(Math.atan(val));
    }

    public static float atan2(float y, float x) {
        return (float) Math.toDegrees(Math.atan2(-y, x));
    }

    public static float toRAD(float val) {
        return (float) Math.toRadians(val);
    }

    public static float toDEG(float val) {
        return (float) Math.toDegrees(val);
    }

    public static float abs(float val) {
        return Math.abs(val);
    }

    public static float len(float x, float y) {
        return (float) Math.sqrt(x * x + y * y);
    }

    public static float len3(float x, float y, float z) {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    // clamps a value
    public static float clamp(float d, float min, float max) {
        return Math.min(Math.max(d, min), max);
    }

    // random value in range float
    public static float random(float min, float max) {
        return (float) (Math.random() * (max - min)) + min;
    }

    // random value in range int
    public static int random(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public static float lerp(float pA, float pB, float t ) {
        return pA + t * (pB - pA);
    }
}
