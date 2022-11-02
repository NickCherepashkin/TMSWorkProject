package com.drozdova.tms.lib6;

abstract class Transport{
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

    abstract void ride();
}
