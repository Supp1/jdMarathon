package com.javadev.marathon.bayevv;

import static com.javadev.marathon.bayevv.ArrayUtils.copyArray;

public class TaskCh12N063 {
    private static final int AMOUNT_CLASSES = 11;
    private static final int AMOUNT_PARALLELS = 4;

    public static void main(String[] args) {
        int[][] school = new int[AMOUNT_CLASSES][AMOUNT_PARALLELS];
        fillArray(school);
        outAveragePupils(school);
    }

    private static void fillArray(int[][] array) {
        for (int line = 0; line < AMOUNT_CLASSES; line++) {
            for (int column = 0; column < AMOUNT_PARALLELS; column++) {
                array[line][column] = (line + 1) * 4 + column * 2;
            }
        }
    }

    private static int[][] countAveragePupils(int[][] array) {
        int[][] school = array;
        for (int line = 0; line < AMOUNT_CLASSES; line++) {
            for (int column = 0; column < AMOUNT_PARALLELS; column++) {
                school[line][0] += school[0][column];
            }
            school[line][0] /= AMOUNT_PARALLELS;
        }
        return school;
    }

    private static void outAveragePupils(int[][] school) {
        int[][] schoolCopy = copyArray(school);
        countAveragePupils(schoolCopy);
        for (int line = 0; line < AMOUNT_CLASSES; line++) {
            System.out.println("Average pupils of " + (line + 1) + " class: " + schoolCopy[line][0]);
        }
    }
}