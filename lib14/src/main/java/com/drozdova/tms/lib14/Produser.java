package com.drozdova.tms.lib14;

public class Produser implements Runnable{
    Store store;

    public Produser(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.put(5);
    }
}
