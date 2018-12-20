package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh10N052 {
    public static void main(String[] args) {
        System.out.println("Write any number");
        Scanner scan = new Scanner(System.in);
        System.out.println("Reversed number: " + getReverseNumber(scan.nextInt(), 0));
    }

    private static int getReverseNumber(int number, int reverseNumber) {
        if (number != 0) {
            reverseNumber += number % 10;
            return getReverseNumber(number / 10, reverseNumber * 10);
        }
        return reverseNumber / 10;
    }
}