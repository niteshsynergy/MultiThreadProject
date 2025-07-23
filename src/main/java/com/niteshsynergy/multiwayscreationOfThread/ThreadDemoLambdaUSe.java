package com.niteshsynergy.multiwayscreationOfThread;

public class ThreadDemoLambdaUSe {
    public static void main(String[] args) {

        Thread thread = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        });
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
