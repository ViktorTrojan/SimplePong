package mjtv.game;

import mjtv.Main;

public class Fpscounter {
    
    public long lastTime, timer;
    public int FPS, frames, updates, lastUpdates;
    public final double ns;
    double delta;
    
    public Fpscounter(int FPS) {
        this.FPS = FPS;
        ns = 1000000000d / (double)this.FPS;
        timer = System.currentTimeMillis();
        lastTime = System.nanoTime();
        frames = 0;
        updates = 0;
        delta = 0;
    }
    
    public void run() {
        long now = System.nanoTime();
        delta += (now - lastTime) / ns;
        lastTime = now;
        while (delta >= 1) { // Should run FPS times
            // Constant Updates here
            Main.instance.game.run();
            
            updates++;
            delta--;
        }
        frames++;

        if (System.currentTimeMillis() - timer > 1000) {
            //System.out.println(updates + " ups, " + frames + " fps");
            lastUpdates = updates;
            updates = 0;
            frames = 0;
            timer = System.currentTimeMillis();
        }
    }
}