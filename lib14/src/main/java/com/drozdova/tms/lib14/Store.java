package com.drozdova.tms.lib14;

public class Store {
    private int product = 0;
    private int sum = 0;

//    synchronized void get() {
//        if(product == 0) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        product--;
//        System.out.println("consumer bought 1 product");
//        System.out.println("products available: " + product);
//        notify();
//    }

//    synchronized void put() {
//        if(product > 2) {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        try {
//            Thread.sleep(300);
//            product++;
//            System.out.println("producer made 1 product");
//            System.out.println("products available: " + product);
//            notify();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    // method get() for additional task
    synchronized void get(int count) {
        for (int i = 0; i < count; i++) {
            while(product < 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            product--;
            System.out.println("consumer bought 1 product");
            System.out.println("products available: " + product);

            sum += 1000;

            notify();
        }

        System.out.println("the store threw out " + product + " product(s)");
        product = 0;
        System.out.println("products available: " + product);

        System.out.println("amount for " + count + " product(s): " + sum);
    }

    // method put() for additional task
    synchronized void put(int count) {
        int items = count / 2 + count % 2;
        for (int i = 0; i < items; i++) {
            while(product >= count) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            product += 2;
            System.out.println("producer made 2 product");
            System.out.println("products available: " + product);
            notify();
        }
    }
}
