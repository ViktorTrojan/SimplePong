package mjtv.socket;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import mjtv.Main;
import mjtv.socket.Network;

public class Server extends Network {

    public Server(int port) {
        this.port = port;
        openServerSocket();
        new Thread(() -> {
            run();
        }).start();
    }

    public void sendToClient(String msg) {
        out.println("SERVER: " + msg);
    }

    public void receivedMSG(String msg) {
        System.out.println(msg);
    }

    public void run() {
        openSocket();
        initStreams();
        System.out.println("Player Joined!");
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
}
