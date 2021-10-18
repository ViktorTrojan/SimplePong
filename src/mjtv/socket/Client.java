package mjtv.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import mjtv.Main;
import mjtv.game.Ball;
import mjtv.game.Game;
import mjtv.game.Paddle;
import mjtv.socket.Network;

public class Client extends Network {

    public Client(String ip, int port) {
        this.port = port;
        this.ip = ip;
        init();
    }

    public void init() {
        try {
            initSocket(new Socket(ip, port));
            new Thread(() -> {
                run();
            }).start();

        } catch (IOException ex) {
            Main.instance.mainMenu.setSocketStatus("Couldn't find Server!");
        }
    }

    public void run() {
        Main.instance.game.init();
        Main.instance.game.getSocket = STATE.CLIENT;
        Main.instance.game.createFrame();

        String res;
        Scanner sc = new Scanner(in);
        while (sc.hasNextLine()) {
            res = sc.nextLine();
            receivedMSG(res);
        }
        // end of Thread
        sc.close();
        System.out.println("Disconnected!");
    }

    public void sendToServer(String msg) {
        out.println(msg);
        out.flush();
    }

    public void receivedMSG(String msg) {
        String[] pos = msg.split(":");
        Paddle p = Main.instance.game.player[0].paddle;
        p.x = Float.parseFloat(pos[0]);
        p.y = Float.parseFloat(pos[1]);
        p.x2 = Float.parseFloat(pos[2]);
        p.y2 = Float.parseFloat(pos[3]);

        Ball b = Main.instance.game.ball;
        b.x = Float.parseFloat(pos[4]);
        b.y = Float.parseFloat(pos[5]);
        b.xVel = Float.parseFloat(pos[6]);
        b.yVel = Float.parseFloat(pos[7]);
    }
}
