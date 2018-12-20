package com.javadev.marathon.bayevv;

import static java.lang.Math.*;

public class TaskCh01N017 {
    public static void main(String[] args) {
        System.out.println("First task: " + taskPart1(60));
        System.out.println("Second task: " + taskPart2(1, 1, 2, 3));
        System.out.println("Third task: " + taskPart3(3.4));
        System.out.println("Fourth task: " + taskPart4(-2.34));
    }

    private static double taskPart1(double x) {
        return sqrt(1 - pow(sin(x), 2));
    }

    private static double taskPart2(double a, double x, double b, double c) {
        return 1 / sqrt(a * pow(x, 2) + b * x + c);
    }

    private static double taskPart3(double x) {
        return (sqrt(x + 1) + sqrt(x - 1)) / (2 * sqrt(x));
    }

    private static double taskPart4(double x) {
        return abs(x) + abs(x + 1);
    }
}