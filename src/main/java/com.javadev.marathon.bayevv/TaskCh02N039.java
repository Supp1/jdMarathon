package com.javadev.marathon.bayevv;

public class TaskCh02N039 {
    private static final int MINUTES_IN_HOUR = 60;
    private static final int SECONDS_IN_HOUR = 3600;
    private static final int ONE_HOUR_ANGLE = 360 / 12;

    public static void main(String[] args) {
        System.out.println(findHourAngle(5, 10, 40));
    }

    private static double findHourAngle(int hour, int min, int sec) {
        if (hour >= 12) {
            hour %= 12;
        }
        return (hour + (float) min / MINUTES_IN_HOUR + (float) sec / SECONDS_IN_HOUR) * ONE_HOUR_ANGLE;
    }
}