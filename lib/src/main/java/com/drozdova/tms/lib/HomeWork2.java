package com.drozdova.tms.lib;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        task1();
        task2();

        MyClass1.print();
        MyClass2.print();
    }

    // Проверить является ли одно число равным другому, если нет, то вывести чему оно равно.
    public static void task1() {
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered wrong value. Try again.");
        }

        int num1 = scan.nextInt();

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered wrong value. Try again.");
        }
        int num2 = scan.nextInt();

        if (num1 != num2) {
            System.out.println("num1 = " + num1 + ", num2 = " + num2);
        } else {
            System.out.println("The numbers are equal.");
        }
    }

    // Проверить является ли одна переменная меньше чего-то и больше чего-то, в блоке елс указать
    // явную противоположность иф блоку и вывести результат
    public static void task2() {
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered wrong value. Try again.");
        }
        int num1 = scan.nextInt();

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered wrong value. Try again.");
        }

        int num2 = scan.nextInt();

        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Entered wrong value. Try again.");
        }

        int num3 = scan.nextInt();

        if ((num1 < num2) && (num1 > num3)) {
            System.out.println(num1 + " less than " + num2 + " and more than " + num3);
            switch (num1) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println(true);
                    break;
                default:
                    System.out.println(false);
            }
        } else if ((num1 >= num2) && (num1 <= num3)) {
            System.out.println(num1 + " more or equal than " + num2 + " and less or equal than " + num3);
        }
    }
}
