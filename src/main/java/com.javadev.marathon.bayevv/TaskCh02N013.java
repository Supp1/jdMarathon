package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh02N013 {
    public static void main(String[] args) {
        System.out.println("Write three-digit number");
        Scanner scan = new Scanner(System.in);
        int userNumber = scan.nextInt();
        System.out.print(reverseNumber(userNumber));
    }

    private static int reverseNumber(int userNumber) {
        int firstNumeral = userNumber % 10 * 100;
        int secondNumeral = userNumber % 100 - userNumber % 10;
        int thirdNumeral = userNumber / 100;
        return firstNumeral + secondNumeral + thirdNumeral;
    }
}