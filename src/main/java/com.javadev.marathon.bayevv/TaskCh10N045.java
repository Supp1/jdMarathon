package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh10N045 {
    public static void main(String[] args) {
        System.out.println("Write first number of sequence");
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        System.out.println("Write difference");
        int difference = scan.nextInt();
        System.out.println("Write serial of number you want to find");
        int serialNumber = scan.nextInt();
        System.out.println("Number is: " + getNumber(serialNumber, firstNumber, difference));
        System.out.println("Sum of arithmetic sequence: " + calculateSum(serialNumber, firstNumber, difference));
    }

    private static int getNumber(int serialNumber, int firstNumber, int difference) {
        if (serialNumber > 1) {
            return getNumber(serialNumber - 1, firstNumber + difference, difference);
        }
        return firstNumber;
    }

    private static int calculateSum(int serialNumber, int firstNumber, int difference) {
        if (serialNumber > 0) {
            return getNumber(serialNumber, firstNumber, difference) + calculateSum(serialNumber - 1, firstNumber, difference);
        }
        return 0;
    }
}