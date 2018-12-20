package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh04N033 {
    public static void main(String[] args) {
        System.out.println("Write any number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println("Is last number numerous odd?" + isEndsOdd(number));
        System.out.println("Is last number numerous even?" + isEndsEven(number));
    }

    private static boolean isEndsOdd(int number) {
        return number % 10 % 2 != 0;
    }

    private static boolean isEndsEven(int number) {
        return number % 10 % 2 == 0;
    }
}