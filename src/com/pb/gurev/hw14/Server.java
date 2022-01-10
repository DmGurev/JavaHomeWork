package com.pb.gurev.hw14;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

    class Server {

        public static int port = 4321;
        public static LinkedList<ServerBase> connectList = new LinkedList<>();
        public static void main(String[] args) throws IOException {
            ServerSocket server = new ServerSocket(port);
            System.out.println("Echo-server is on");
            try {
                while (true) {
                    Socket socket = server.accept();
                    try {
                        connectList.add(new ServerBase(socket));
                    } catch (IOException e) {
                        socket.close();
                    }
                }
            } finally {
                server.close();
            }
        }
    }


