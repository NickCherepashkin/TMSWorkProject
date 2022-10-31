package com.drozdova.tms.lib;

public class HomeWork13 {
    public static void main(String [] args) throws InterruptedException {
//        task1();
        task2();
    }

    // task1 with using method sleep()
    public static void task1() {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("start first thread");
            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    System.out.println("start second thread");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        thread1.start();
        thread2.start();
    }

    public static void task2() {
        Thread thread1 = new Thread(new MyThread1());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();

        Thread thread3 =  new Thread(){
            @Override
            public void run() {
                super.run();
                System.out.print("in thread");
            }
        };

        thread3.start();

        Runnable thread4 =  new Runnable(){
            @Override
            public void run() {
                System.out.print("in runnable");
            }
        };

        Thread thread = new Thread(thread4);
        thread.start();
    }
}