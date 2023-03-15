package ru.gb;

import java.io.*;

public class Homework2 {
    //    Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
    //    которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
    //    Создать файл с названием file.txt.
    //    Если файл уже есть, то создавать не надо Записать в него Слово "TEXT" 100 раз
    public static void main(String[] args) {
        System.out.println(buildString(11, 'a', 'b'));
        FileOutputStream fileStr;
        File file = new File("file.txt");
        if (!file.exists()) {
            try {
                fileCreator(String.valueOf(file));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                fileStr = fileCreator(file.toString());
                StringBuilder fileStrNew;
                fileStrNew = new StringBuilder();
                fileStrNew.append("TEXT\n".repeat(100));
                fileStr.write(fileStrNew.toString().getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    public static StringBuilder buildString(int n, char symbol1, char symbol2) {
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < n; i += 2) {
            if (n % 2 != 0 & i == n - 1) {
                resultString.append(symbol1);
            } else {
                resultString.append(symbol1).append(symbol2);
            }
        }
        return resultString;
    }

    public static FileOutputStream fileCreator(String filename) throws FileNotFoundException {
        return new FileOutputStream(filename);
    }
}
