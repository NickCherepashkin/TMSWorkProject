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
        task_1_multiArray();
        task_2_multiArray();
        task_3_multiArray();
        task_4_multiArray();
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

    public static void task_1_multiArray() {
        int [][] mass = new int[3][3];
        Random random = new Random();
        for(int i = 0; i < mass.length; i++) {
            for(int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(20);
            }
        }

        for(int i = 0; i < mass.length; i++) {
            System.out.println(Arrays.toString(mass[i]));
        }
    }

    public static void task_2_multiArray() {
        int [][][] mass = {{{1,3,2},{1,5,8,9},{1,1}},{{4,5,6,9,9},{3,4},{5,8,7},{0,0,2,3}},{{1,4,7,2,8},{3,3,9}}};
        for(int i = 0; i < mass.length; i++) {
            for(int j = 0; j < mass[i].length; j++) {
                for(int k = 0; k < mass[i][j].length; k++) {
                    System.out.println(mass[i][j][k]);
                }
            }
        }

        for(int i = 0; i < mass.length; i++) {
            for(int j = 0; j < mass[i].length; j++) {
                System.out.print(Arrays.toString(mass[i][j]));
            }
            System.out.println();
        }
    }

    public static void task_3_multiArray() {
        int [][] mas = new int[2][6];
        Random random = new Random();
        for(int i = 0; i < mas.length; i++) {
            for(int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(20);
            }
            System.out.println(Arrays.toString(mas[i]));
        }

        sortByAsc(mas[0]);
        sortByDesc(mas[1]);
        System.out.println("After sort:");
        System.out.println(Arrays.toString(mas[0]));
        System.out.println(Arrays.toString(mas[1]));
    }

    public static void sortByAsc(int [] mas) {
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
    }

    public static void sortByDesc(int [] mas) {
        boolean isSorted = false;
        int item;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] < mas[i + 1]) {
                    item = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = item;
                    isSorted = false;
                }
            }
        }
    }

    public static void task_4_multiArray() {
        Random random = new Random();
        int len = random.nextInt(10);
        int [][][] mass = new int[len][len][len];
        for(int i = 0; i < mass.length; i++) {
            for(int j = 0; j < mass[i].length; j++) {
                for(int k = 0; k < mass[i][j].length; k++) {
                    mass[i][j][k] = random.nextInt(10);
                }
                System.out.print(Arrays.toString(mass[i][j]) + ", ");
            }
            System.out.println();
        }
    }
}