package com.drozdova.tms.lib9;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class HomeWork9 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапазон:");
        int numFrom = scanner.nextInt();
        int numTo = scanner.nextInt();
        int lenMas;
        if ((numTo + numFrom) % 2 == 0 ) {
            lenMas = (numTo + numFrom) / 2 - 1;
        } else {
            lenMas = (numTo - numFrom) / 2 + 1;
        }
        int [] mas = new int[lenMas];

        System.out.println(lenMas);

        int count = 0;
        for (int i = numFrom; i <= numTo; i++) {
            if (i % 2 == 0) {
                mas[count] = i;
                count++;
            }
        }

        for(int item: mas) {
            System.out.print(item + " ");
        }

        for(int item: mas) {
            System.out.println(item);
        }
    }

    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапазон:");
        int numFrom = scanner.nextInt();
        int numTo = scanner.nextInt();
        int lenMas;
        if ((numTo + numFrom) % 2 == 1 ) {
            lenMas = (numTo - numFrom) / 2 + 1;
        } else {
            lenMas = (numTo + numFrom) / 2;
        }
        int [] mas = new int[lenMas];

        System.out.println(lenMas);

        int count = 0;
        for (int i = numFrom; i <= numTo; i++) {
            if (i % 2 == 1) {
                mas[count] = i;
                count++;
            }
        }

        for(int item: mas) {
            System.out.print(item + " ");
        }
        System.out.println();
        for(int i = mas.length - 1; i >= 0 ; i-- ) {
            System.out.print(mas[i] + " ");
        }
    }

    public static void task3() {
        int [] mas = new int[15];
        Random random = new Random();
        int item;
        int countEven = 0;
        for(int i = 0; i < 15; i++) {
            item = random.nextInt(100);
            System.out.print(item + " ");
            if (item % 2 == 0) {
                countEven++;
            }
        }
        System.out.println();
        System.out.println("even: " + countEven);
    }

    public static void task4() {
        int [] mas = new int[20];
        Random random = new Random();
        for(int i = 0; i < 20; i++) {
            mas[i] = random.nextInt(21);
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        for(int i = 1; i < mas.length; i++) {
            if (i % 2 == 1) {
                mas[i] = 0;
            }
        }

        for (int ma : mas) {
            System.out.print(ma + " ");
        }
    }

    public static void task5() {
        int [] mas = new int[12];
        Random random = new Random();
        for(int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(21);
        }

        int max = 0;
        int indexMax = 0;
        for(int i = 0; i < mas.length; i++) {
            if(mas[i] >= max) {
                max = mas[i];
                indexMax = i;
            }
        }
        System.out.println("Max element: " + max);
        System.out.println("Max element index: " + indexMax);
    }

    public static void task6() {
        int[] mas = {21, 71, 55, 20, 29, 5, 7, 10, 19, 18, 23, 70};

        boolean isSorted = false;
        int item;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    item = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = item;
                    isSorted = false;
                }
            }
        }

        System.out.println(Arrays.toString(mas));
    }

    public static void task7() {
        int [] mas = {88,39,22,44,65,1,12,54,67,20,2,9,39};

        int currentItem;
        int newIndex;
        for(int i = 1; i < mas.length; i++) {
            currentItem = mas[i];
            newIndex = i - 1;

            while((newIndex >= 0) && currentItem < mas[newIndex]) {
                mas[newIndex + 1] = mas[newIndex];
                newIndex--;
            }

            mas[newIndex + 1] = currentItem;
        }

        System.out.println(Arrays.toString(mas));
    }
}   