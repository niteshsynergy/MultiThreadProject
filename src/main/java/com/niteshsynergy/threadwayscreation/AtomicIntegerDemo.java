package com.niteshsynergy.threadwayscreation;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
    // Atomic Variable
    static AtomicInteger atomicInteger = new AtomicInteger(0);

    static int counter=0;
    public static void main(String[] args) throws InterruptedException {

        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread1.start();
        myThread2.start();

        Thread.sleep(1000);
        System.out.println(counter);
        System.out.println(atomicInteger.get());


    }

}

class MyThread1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            AtomicIntegerDemo.counter++;
            AtomicIntegerDemo.atomicInteger.incrementAndGet();
        }
    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            AtomicIntegerDemo.counter++;
            AtomicIntegerDemo.atomicInteger.incrementAndGet();
        }
    }
}



