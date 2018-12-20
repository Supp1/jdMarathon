package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh09N022 {
    public static void main(String[] args) {
        System.out.println("Write any word");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(showHalfWord(word));
    }

    private static String showHalfWord(String word) {
        return word.substring(0, word.length() / 2);
    }
}