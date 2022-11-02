package com.drozdova.tms.lib14;

public class Store {
    private int product = 0;
    synchronized void get() {
        if(product == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println("consumer bought 1 product");
        System.out.println("products available: " + product);
        notify();
    }

    synchronized void put() {
        if(product == 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        product++;
        System.out.println("producer made 1 product");
        System.out.println("products available: " + product);
        notify();
    }
}
