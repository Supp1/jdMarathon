package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh10N041 {
    public static void main(String[] args) {
        System.out.println("Write any number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println(calculateFactorial(number));
    }

    private static int calculateFactorial(int number) {
        if (number > 0) {
            return number * calculateFactorial(number - 1);
        }
        return 1;
    }
}