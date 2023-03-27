package ru.gb;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private int age;

    private enum Sex{MAN,WOMAN};

    public Person(String name, String surname, int age, Sex sx) {
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name = name.strip();
    }

    public void setSurname(String surname) {
        this.surname = surname.strip();
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public String getFullPerson(){
        return String.format("name:%s, surname:%s, age:%d", this.getName(), this.getSurname(), this.getAge());
    }

    @Override
    public String toString() {
        return String.format("Class@%s, Hash:%d, Name:%s, Surname:%s, Age:%d", this.getClass().getName(), this.hashCode(), this.getName(), this.getSurname(), this.getAge());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Person)) return false;
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getSurname(), this.getAge());
    }
}
