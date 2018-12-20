package com.javadev.marathon.bayevv;

import java.util.Scanner;

import static com.javadev.marathon.bayevv.ArrayUtils.copyArray;
import static com.javadev.marathon.bayevv.ArrayUtils.showArray;

public class TaskCh12N023 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write length of arrays");
        int length = scan.nextInt();
        int[][] array = new int[length][length];
        System.out.println("Task A:");
        showArray(taskA(copyArray(array)));
        System.out.println("\nTask B:");
        showArray(taskB(copyArray(array)));
        System.out.println("\nTask C:");
        showArray(taskC(copyArray(array)));
    }

    private static int[][] taskA(int[][] array) {
        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array.length; column++) {
                array[line][column] = 1;
                line++;
            }
        }
        for (int line = 0; line < array.length; line++) {
            for (int column = 6; column >= 0; column--) {
                array[line][column] = 1;
                line++;
            }
        }
        return array;
    }

    private static int[][] taskB(int[][] array) {
        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array.length; column++) {
                array[line][column] = 1;
                line++;
            }
        }
        for (int line = 0; line < array.length; line++) {
            for (int column = 6; column >= 0; column--) {
                array[line][column] = 1;
                line++;
            }
        }
        for (int line = 0; line < array.length; line++) {
            array[line][3] = 1;
        }
        for (int column = 0; column < array.length; column++) {
            array[3][column] = 1;
        }
        return array;
    }

    private static int[][] taskC(int[][] array) {
        for (int line = 0; line < (array.length / 2) + 1; line++) {
            for (int column = line; column < array.length - line; column++) {
                array[line][column] = 1;
            }
        }
        int difference = 2;
        for (int line = (array.length / 2) + 1; line < array.length; line++, difference += 2) {
            for (int column = line - difference; column <= line; column++) {
                array[line][column] = 1;
            }
        }
        return array;
    }
}