package mjtv.socket;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import mjtv.Main;
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
        System.out.println(msg);
    }
}