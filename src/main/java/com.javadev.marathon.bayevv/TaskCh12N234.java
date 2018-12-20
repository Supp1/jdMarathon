package com.javadev.marathon.bayevv;

import java.util.Scanner;

import static com.javadev.marathon.bayevv.ArrayUtils.showArray;

public class TaskCh12N234 {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {6, 2, 4, 3}
        };
        Scanner scan = new Scanner(System.in);
        System.out.println("What method do you want to check?" +
                "\n Deleting Line - write 1 \t Deleting Column - write 2");
        switch (scan.nextInt()) {
            case 1:
                System.out.println("Write index of line you want to delete");
                int lineIndex = scan.nextInt();
                showArray(deleteLine(array, lineIndex));
                break;
            case 2:
                System.out.println("Write index of column you want to delete");
                int columnIndex = scan.nextInt();
                showArray(deleteColumn(array, columnIndex));
                break;
            default:
                System.out.println("Something went wrong. Execute again");
                break;
        }
    }

    private static int[][] deleteLine(int[][] array, int lineIndex) {
        for (int line = lineIndex; line < array.length - 1; line++) {
            for (int column = 0; column < array[0].length; column++) {
                array[line][column] = array[line + 1][column];
            }
        }
        for (int column = 0; column < array[array.length - 1].length; column++) {
            array[array.length - 1][column] = 0;
        }
        return array;
    }

    private static int[][] deleteColumn(int[][] array, int columnIndex) {
        for (int line = 0; line < array.length; line++) {
            for (int column = columnIndex; column < array[0].length - 1; column++) {
                array[line][column] = array[line][column + 1];
            }
        }
        for (int line = 0; line < array.length; line++) {
            array[line][array[0].length - 1] = 0;
        }
        return array;
    }
}