package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh10N047 {
    public static void main(String[] args) {
        System.out.println("Write serial number of number");
        Scanner scan = new Scanner(System.in);
        int serialNumber = scan.nextInt();
        System.out.println("Fibonacci sequence: " + getFibonacciNumber(serialNumber));
    }

    private static int getFibonacciNumber(int serialNumber) {
        if (serialNumber > 2) {
            return getFibonacciNumber(serialNumber - 1) + getFibonacciNumber(serialNumber - 2);
        }
        return 1;
    }
}