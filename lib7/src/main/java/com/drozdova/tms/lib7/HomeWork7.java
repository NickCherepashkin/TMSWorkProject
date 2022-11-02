package com.drozdova.tms.lib7;

public class HomeWork7 {
    public static void main(String[] args) {
        //task 2
        String autumn = Season.AUTUMN.toString();
        System.out.println(autumn);

        // or task 2
        Season season = Season.SUMMER;
        System.out.println(season);

        // task 3
        whatILike(season);

        season.getDescription();

        // task 7
        for(Season season1: Season.values()) {
            System.out.println("Season: " + season1.toString());
            System.out.println("Average temperature: " + season1.getAverageTemp() + "C");
            System.out.println("Description: " + season1.getDescription());
            System.out.println();
        }
    }

    public static void whatILike(Season season) {
        switch (season) {
            case AUTUMN:
                System.out.println("I like autumn");
                break;
            case WINTER:
                System.out.println("I like winter");
                break;
            case SPRING:
                System.out.println("I like spring");
                break;
            case SUMMER:
                System.out.println("I like summer");
                break;
        }
    }
}