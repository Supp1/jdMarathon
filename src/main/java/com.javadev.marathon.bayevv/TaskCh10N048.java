package com.javadev.marathon.bayevv;

public class TaskCh10N048 {
    public static void main(String[] args) {
        int[] sequence = {15, 3, 6, 1};
        System.out.println("Maximum number from sequence is: " + getMax(sequence, (sequence.length - 1), 0));
    }

    public static int getMax(int[] numberSequence, int numberId, int max) {
        if (numberId >= 0) {
            if (numberSequence[numberId] > max) {
                return getMax(numberSequence, numberId - 1, numberSequence[numberId]);
            } else {
                return getMax(numberSequence, numberId - 1, max);
            }
        }
        return max;
    }
}
