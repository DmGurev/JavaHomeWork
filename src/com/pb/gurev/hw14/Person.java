package com.pb.gurev.hw14;
import java.lang.NullPointerException;
public class Person {

    public static String ipAdress = "localhost";
    public static int port = 4321;

    public static void main(String[] args) {
        new PersonBase(ipAdress, port);
    }
}