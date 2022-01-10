package com.pb.gurev.hw13;
import java.util.concurrent.TimeUnit;

class Consumer extends Thread {
    Producer prod;
    Consumer(Producer prod) {
        this.prod = prod;
    }

    public void run() {
        for(int i = 0; i < 10; i++)
        {
            try {
                System.out.println("\"Consume\": " + prod.bq.poll(10, TimeUnit.SECONDS));
                Thread.sleep(5000);
            } catch (InterruptedException e) {
            }
        }
    }
}
