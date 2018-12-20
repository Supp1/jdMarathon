package com.javadev.marathon.bayevv;

import java.util.Scanner;

import static com.javadev.marathon.bayevv.ArrayUtils.showArray;

public class TaskCh12N028 {
    public static void main(String[] args) {
        System.out.println("Write length of array");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[][] array = new int[length][length];
        showArray(fillArraySpiral(array));
    }

    private static int[][] fillArraySpiral(int[][] array) {
        int number = array.length * array.length;
        int line = array.length / 2;
        int column = array.length / 2;

        int blockUp = array.length / 2 - 1;
        int blockDown = array.length / 2 - 1;
        int blockRight = array.length / 2 - 1;
        int blockLeft = array.length / 2 - 1;

        while (number != 0) {
            for (; column > blockLeft; column--, number--) {
                array[line][column] = number;
            }
            if (number == 0) {
                break;
            }
            blockLeft--;
            for (; line < blockDown + 2; line++, number--) {
                array[line][column] = number;
            }
            blockDown++;
            for (; column < blockRight + 2; column++, number--) {
                array[line][column] = number;
            }
            blockRight++;
            for (; line > blockUp; line--, number--) {
                array[line][column] = number;
            }
            blockUp--;
        }
        return array;
    }
}