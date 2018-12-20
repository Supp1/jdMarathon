package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh09N015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write any word");
        String word = scan.next();
        System.out.println("What symbol you want to see?");
        int k = scan.nextInt();
        System.out.println(showChar(k, word));
    }

    private static char showChar(int k, String word) {
        char[] wordArray = word.toCharArray();
        return wordArray[k];
    }
}