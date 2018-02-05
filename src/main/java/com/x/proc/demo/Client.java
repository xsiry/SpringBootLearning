package com.x.proc.demo;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by IntelliJ IDEA.
 * User: xsiry
 * Date: 27/01/2018
 * Time: 11:11 AM
 */
public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        final int length = 100;
        String host = "127.0.0.1";
        int port = 8081;
        Socket[] sockets = new Socket[length];
        for (int i=0;i<length;i++){
            sockets[i] = new Socket(host, port);
            System.out.println("Client第"+(i+1)+"次socket链接成功！");
        }

        Thread.sleep(3000);

        for(int i=0; i< length;i++) {
            sockets[i].close();
        }

    }
}
