package com.test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main_02_Threads_Reseni2 {

    public static int counter;

    public static Lock lock = new ReentrantLock();

    public static void main(String[] args) throws Exception {
        Runnable r1 = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                lock.lock();
                counter++;
                lock.unlock();
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                lock.lock();
                counter--;
                lock.unlock();
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
