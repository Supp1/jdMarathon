package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh10N053 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        reverseSequence(0, scan.nextInt());
    }

    private static int reverseSequence(int prevNumber, int number) {
        Scanner scan = new Scanner(System.in);
        if (number != 0) {
            reverseSequence(number, scan.nextInt());
            System.out.println(number);
        }
        return 0;
    }
}