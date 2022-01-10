package com.pb.gurev.hw14;

import java.io.*;
import java.net.Socket;

class ServerBase extends Thread {
    private Socket socket;
    private BufferedReader in;
    private BufferedWriter out;

    public ServerBase(Socket socket) throws IOException {
        this.socket = socket;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        start();
    }
    @Override
    public void run() {
        String message;
        try {
            message = in.readLine();
            try {
                out.write(message + "\n");
                out.flush();
            } catch (IOException ignored) {}
            try {
                while (true) {
                    message = in.readLine();
                    if(message.equals("end")) {
                        this.shutDown();
                        break;
                    }
                    System.out.println("ECHO" + message);
                    for (ServerBase sb : Server.connectList) {
                        sb.send(message);
                    }
                }
            } catch (NullPointerException ignored) {}
        } catch (IOException e) {
            this.shutDown();
        }
    }

    // Отправка сообщений
    private void send(String msg) {
        try {
            out.write(msg + "\n");
            out.flush();
        } catch (IOException ignored) {}
    }

    // Закрытие сервера
    private void shutDown() {
        try {
            if(!socket.isClosed()) {
                socket.close();
                in.close();
                out.close();
                for (ServerBase sb : Server.connectList) {
                    if(sb.equals(this)) sb.interrupt();
                    Server.connectList.remove(this);
                }
            }
        } catch (IOException ignored) {}
    }
}

