package com.niteshsynergy;

public class ThreadFQA {

    public static void main(String[] args) throws InterruptedException {

        Thread t1= new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread t1:"+Thread.currentThread().getName());
            }
        });
        Thread t2= new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread t2:"+Thread.currentThread().getName());
            }
        });
        Thread t3= new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread t3:"+Thread.currentThread().getName());
            }
        });
        Thread t4= new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread t4:"+Thread.currentThread().getName());
            }
        });
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
//        t4.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread:"+Thread.currentThread().getName());
        }
        System.exit(0);

    }
}
