package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh10N044 {
    public static void main(String[] args) {
        System.out.println("Write any number");
        Scanner scan = new Scanner(System.in);
        System.out.println(calculateArithmeticRoot(scan.nextInt()));
    }

    private static int calculateArithmeticRoot(int number) {
        if (number > 9) {
            return calculateArithmeticRoot(calculateNumeralSum(number));
        }
        return number;
    }

    private static int calculateNumeralSum(int number) {
        if (number != 0) {
            int numeral = number % 10;
            return numeral + calculateNumeralSum(number / 10);
        }
        return 0;
    }
}