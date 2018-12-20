package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh10N046 {
    public static void main(String[] args) {
        System.out.println("Write first number of sequence");
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        System.out.println("Write denominator");
        int denominator = scan.nextInt();
        System.out.println("Write serial of number you want to find");
        int serialNumber = scan.nextInt();
        System.out.println("Number is: " + getNumber(serialNumber, firstNumber, denominator));
        System.out.println("Sum of geometric sequence: " + calculateSum(serialNumber, firstNumber, denominator));
    }

    private static int getNumber(int serialNumber, int firstNumber, int denominator) {
        if (serialNumber > 1) {
            return getNumber(serialNumber - 1, firstNumber * denominator, denominator);
        }
        return firstNumber;
    }

    private static int calculateSum(int serialNumber, int firstNumber, int denominator) {
        if (serialNumber > 0) {
            return getNumber(serialNumber, firstNumber, denominator) + calculateSum(serialNumber - 1, firstNumber, denominator);
        }
        return 0;
    }
}