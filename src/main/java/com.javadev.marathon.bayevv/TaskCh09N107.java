package com.javadev.marathon.bayevv;

import java.util.Scanner;

import static com.javadev.marathon.bayevv.ArrayUtils.convertArrayToString;

public class TaskCh09N107 {
    public static void main(String[] args) {
        System.out.println("Write any word");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        System.out.println(changeAWithO1(word));
    }

    private static String changeAWithO1(String word) {
        StringBuilder wordChangeable = new StringBuilder(word);
        if (wordChangeable.indexOf("a") == -1 || wordChangeable.lastIndexOf("o") == -1) {
            return "Error, need letters \'a\' and \'o\'";
        }
        wordChangeable.setCharAt(wordChangeable.indexOf("a"), 'o');
        wordChangeable.setCharAt(wordChangeable.lastIndexOf("o"), 'a');
        return wordChangeable.toString();
    }

    private static String changeAWithO2(String word) { //Second way to resolve
        char[] wordArray = word.toCharArray();
        if (word.indexOf("a") == -1 || word.lastIndexOf("o") == -1) {
            return "Error, need letters \'a\' and \'o\'";
        }
        wordArray[word.indexOf("a")] = 'o';
        wordArray[word.lastIndexOf("o")] = 'a';
        return convertArrayToString(wordArray);
    }
}