package com.niteshsynergy;

import java.util.LinkedList;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producer1 = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread producer2 = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer1.start();
        producer2.start();
        consumer.start();
    }
}

class ProducerConsumer {
    private LinkedList<Integer> list = new LinkedList<>();
    private final int CAPACITY = 5;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (list.size() == CAPACITY) {
                  wait();
                }
                System.out.println("Produced: " + value);
                list.add(value++);
                notify();
                Thread.sleep(500);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (list.isEmpty()) {
                    wait();
                }
                int value = list.removeFirst();
                System.out.println("Consumed: " + value);
                notify();
                Thread.sleep(500);
            }
        }
    }
}
