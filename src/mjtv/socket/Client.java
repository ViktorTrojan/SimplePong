package mjtv.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import mjtv.Main;
import mjtv.game.Ball;
import mjtv.game.Paddel;
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
            System.out.println("Couldn't Join the Server!");
        }
    }
    
    public void run() {
        Main.instance.game.init();
        
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
        Paddel p = Main.instance.game.player[0].paddel;
        p.x = Float.parseFloat(pos[0]);
        p.y = Float.parseFloat(pos[1]);
        p.x2 = Float.parseFloat(pos[2]);
        p.y2 = Float.parseFloat(pos[3]);
        
        Ball b = Main.instance.game.ball;
        b.x = Float.parseFloat(pos[4]);
        b.y = Float.parseFloat(pos[5]);
        b.x2 = Float.parseFloat(pos[6]);
        b.y2 = Float.parseFloat(pos[7]);
    }
}