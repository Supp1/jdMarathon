package com.javadev.marathon.bayevv;

import java.util.Scanner;

public class TaskCh06N087 {
    public static void main(String[] args) {
        Game basketball = new Game();
        basketball.play();
    }
}

class Game {
    Scanner scan = new Scanner(System.in);
    private String teamFirstName;
    private String teamSecondName;
    private int scoreFirst = 0;
    private int scoreSecond = 0;

    public void play() {
        System.out.print("Enter team #1: ");
        teamFirstName = scan.next();
        System.out.print("Enter team #2: ");
        teamSecondName = scan.next();
        startScoring();
        System.out.println(getResult());
    }

    private void startScoring() {
        int numTeam = 0;
        int score = 0;
        while (true) {
            System.out.print("Enter team to count(1 or 2 team): ");
            numTeam = scan.nextInt();
            while (numTeam < 1 || numTeam > 2) {
                System.out.print("!!!Error. Wrong team number(1 or 2 team)!!!\nTry again: ");
                numTeam = scan.nextInt();
            }
            System.out.print("Enter score (1 or 2 or 3 or 0 to end game): ");
            score = scan.nextInt();
            while (score < 0 || score > 3) {
                System.out.print("!!!Error. Wrong count amount(1 or 2 or 3 or 0 to end game)!!!\nTry again: ");
                score = scan.nextInt();
            }
            if (score == 0) {
                break;
            }
            System.out.println(countScore(numTeam, score));
        }
    }

    private String countScore(int numTeam, int score) {
        switch (numTeam) {
            case 1:
                scoreFirst += score;
                break;
            case 2:
                scoreSecond += score;
                break;
        }
        return ("Current score\n\t" + scoreFirst + " -- " + scoreSecond);
    }

    private String getResult() {
        String result = " ";
        if (scoreFirst > scoreSecond) {
            result = "\"" + teamFirstName + "\"" + " win!";
        } else if (scoreFirst == scoreSecond) {
            result = "It's a Draw!";
        } else {
            result = "\"" + teamSecondName + "\"" + " win!";
        }
        result += "\nScore is\n" +
                "\t" + teamFirstName + ": " + scoreFirst + "\t" + teamSecondName + ": " + scoreSecond;
        return (result);
    }
}