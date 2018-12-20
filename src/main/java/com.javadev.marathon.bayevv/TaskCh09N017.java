package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh09N017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write any word");
        String word = scan.next();
        System.out.println(isStartSimilarEnd(word));
    }

    private static boolean isStartSimilarEnd(String word) {
        boolean firstCheck = word.charAt(0) == word.charAt(word.length() - 1);
        boolean secondCheck = word.charAt(0) + 32 == word.charAt(word.length() - 1);
        boolean thirdCheck = word.charAt(0) == word.charAt(word.length() - 1) + 32;
        return firstCheck || secondCheck || thirdCheck;
    }
}