package com.javadev.marathon.bayevv;

import static com.javadev.marathon.bayevv.ArrayUtils.copyArray;
import static com.javadev.marathon.bayevv.ArrayUtils.showArray;

public class TaskCh12N025 {
    public static void main(String[] args) {
        int[][] array = new int[12][10];
        System.out.println("Часть А:");
        showArray(task1(copyArray(array)));
        System.out.println("\nЧасть Б:");
        showArray(task2(copyArray(array)));
        System.out.println("\nЧасть В:");
        showArray(task3(copyArray(array)));
        System.out.println("\nЧасть Г:");
        showArray(task4(copyArray(array)));
        System.out.println("\nЧасть Д:");
        int[][] array2 = new int[10][12];
        showArray(task5(array2));
        System.out.println("\nЧасть Е:");
        showArray(task6(copyArray(array)));
        System.out.println("\nЧасть Ж:");
        showArray(task7(copyArray(array)));
        System.out.println("\nЧасть З:");
        showArray(task8(copyArray(array)));
        System.out.println("\nЧасть И:");
        showArray(task9(copyArray(array)));
        System.out.println("\nЧасть К:");
        showArray(task10(copyArray(array)));
        System.out.println("\nЧасть Л:");
        showArray(task11(copyArray(array)));
        System.out.println("\nЧасть М:");
        showArray(task12(copyArray(array)));
        System.out.println("\nЧасть Н:");
        showArray(task13(copyArray(array)));
        System.out.println("\nЧасть О:");
        showArray(task14(copyArray(array)));
        System.out.println("\nЧасть П:");
        showArray(task15(copyArray(array)));
        System.out.println("\nЧасть Р:");
        showArray(task16(copyArray(array)));
    }

    private static int[][] task1(int[][] array) {
        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array[line].length; column++) {
                array[line][column] = line * 10 + column + 1;
            }
        }
        return array;
    }

    private static int[][] task2(int[][] array) {
        for (int line = 0; line < array.length; line++) {
            array[line][0] = line + 1;
        }
        for (int line = 0; line < array.length; line++) {
            for (int column = 1; column < array[line].length; column++) {
                array[line][column] = array[line][column - 1] + 12;
            }
        }
        return array;
    }

    private static int[][] task3(int[][] array) {
        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array[line].length; column++) {
                array[line][column] = line * 10 + array[line].length - column;
            }
        }
        return array;
    }

    private static int[][] task4(int[][] array) {
        for (int line = 0; line < array.length; line++) {
            array[line][0] = array.length - line;
        }
        for (int line = 0; line < array.length; line++) {
            for (int column = 1; column < array[line].length; column++) {
                array[line][column] = array[line][column - 1] + 12;
            }
        }
        return array;
    }

    private static int[][] task5(int[][] array) {
        int number = 0;
        for (int line = 0; line < array.length; line++) {
            if (line % 2 == 0) {
                for (int column = 0; column < array[0].length; column++) {
                    array[line][column] = ++number;
                }
            } else {
                for (int column = array[line].length - 1; column >= 0; column--) {
                    array[line][column] = ++number;
                }
            }
        }
        return array;
    }

    private static int[][] task6(int[][] array) {
        int number = 0;
        for (int column = 0; column < array[0].length; column++) {
            if (column % 2 == 0) {
                for (int line = 0; line < array.length; line++) {
                    array[line][column] = ++number;
                }
            } else {
                for (int line = array.length - 1; line >= 0; line--) {
                    array[line][column] = ++number;
                }
            }
        }
        return array;
    }

    private static int[][] task7(int[][] array) {
        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array[line].length; column++) {
                array[line][column] = (array.length - line - 1) * 10 + column + 1;
            }
        }
        return array;
    }

    private static int[][] task8(int[][] array) {
        for (int line = 0; line < array.length; line++) {
            array[line][0] = (array.length - 1) * 10 + line - 1;
        }
        for (int line = 0; line < array.length; line++) {
            for (int column = 1; column < array[line].length; column++) {
                array[line][column] = array[line][column - 1] - 12;
            }
        }
        return array;
    }

    private static int[][] task9(int[][] array) {
        for (int line = 0; line < array.length; line++) {
            for (int column = 0; column < array[line].length; column++) {
                array[line][column] = (array.length - line - 1) * 10 + array[line].length - column;
            }
        }
        return array;
    }

    private static int[][] task10(int[][] array) {
        for (int line = 0; line < array.length; line++) {
            array[line][0] = array.length * 10 - line;
        }
        for (int line = 0; line < array.length; line++) {
            for (int column = 1; column < array[line].length; column++) {
                array[line][column] = array[line][column - 1] - 12;
            }
        }
        return array;
    }

    private static int[][] task11(int[][] array) {
        int number = 0;
        for (int line = array.length - 1; line >= 0; line--) {
            if (line % 2 == 0) {
                for (int column = array[line].length - 1; column >= 0; column--) {
                    array[line][column] = ++number;
                }
            } else {
                for (int column = 0; column < array[line].length; column++) {
                    array[line][column] = ++number;
                }
            }
        }
        return array;
    }

    private static int[][] task12(int[][] array) {
        int number = 0;
        for (int line = 0; line < array.length; line++) {
            if (line % 2 == 0) {
                for (int column = array[line].length - 1; column >= 0; column--) {
                    array[line][column] = ++number;
                }
            } else {
                for (int column = 0; column < array[line].length; column++) {
                    array[line][column] = ++number;
                }
            }
        }
        return array;
    }

    private static int[][] task13(int[][] array) {
        int number = 0;
        for (int column = array[0].length - 1; column >= 0; column--) {
            if (column % 2 == 0) {
                for (int line = array.length - 1; line >= 0; line--) {
                    array[line][column] = ++number;
                }
            } else {
                for (int line = 0; line < array.length; line++) {
                    array[line][column] = ++number;
                }
            }
        }
        return array;
    }

    private static int[][] task14(int[][] array) {
        int number = 0;
        for (int column = 0; column < array[0].length; column++) {
            if (column % 2 == 0) {
                for (int line = array.length - 1; line >= 0; line--) {
                    array[line][column] = ++number;
                }
            } else {
                for (int line = 0; line < array.length; line++) {
                    array[line][column] = ++number;
                }
            }
        }
        return array;
    }

    private static int[][] task15(int[][] array) {
        int number = 0;
        for (int line = array.length - 1; line >= 0; line--) {
            if (line % 2 == 0) {
                for (int column = 0; column < array[line].length; column++) {
                    array[line][column] = ++number;
                }
            } else {
                for (int column = array[line].length - 1; column >= 0; column--) {
                    array[line][column] = ++number;
                }
            }
        }
        return array;
    }

    private static int[][] task16(int[][] array) {
        int number = 0;
        for (int column = array[0].length - 1; column >= 0; column--) {
            if (column % 2 == 0) {
                for (int line = 0; line < array.length; line++) {
                    array[line][column] = ++number;
                }
            } else {
                for (int line = array.length - 1; line >= 0; line--) {
                    array[line][column] = ++number;
                }
            }
        }
        return array;
    }
}