package com.niteshsynergy;

import com.niteshsynergy.threadwayscreation.AtomicIntegerDemo;

import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMapDemo {
    static  ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<Integer, Integer>();

    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(concurrentHashMap);
    }
    static class MyThread1 extends Thread {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
            concurrentHashMap.put(i, i);
            }
        }
    }
    static class MyThread2 extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                concurrentHashMap.put(i, i);
            }
        }
    }

}
