package com.pb.gurev.hw13;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer extends Thread {
    BlockingQueue<String> bq;
    Producer() {
        bq = new ArrayBlockingQueue<String>(10);
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                System.out.println("\"Produce\": " + i);
                bq.put("" + i);
                Thread.sleep(15);
            } catch (InterruptedException e) {
            }
        }
    }
}
