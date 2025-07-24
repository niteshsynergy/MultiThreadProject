package com.niteshsynergy;

public class ThreadFQA1 {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread t1: " + Thread.currentThread().getName());
                if (i % 10 == 0) Thread.yield(); // Suggest CPU share
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread t2: " + Thread.currentThread().getName());
                if (i % 10 == 0) Thread.yield();
            }
        });

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread t3: " + Thread.currentThread().getName());
                if (i % 10 == 0) Thread.yield();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread t4: " + Thread.currentThread().getName());
                if (i % 10 == 0) Thread.yield();
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread:" + Thread.currentThread().getName());
        }

        // Optional: Force JVM shutdown (to prevent t4 from finishing)
        // System.exit(0);
    }
}
