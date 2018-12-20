package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh09N042 {
    public static void main(String[] args) {
        System.out.println("Write any word");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(reverse(word));
    }

    private static StringBuilder reverse(String word) {
        return new StringBuilder(word).reverse();
    }
}