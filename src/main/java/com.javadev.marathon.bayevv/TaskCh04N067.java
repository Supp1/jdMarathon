package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh04N067 {
    public static void main(String[] args) {
        System.out.println("Write number of day(from 0 to 365)");
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        System.out.println("Is it weekend day?" + isWeekend(day));
    }

    private static boolean isWeekend(int day) {
        return day % 7 == 0 || day % 7 == 6;
    }
}