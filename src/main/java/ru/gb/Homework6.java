package ru.gb;

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
        Person man = new Person("Vova","Putin", 62);
        Person man1 = new Person("Ivan","Ivanov", 43);
        System.out.println(man);
        System.out.println(man1);
        System.out.println(man.getFullPerson());
    }
}
