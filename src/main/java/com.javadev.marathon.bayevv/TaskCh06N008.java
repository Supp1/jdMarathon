package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh06N008 {
    public static void main(String[] args) {
        System.out.println("Write any number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int[] numberSequence = getLessThen(number);
        for (int i : numberSequence) {
            System.out.println(i);
        }
    }

    private static int[] getLessThen(int userNum) {
        int arrayLength = calculateArrayLength(userNum);
        int numberSequence[] = new int[arrayLength];
        for (int i = 1; i <= numberSequence.length; i++) {
            numberSequence[i - 1] = i * i;
        }
        return numberSequence;
    }

    private static int calculateArrayLength(int userNum) {
        int number = 1;
        int arrayLength = 0;
        while (number < userNum) {
            arrayLength++;
            number = (arrayLength + 1) * (arrayLength + 1);
        }
        return arrayLength;
    }
}