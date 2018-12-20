package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh05N010 {
    public static void main(String[] args) {
        System.out.println("Write dollar course");
        Scanner scan = new Scanner(System.in);
        double course = scan.nextDouble();
        double[] rub = changeMoney(course, 20);
        for (int i = 0; i < 20; i++) {
            System.out.println(i + 1 + " dollars = " + (int) rub[i] + " rubles");
        }
    }

    private static double[] changeMoney(double course, int amountDollars) {
        double[] rubles = new double[amountDollars];
        for (int i = 0; i < amountDollars; i++) {
            rubles[i] = (i + 1) * course;
        }
        return rubles;
    }
}