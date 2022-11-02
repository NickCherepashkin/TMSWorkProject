package com.drozdova.tms.lib6;

public class Car extends Transport implements ICar{

    public Car(String type, int wheelsNumber) {
        super(type, wheelsNumber);
    }

    @Override
    public void turnOnMotor() {
        System.out.println(getType() + " turned on the motor.");
    }

    @Override
    public void giveBeep() {
        System.out.println(getType() + ": Beep...");
    }
}
