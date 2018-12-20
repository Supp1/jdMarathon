package com.javadev.marathon.bayevv;

public class ArrayUtils {
    public static String convertArrayToString(char[] array) {
        String out = "";
        for (char c : array) {
            out += c;
        }
        return out;
    }

    public static void showArray(int[][] array) {
        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array[line].length; column++) {
                System.out.print(array[line][column] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] copyArray(int[][] array) {
        int[][] arrayCopy = new int[array.length][array[0].length];
        for (int line = 0; line < arrayCopy.length; line++) {
            for (int column = 0; column < arrayCopy[0].length; column++) {
                arrayCopy[line][column] = array[line][column];
            }
        }
        return arrayCopy;
    }
}
