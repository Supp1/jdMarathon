package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh02N031 {
    public static void main(String[] args) {
        int number = readNumber();
        System.out.println(changeThirdNumeralWithSecond(number));
    }

    private static int changeThirdNumeralWithSecond(int number) {
        int firstNumeral = number - number % 100;
        int secondNumeral = number % 10 * 10;
        int thirdNumeral = number % 100 / 10;
        return firstNumeral + secondNumeral + thirdNumeral;
    }

    private static int readNumber() {
        System.out.println("Write three-digit number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number < 100 || number > 999) {
            System.out.print("!!!Error!!! Number must be more than 100, but less then 999. ");
            number = readNumber();
        }
        return number;
    }
}