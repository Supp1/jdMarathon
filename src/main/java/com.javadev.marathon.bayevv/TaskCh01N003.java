package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh01N003 {
    public static void main(String[] args) {
        writeUserNumber();
    }

    private static void writeUserNumber() {
        System.out.println("Write any number");
        Scanner scan = new Scanner(System.in);
        int userNum = scan.nextInt();
        System.out.println("Your number is: " + userNum);
    }
}