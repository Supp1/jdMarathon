package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh05N038 {
    public static void main(String[] args) {
        System.out.println("Write amount of mans return");
        Scanner scan = new Scanner(System.in);
        int numberReturn = scan.nextInt();
        System.out.println("Distance to home" + calculateDistanceFromHome(numberReturn));
        System.out.println("Man passed" + calculateAllWay(numberReturn));
    }

    private static float calculateDistanceFromHome(int numberManReturn) {
        float distance = 0;
        for (int i = 1; i < numberManReturn; i += 2) {
            distance += (float) 1 / i - (float) 1 / (i + 1);
        }
        return distance;
    }

    private static float calculateAllWay(int numberManReturn) {
        float way = 0;
        for (int i = 1; i <= numberManReturn; i++) {
            way += (float) 1 / i;
        }
        return way;
    }
}