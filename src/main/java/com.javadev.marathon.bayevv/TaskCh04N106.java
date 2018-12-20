package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh04N106 {

    public static void main(String[] args) {
        System.out.println("Write number of month");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        System.out.println("It is" + getSeason(month));
    }

    private static String getSeason(int month) {
        switch (month) {
            case 12:
            case 1:
            case 2:
                return "Winter";
            case 3:
            case 4:
            case 5:
                return "Spring";
            case 6:
            case 7:
            case 8:
                return "Summer";
            case 9:
            case 10:
            case 11:
                return "Autumn";
            default:
                return "Error. Write number of month (from 1 to 12)";
        }
    }
}