package com.drozdova.tms.lib5;

import java.util.ArrayList;
import java.util.List;

public class HomeWork5 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375293696584", "Samsung s10+", 150);
        Phone phone2 = new Phone("+375298979658", "Iphone 13", 200);
        Phone phone3 = new Phone("+375334569685", "Sony", 180);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        List<String> phonesList = new ArrayList<>();
        phonesList.add("+375291111111");
        phonesList.add("+375292222222");
        phonesList.add("+375293333333");
        phonesList.add("+375294444444");
        phonesList.add("+375295555555");
        phonesList.add("+375296666666");
        phonesList.add("+375297777777");

        phone1.receiveCall("Ivan");
        phone1.getNumber();
        phone2.receiveCall("Piotr");
        phone2.getNumber();
        phone3.receiveCall("Vadik");
        phone3.getNumber();

        phone1.receiveCall("Ivan", phone1.getNumber());
        phone1.sendMessage(phonesList);

        Pegion pegion = new Pegion();
        pegion.fly();

        Penguin penguin = new Penguin();

    }
}