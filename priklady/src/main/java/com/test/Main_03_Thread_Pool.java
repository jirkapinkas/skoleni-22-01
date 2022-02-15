package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main_03_Thread_Pool {

    public static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws Exception {
        long millis = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter.incrementAndGet();
            });
            executorService.submit(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter.decrementAndGet();
            });
        }

        executorService.shutdown();
        if(!executorService.awaitTermination(10, TimeUnit.MINUTES)) {
            executorService.shutdownNow();
        }

        System.out.println(counter);
        System.out.println(System.currentTimeMillis() - millis + " ns");
    }

}
