package com.javadev.marathon.bayevv;

import java.util.Scanner;

import static com.javadev.marathon.bayevv.ArrayUtils.convertArrayToString;

public class TaskCh09N185 {
    public static void main(String[] args) {
        System.out.println("Write expression with brackets");
        Scanner scan = new Scanner(System.in);
        String expression = scan.nextLine();
        System.out.println(isRightBrackets(expression));
    }

    private static String isRightBrackets(String expression) {
        String checkedExpression = removeCorrectBrackets(expression);
        if (checkedExpression.indexOf('(') != -1) {
            int amountWrongLeftBracket = 0;
            for (int i = 0; i < checkedExpression.length(); i++) {
                if (checkedExpression.charAt(i) == '(') {
                    amountWrongLeftBracket++;
                }
            }
            return "No. LeftBracket " + amountWrongLeftBracket;
        } else if (checkedExpression.indexOf(')') != -1) {
            return "No. Right Bracket " + checkedExpression.indexOf(")");
        } else {
            return "Yes";
        }
    }

    private static String removeCorrectBrackets(String expression) {
        char[] expressionArray = expression.toCharArray();
        for (int idOpenBracket = 0; idOpenBracket < expressionArray.length; idOpenBracket++) {
            if (expressionArray[idOpenBracket] == '(') {
                boolean closeBracket = false;
                for (int idCloseBracket = idOpenBracket; idCloseBracket < expressionArray.length; idCloseBracket++) {
                    if (expressionArray[idCloseBracket] == ')') {
                        expressionArray[idCloseBracket] = '*';
                        closeBracket = true;
                        break;
                    }
                }
                if (closeBracket) {
                    expressionArray[idOpenBracket] = '*';
                }
            }
        }
        return convertArrayToString(expressionArray);
    }

    private static String removeCorrectBrackets2(String expression) { //Second way to resolve
        StringBuffer changeableExpression = new StringBuffer(expression);
        for (int i = 0; i < changeableExpression.length(); i++) {
            if (changeableExpression.charAt(i) == '(') {
                try {
                    changeableExpression.setCharAt(changeableExpression.indexOf(")", i), '*');
                } catch (StringIndexOutOfBoundsException e) {
                    break;
                }
                changeableExpression.setCharAt(i, '*');
            }
        }
        return changeableExpression.toString();
    }
}