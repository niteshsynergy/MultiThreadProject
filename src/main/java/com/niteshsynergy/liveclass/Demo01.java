package com.niteshsynergy.liveclass;

public class Demo01 {

    public static void main(String[] args) {
       // Thread creation Using Lambda Express
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread.start();



    }
}
