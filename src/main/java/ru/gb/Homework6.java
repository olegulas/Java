package ru.gb;


import java.util.ArrayList;

import static ru.gb.PersonEnum.PersonSex;

public class Homework6 {
    //    Создать класс Person.
    //    У класса должны быть поля:
    //            1. Имя (String)
    //2. Фамилия (String)
    //3. Возраст (продумать тип)
    //4. Пол
    //5*. Придумать свои собственные поля
    //
    //    Для этого класса
    //1. Реализовать методы toString, equals и hashCode.
    //2*. Придумать собственные методы и реализовать их
    //
    //    В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.


    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Vova", "Ivan", 34, PersonSex.MEN, "Moscow"));
        persons.add(new Person("Ivan", "Petrov", 19, PersonSex.MEN, "Tver"));
        persons.add(new Person("Maria", "Alexandrova", 18, PersonSex.WOMAN, "St.Petersburg"));
        persons.add(new Person("Varvara", "Smirnova", 21, PersonSex.WOMAN, "Belgorod"));
        persons.add(new Person("Tamara", "Luk'yanova", 15, PersonSex.WOMAN, "Vladivostok"));
        for (Person prs : persons) {
            if (prs.getAge() > 20) System.out.println(prs.getFullPerson());
        }
    }
}
