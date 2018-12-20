package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh10N043 {
    public static void main(String[] args) {
        System.out.println("Write any number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("Sum of numerals: " + calculateNumeralSum(number));
        System.out.println("Amount of numerals: " + getAmountNumerals(number));
    }

    private static int calculateNumeralSum(int number) {
        if (number != 0) {
            int numeral = number % 10;
            return numeral + calculateNumeralSum(number / 10);
        }
        return 0;
    }

    private static int getAmountNumerals(int number) {
        if (number != 0) {
            return 1 + getAmountNumerals(number / 10);
        }
        return 0;
    }
}