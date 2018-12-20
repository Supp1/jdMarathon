package com.javadev.marathon.bayevv;

public class TaskCh03N029 {
    public static void main(String[] args) {
        System.out.println(part1(3, 4));
        System.out.println(part2(4, 24));
        System.out.println(part3(0, 4));
        System.out.println(part4(-4, -34, -1));
        System.out.println(part5(5, 4, 0));
        System.out.println(part6(102, 100, 0));
    }

    private static boolean part1(int x, int y) {
        return x % 2 != 0 && y % 2 != 0;
    }

    private static boolean part2(int x, int y) {
        return x < 20 ^ y < 20;
    }

    private static boolean part3(int x, int y) {
        return x == 0 || y == 0;
    }

    private static boolean part4(int x, int y, int z) {
        return x < 0 && y < 0 && z < 0;
    }

    private static boolean part5(int x, int y, int z) {
        return (x % 5 == 0 ^ y % 5 == 0) ^ z % 5 == 0;
    }

    private static boolean part6(int x, int y, int z) {
        return x > 100 || y > 100 || z > 100;
    }
}