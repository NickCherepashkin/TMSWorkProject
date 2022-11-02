package com.drozdova.tms.lib6;

public class Bike extends Transport{
    public Bike(String type, int wheelsNumber) {
        super(type, wheelsNumber);
    }

    @Override
    void ride() {
        System.out.println("Bike rides...");
    }
}
