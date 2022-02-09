package com.test;

import java.util.concurrent.atomic.AtomicInteger;

public class Main_02_Threads_Reseni1 {

    // AtomicInteger, AtomicLong, AtomicBoolean
    // Collections.synchronizedXXX()
    public static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {
        Runnable r1 = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.incrementAndGet();
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                counter.decrementAndGet();
            }
        };
        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r2);

        thread1.start();
        thread2.start();

        // blokujici operace
        thread1.join();
        thread2.join();

        System.out.println(counter);
    }

}
