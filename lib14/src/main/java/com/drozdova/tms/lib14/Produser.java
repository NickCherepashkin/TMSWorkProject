package com.drozdova.tms.lib14;

public class Produser implements Runnable{
    Store store;

    public Produser(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            store.put();
        }

    }
}
