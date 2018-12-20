package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh04N115 {
    private static final int CYCLE_ANIMAL = 12;
    private static final int CYCLE_COLOR = 10;

    public static void main(String[] args) {
        System.out.println("Write year");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        System.out.println(getYearAnimal(year) + ", " + getYearColor(year));
    }

    private static String getYearAnimal(int year) {
        int animal = year % CYCLE_ANIMAL;
        switch (animal) {
            case 0:
                return ("Monkey");
            case 1:
                return ("Rooster");
            case 2:
                return ("Dog");
            case 3:
                return ("Pig");
            case 4:
                return ("Rat");
            case 5:
                return ("Cow");
            case 6:
                return ("Tiger");
            case 7:
                return ("Hare");
            case 8:
                return ("Dragon");
            case 9:
                return ("Snake");
            case 10:
                return ("Horse");
            case 11:
                return ("Sheep");
            default:
                return ("Animal Error");
        }
    }

    private static String getYearColor(int year) {
        int color = year % CYCLE_COLOR;
        switch (color) {
            case 0:
            case 1:
                return ("White");
            case 2:
            case 3:
                return ("Black");
            case 4:
            case 5:
                return ("Green");
            case 6:
            case 7:
                return ("Red");
            case 8:
            case 9:
                return ("Yellow");
            default:
                return ("Color Error");
        }
    }
}