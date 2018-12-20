package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh05N064 {
    private static final int DISTRICTS_AMOUNT = 12;

    public static void main(String[] args) {
        int district[][] = new int[DISTRICTS_AMOUNT][2];
        Scanner scan = new Scanner(System.in);
        System.out.println("Write area");
        for (int line = 0; line < district.length; line++) {
            district[line][0] = scan.nextInt(); //Writing area
        }

        System.out.println("Write amount of people");
        for (int line = 0; line < district.length; line++) {
            district[line][1] = scan.nextInt(); //Writing amount of people, who leaves there
        }
        System.out.println(calculateAverageDensity(district));
    }

    private static float calculateAverageDensity(int district[][]) {
        int sumPeople = 0;
        int sumArea = 0;
        for (int districtId = 0; districtId < district.length; districtId++) {
            sumPeople += district[districtId][1];
            sumArea += district[districtId][0];
        }
        return (float) sumPeople / sumArea;
    }
}