package com.javadev.marathon.bayevv;

public class TaskCh10N049 {
    public static void main(String[] args) {
        int[] n = {10, 454, 32, 444};
        System.out.println("Id of maximum number from sequence is: " + getMaxId(n, n.length - 1, 0));
    }

    private static int getMaxId(int[] numberSequence, int i, int max) {
        max = TaskCh10N048.getMax(numberSequence, numberSequence.length - 1, 0);
        if (i > 0) {
            if (numberSequence[i] == max) {
                return i;
            } else {
                return getMaxId(numberSequence, i - 1, max);
            }
        }
        return -1;
    }
}