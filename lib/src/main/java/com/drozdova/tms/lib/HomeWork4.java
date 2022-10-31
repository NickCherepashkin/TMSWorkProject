package com.drozdova.tms.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    // Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
    public static void task1() {
        List<String> array = new ArrayList<>();
        System.out.println("Введите количетво n строк...");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Ошибка ввода");
        }

        int n = scan.nextInt();
        int minLen = Integer.MAX_VALUE, maxLen = 0;
        int minIndex = 0, maxIndex = 0, index = 0;
        String item;
        while (index < n) {
            item = scan.nextLine();
            array.add(item);
            if(minLen > item.length()) {
                minLen = item.length();
                minIndex = index;
            }
            if (maxLen < item.length()) {
                maxLen = item.length();
                maxIndex = index;
            }
            index++;
        }

        System.out.println( "Min len = " + array.get(minIndex).length() + ", " + array.get(minIndex));
        System.out.println("Max len = " + array.get(maxIndex).length() + ", " + array.get(maxIndex));
    }

    // Ввести n строк с консоли. Вывести на консоль среднюю длину строк и те строки, длина которых больше средней.
    // используйте StringBuilder для вывода всех строк, которые больше средней длины.
    public static void task2() {
        List<String> array = new ArrayList<>();
        System.out.println("Введите количетво n строк...");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Ошибка ввода");
        }

        int n = scan.nextInt();
        int averageLen = 0;
        int index = 0;
        String item;
        while (index < n) {
            item = scan.nextLine();
            array.add(item);
            averageLen += item.length();
            index++;
        }

        averageLen /= n;

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            item = array.get(i);
            if (item.length() > averageLen) {
                builder.append(item);
                builder.append("\n");
            }
        }

        System.out.println(builder);
    }

    // Ввести три строки с консоли. А затем:
    // 1. Выведите на экран третью строку в неизменном виде.
    // 2. Выведите на экран вторую строку, предварительно преобразовав ее к
    // Нижнему регистру.
    // 3. Выведите на экран первую строку, предварительно перевернув ее.
    public static void task3() {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();
        String str3 = scan.nextLine();

        System.out.println(str3);
        System.out.println(str2.toLowerCase(Locale.ROOT));
        StringBuffer buffer = new StringBuffer(str1);
        System.out.println(buffer.reverse());
    }
}
