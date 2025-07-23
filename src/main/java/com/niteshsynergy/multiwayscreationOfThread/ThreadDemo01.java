package com.niteshsynergy.multiwayscreationOfThread;


public class ThreadDemo01 {
    public static void main(String[] args) {

        MyThreadDemo01 myThreadDemo01 = new MyThreadDemo01();
        myThreadDemo01.start();

        ThreadDemo01 myThreadDemo02 = new ThreadDemo01();
        myThreadDemo02.run();
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}
class MyThreadDemo01 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}



