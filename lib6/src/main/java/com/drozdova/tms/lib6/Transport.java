package com.drozdova.tms.lib6;

public class Transport implements ITransport{
    private String type;
    private int wheelsNumber;

    public Transport(String type, int wheelsNumber) {
        this.type = type;
        this.wheelsNumber = wheelsNumber;
    }

    public String getType() {
        return type;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    @Override
    public void ride() {
        System.out.println(this.type + " rides...");
    }
}
