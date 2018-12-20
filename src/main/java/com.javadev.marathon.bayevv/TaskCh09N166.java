package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh09N166 {
    public static void main(String[] args) {
        System.out.println("Write any sentence");
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        System.out.println(replaceFirstLastWord(sentence));
    }

    private static String replaceFirstLastWord(String sentence) {
        String[] words = sentence.split(" ");
        String temp = words[0];
        words[0] = words[words.length - 1];
        words[words.length - 1] = temp;
        return convertArrayToSentence(words);
    }

    private static String convertArrayToSentence(String[] wordArray) {
        String sentence = "";
        for (String word : wordArray) {
            sentence += word + " ";
        }
        return sentence;
    }
}