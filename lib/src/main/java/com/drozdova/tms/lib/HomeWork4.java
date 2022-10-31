package com.drozdova.tms.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        task1();
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

        System.out.println("Min len = " + array.get(minIndex).length() + ", " + array.get(minIndex));
        System.out.println("Max len = " + array.get(maxIndex).length() + ", " + array.get(maxIndex));
    }
}
