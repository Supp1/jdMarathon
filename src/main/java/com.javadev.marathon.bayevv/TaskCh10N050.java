package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh10N050 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write m");
        int n = scan.nextInt();
        System.out.println("Write n");
        int m = scan.nextInt();
        System.out.println(calculateAckermann(n, m));
    }

    private static int calculateAckermann(int n, int m) {
        if (n == 0) {
            return m + 1;
        } else if (m == 0 & n > 0) {
            return calculateAckermann(n - 1, 1);
        } else if (m > 0 & n > 0) {
            return calculateAckermann(n - 1, calculateAckermann(n, m - 1));
        }
        return -1;
    }
}