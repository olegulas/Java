package ru.gb;

import java.util.*;

public class Homework4 {
    //    Реализовать консольное приложение, которое:
//    Принимает от пользователя строку вида text~num
//    Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//    Если введено print~num, выводит строку из позиции num в связном списке.
//    Если введено exit, завершаем программу
//    Пример:
//    string~4
//    num~3
//    print~3
//    num
//    print~4
//    string
//    my_value~1
//    print~1
//    my_value
    public static class ItemList {
        //класс узла
        Integer index;
        String data;

        public ItemList(int ind, String str) {
            this.index = ind;
            this.data = str;
        }

    }

    // константы
    public static final String EXIT = "exit";
    public static final String PRINT = "print";
    public static final String SEP = "~";


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ItemList> arr = new ArrayList<>();
        String str;
        while (!EXIT.equals(str = sc.nextLine())) {
            try {
                letMeNode(arr, Objects.requireNonNull(parseOurStr(str)));
            } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Error in string");
            }
        }
    }

    public static ItemList parseOurStr(String strForParse) {
        // парсинг строки
        String str = strForParse.split(SEP)[0];
        int index = Integer.parseInt(strForParse.split(SEP)[1]);
        return new ItemList(index, str);
    }

    public static void letMeNode(ArrayList<ItemList> lst, ItemList item) {
        // обработка очереди
        boolean isExist = false;
        // если очередь ещё пуста
        if (lst.isEmpty() & !item.data.equals(PRINT)) {
            lst.add(item);
            return;
        }
        // если напечатан print
        if (Objects.equals(item.data, PRINT)) {
            for (ItemList node : lst) {
                if (node.index.equals(item.index)) {
                    System.out.println(node.data);
                    break;
                }
            }
        } else {
            // замена узла очереди
            for (ItemList itemList : lst) {
                if (item.index.equals(itemList.index)) {
                    itemList.data = item.data;
                    isExist = true;
                }
            }
            // вставка нового узла
            if (!isExist) lst.add(item);
        }
    }
}
