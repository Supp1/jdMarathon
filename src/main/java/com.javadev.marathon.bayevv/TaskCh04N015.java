package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh04N015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write today date");
        int monthToday = scan.nextInt();
        int yearToday = scan.nextInt();
        System.out.println("Write birthday date");
        int monthBd = scan.nextInt();
        int yearBd = scan.nextInt();
        System.out.println("Your age is" + countAge(monthToday, yearToday, monthBd, yearBd));
    }

    private static int countAge(int monthToday, int yearToday, int monthBd, int yearBd) {
        int age = yearToday - yearBd;
        if (monthToday < monthBd) {
            age -= 1;
        }
        return age;
    }
}