package ru.gb;

import java.util.*;

public class Homework5 {
    /**
     * Есть текст. Нужно извлечь из него все слова и отсортировать по длине.
     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
     * <p>
     * и
     * ты
     * Еще
     * день друг Пора
     * ..
     */
    public static void collectStats(String[] text, Map<Integer, String> stats) {

        for (String str : text) {
            // если пусто
            if (stats.isEmpty()) {
                stats.put(str.length(), str);
                continue;
            }
            // если густо
            if (stats.containsKey(str.length())) {
                stats.put(str.length(), !stats.get(str.length()).equals(str) ? stats.get(str.length()) + " " + str : stats.get(str.length()));
            } else {
                stats.put(str.length(), str);
            }
        }

    }

    public static void printMap(Map<Integer, String> ourMap) {
        // печать
        ourMap.forEach((key, value) -> System.out.println(value));

    }

    public static void main(String[] args) {
        Map<Integer, String> stats = new HashMap<>();
        String testStr = "Есть тест Нужно извлечь из него все слова и отсортировать по длине Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        collectStats(testStr.split(" "), stats);
        printMap(stats);
    }

}
