package com.niteshsynergy.multiwayscreationOfThread;

public class RunnableDemo01 {
    public static void main(String[] args) {
/*      Thread thread = new Thread(new Runnable(){
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        });
        thread.start();*/
      new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(i);
                }
            }
        }).start();

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }

    }
}
/*
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyRunnable" + Thread.currentThread().getName() + ":" + i);
        }
    }
}
*/
