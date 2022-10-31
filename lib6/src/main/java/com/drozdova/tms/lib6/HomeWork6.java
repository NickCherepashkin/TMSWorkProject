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
    }
}