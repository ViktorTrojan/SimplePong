package mjtv.game;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Frame {

    public static float WIDTH, HEIGHT, factor = 0.6f;

    public static void initSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // get screen size
        // scale down by factor
        WIDTH = (float) (screenSize.width * factor);
        HEIGHT = (float) (screenSize.height * factor);
    }

    public static float cW(float f) {
        return f * (WIDTH / 1920);
    }

    public static float cH(float f) {
        return f * (HEIGHT / 1080);
    }
}
