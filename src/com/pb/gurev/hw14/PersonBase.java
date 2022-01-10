package com.pb.gurev.hw14;

import java.io.*;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

    class PersonBase  {
        private Socket socket;
        private BufferedReader in;
        private BufferedWriter out;
        private BufferedReader inputUser;
        private String addr;
        private int port;
        private String nick;
        private Date dateTime;
        private String stringTime;
        private SimpleDateFormat time;

        public PersonBase (String addr, int port) {
            this.addr = addr;
            this.port = port;
            try {
                this.socket = new Socket(addr, port);
            } catch (IOException e) {
                System.err.println("Connection Error");
            }
            try {
                inputUser = new BufferedReader(new InputStreamReader(System.in));
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                this.inputNick();
                new ReadMsg().start();
                new WriteMsg().start();
            } catch (IOException e) {
                PersonBase.this.personShutdown();
            }
        }
        private void inputNick() {
            System.out.print("Input your Nick: ");
            try {
                nick = inputUser.readLine();
                out.write("You`re in Chat, " + nick + "! Disconnect - \"end\".\n");
                out.flush();
            } catch (IOException ignored) {
            }
        }
        private void personShutdown() {
            try {
                if (!socket.isClosed()) {
                    socket.close();
                    in.close();
                    out.close();
                }
            } catch (IOException ignored) {}
        }
        private class ReadMsg extends Thread {
            @Override
            public void run() {
                String str;
                try {
                    while (true) {
                        str = in.readLine();
                        if (str.equals("end")) {
                                PersonBase.this.personShutdown();
                            break;
                        }
                        System.out.println(str);
                    }
                } catch (IOException e) {
                    PersonBase.this.personShutdown();
                }
            }
        }
        public class WriteMsg extends Thread {
            @Override
            public void run() {
                while (true) {
                    String userMessage;
                    try {
                        dateTime = new Date();
                        time = new SimpleDateFormat("HH:mm:ss");
                        stringTime = time.format(dateTime);
                        userMessage = inputUser.readLine();
                        if (userMessage.equals("end")) {
                            out.write("end" + "\n");
                            PersonBase.this.personShutdown();
                            break;
                        } else {
                            out.write("(" + stringTime + ") " + nick + ": " + userMessage + "\n");
                        }
                        out.flush();
                    } catch (IOException e) {
                        PersonBase.this.personShutdown();
                    }
                }
            }
        }
    }
