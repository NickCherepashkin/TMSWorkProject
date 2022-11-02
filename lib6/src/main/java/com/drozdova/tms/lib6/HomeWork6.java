package com.drozdova.tms.lib6;

public class HomeWork6 {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(12345687, 0);
        CreditCard card2 = new CreditCard(52146258, 400);
        CreditCard card3 = new CreditCard(65898426, 20);

        card1.putMoney(125);
        card2.putMoney(548);
        card3.withdrawMoney(5);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);

        Bike bike = new Bike("Bike", 2);
        bike.ride();

        Tractor tractor = new Tractor("Tractor", 4);
        tractor.ride();
        tractor.giveBeep();
        tractor.turnOnMotor();

        Car car = new Car("Audi", 4);
        car.ride();
        car.giveBeep();
        car.turnOnMotor();

        CarTask3 car3 = new CarTask3(new Wheel());
        car3.ride();

    }
}