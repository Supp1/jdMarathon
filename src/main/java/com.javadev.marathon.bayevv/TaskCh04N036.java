package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh04N036 {
    public static void main(String[] args) {
        System.out.println("Write time");
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        System.out.println("Current traffic light color is" + getLightColor(time));
    }

    private static String getLightColor(int time) {
        if (time % 5 < 3) {
            return "green";
        } else {
            return "red";
        }
    }
}