package com.drozdova.tms.lib14;

public class HomeWork14 {
    public static void main(String[] args) {
        Store store = new Store();
        Produser produser = new Produser(store);
        Consumer consumer = new Consumer(store);
        new Thread(produser).start();
        new Thread(consumer).start();
    }
}