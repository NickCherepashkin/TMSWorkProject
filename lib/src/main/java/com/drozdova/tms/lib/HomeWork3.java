package com.drozdova.tms.lib;

import java.util.Locale;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5(20);
        task6();
        task7();
    }

    public static void task1() {
        for (int i = 1; i < 14; i++) {
            System.out.print(i * 7 + " ");
        }
    }

    public static void task2() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Введены некорректные данные. Попробуйте снова.");
        }
        int num = scan.nextInt();
        if (num == 7) {
            System.out.println("Ура, вы выиграли айфон!");
        }
    }

    public static void task3() {
        String str = "I am Android developer";
        for (char item: str.toCharArray()) {
            System.out.println(item);
        }
    }

    public static void task4() {
        String str = "I am iOS developer";
        str = str.replace("iOS", "Android");
        System.out.println(str);
    }

    public static void task5(int num) {
        if (num > 1) {
            task5(num - 1);
            System.out.println("I was called " + num + " times");
        } else {
            System.out.println("I was called " + num + " time");
            return;
        }
    }

    public static void task6() {
        String str = "Information technology";
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(str.toUpperCase(Locale.ROOT));
            } else {
                System.out.println(str);
            }
        }
    }

    public static void task7() {
        String str = "I am Android developer";
        System.out.println(str.substring(5, 12));
    }
}