package ru.gb;

import java.util.Arrays;
import java.util.Random;

public class Homework1 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println("\n" + isLeapYear(2100));

        System.out.println(Arrays.toString(createArray(5, 2)));

        int[] arr = getArrayBinary(10);
        arrChangeBinItem(arr);

        int[] arr1 = getNewArray(10, 1, 11);
        changeItemLess6(arr1);

        int[][] arr2 = createSquareArray(5);
        changeDiagonalItemArray(arr2);


        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];


    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        boolean result = a + b > 9 & 21 > a + b;
        return result;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        return (x > 0) ? true : false;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }

    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if (year % 4 == 0 & year % 100 != 0) return true;

        if (year % 400 == 0) return true;

        return false;
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initalValue;
        }
        return arr;
    }

    private static int[] getArrayBinary(int len) {
        // 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        Random rnd = new Random();
        //rnd.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(2);
        }
        return arr;
    }

    private static void arrChangeBinItem(int arr[]) {
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
        }
    }

    private static int[] getNewArray(int len, int start, int last) {
        // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        Random rnd = new Random();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(start, last + 1);
        }
        return arr;
    }

    private static void changeItemLess6(int arr[]) {
        // пройти по нему циклом, и числа меньшие 6 умножить на 2
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < 6 ? arr[i] * 2 : arr[i];
        }
    }

    private static int[][] createSquareArray(int len) {
        // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
        return new int[len][len];
    }

    private static void changeDiagonalItemArray(int[][] arr) {
        //и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        //Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        // Также заполнить элементы побочной диагонали
        int size = arr[0].length;
        for (int i = 0; i < size; i++) {
            arr[i][i] = 1;
            arr[i][size - i - 1] = 1;
        }
    }

/**
 * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
 * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
 * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
 * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
 * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
 * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
 * * Также заполнить элементы побочной диагонали
 */
}
