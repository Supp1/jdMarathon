package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh02N043 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write two numbers");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.println("First number divide into second?\n\t" + isDiv(number1, number2));
    }

    private static int isDiv(int a, int b) {
        return (a % b) * (b % a) + 1;
    }
}