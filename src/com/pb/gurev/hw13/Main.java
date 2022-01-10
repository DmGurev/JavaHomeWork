package com.pb.gurev.hw13;

public class Main {
    public static void main(String[] args) {
        Producer thr1 = new Producer();
        Consumer thr2 = new Consumer(thr1);
        Thread t1 = new Thread(thr1);
        Thread t2 = new Thread(thr2);
        t2.start();
        t1.start();
    }
}