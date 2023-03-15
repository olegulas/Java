package ru.gb;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework3 {
    //    1. Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
    //    2. Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
    //    Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
    //    ["string", "s", "my_value"]
    public static void main(String[] args) {
        // точка входа в программу
        ArrayList<Integer> arrInt = new ArrayList<>(List.of(2, 4, 6, 2, 7, 9, 4, 6, 7, 11, 25, 77, 88));
        printArrLst(arrInt, "Исходный массив:");
        arrayWithoutOddNumbers(arrInt);
        printArrLst(arrInt, "Массив после обработки:");

        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        printArrLst(list, "Исходный массив:");
        arrWithoutDigits(list);
        printArrLst(list, "Массив после обработки:");
    }

    public static void arrayWithoutOddNumbers(ArrayList<Integer> array) {
        // метод удаления нечетных чисел из ArrayList массива
        array.removeIf(integer -> integer % 2 != 0);
    }

    public static void printArrLst(ArrayList array, String msg) {
        // метод печати ArrayList массива
        Iterator itr = array.iterator();
        System.out.println("\n" + msg);
        while (itr.hasNext()) {
            System.out.print(itr.next().toString() + " ");
        }
    }

    public static void arrWithoutDigits(ArrayList<String> array) {
        // метод очистки ArrayList массива от чисел
        array.removeIf(Homework3::isNumeric);
    }

    public static boolean isNumeric(String str) {
        // метод определения чисел
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}