package mjtv.game;


import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import mjtv.Main;

public class FramerateHandler {

    public final static int UPS = 60;  // UPS = updates per second should be the same for everyone
    public static int FPS = 80; // FPS = frames per second depends on the monitor refresh rate
    public long lastTime;
    public final double ns = 1000000000d / (double) UPS;
    double delta;

    public FramerateHandler() {
        // fetch refreshrate from monitor
        if (FPS == 0) {
            FPS = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0].getDisplayMode().getRefreshRate();
        }
        
        delta = 0;
        
        lastTime = System.nanoTime();
    }

    // PUT YOUR UPDATE LOGIC HERE !
    private void update() {
        Main.instance.game.run();
    }

    // PUT YOUR RENDER LOGIC HERE !
    private void render(Graphics g) {
        Main.instance.game.draw(g);
    }

    public void run(Graphics g) {
        long now = System.nanoTime();
        delta += (now - lastTime) / ns;
        lastTime = now;

        long dur = System.nanoTime();
        while (delta >= 1) { // updates get processed here
            update();
            delta--;
        }

        render(g);

        int latency = (int) ((System.nanoTime() - dur) / (1000000d));
        sleep((int)(1000 / FPS - latency - 1));
    }

    public void sleep(int ms) {
        if (ms <= 0) { // if ms are 0 or smaller dont sleep
            return;
        }
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            // restore interrupted thread
            Thread.currentThread().interrupt();
        }
    }
}
