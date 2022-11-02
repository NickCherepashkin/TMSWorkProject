package com.drozdova.tms.lib14;

public class Consumer implements Runnable{
    Store store;

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.get(5);
    }
}
