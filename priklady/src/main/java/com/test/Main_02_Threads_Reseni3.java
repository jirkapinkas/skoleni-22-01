package com.test;

public class Main_02_Threads_Reseni3 {

    public static int counter;

    public final static Object mutex = new Object();

    public static void main(String[] args) throws Exception {
        Runnable r1 = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                synchronized (mutex) {
                    counter++;
                }
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                synchronized (mutex) {
                    counter--;
                }
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
