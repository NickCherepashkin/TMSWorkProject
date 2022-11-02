package com.drozdova.tms.lib8;

public class HomeWork8 {
    public static void main(String[] args) {
        Car car = new Car("Audi A100", 200, 40000);
        try {
            car.start();
        } catch (CarException e) {
            System.out.println("Error: " + e);
        }
    }
}