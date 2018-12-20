package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh10N042 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write number");
        int number = scan.nextInt();
        System.out.println("Write exponent");
        int exponent = scan.nextInt();
        System.out.println(calculatePower(number, exponent));
    }

    private static int calculatePower(int number, int exponent) {
        if (exponent > 0) {
            exponent--;
            return number * calculatePower(number, exponent);
        }
        return 1;
    }
}