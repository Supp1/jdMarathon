package com.javadev.marathon.bayevv;

import java.util.Scanner;

import static com.javadev.marathon.bayevv.ArrayUtils.copyArray;
import static com.javadev.marathon.bayevv.ArrayUtils.showArray;

public class TaskCh12N024 {
    public static void main(String[] args) {
        System.out.println("Write length of array");
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        System.out.println("Task A:");
        int[][] array = new int[length][length];
        showArray(taskA(copyArray(array)));
        System.out.println("\nTask B:");
        showArray(taskB(copyArray(array)));
    }

    private static int[][] taskA(int[][] array) {
        for (int column = 0; column < array.length; column++) {
            array[0][column] = 1;
        }
        for (int line = 0; line < array.length; line++) {
            array[line][0] = 1;
        }
        for (int line = 1; line < array.length; line++) {
            for (int column = 1; column < array.length; column++) {
                array[line][column] = array[line - 1][column] + array[line][column - 1];
            }
        }
        return array;
    }

    private static int[][] taskB(int[][] array) {
        for (int column = 0; column < array.length; column++) {
            array[0][column] = column + 1;
        }
        for (int line = 1; line < array.length; line++) {
            for (int column = 0; column < array.length - 1; column++) {
                array[line][column] = array[line - 1][column + 1];
            }
            array[line][array.length - 1] = array[line - 1][0];
        }
        return array;
    }
}