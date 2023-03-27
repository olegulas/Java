package ru.gb;

import java.util.Objects;

import static ru.gb.PersonEnum.PersonSex;
import static ru.gb.PersonEnum.PersonGraduateAge;


public class Person {
    private String name;
    private String surname;
    private int age;
    private PersonSex sex;
    private String placeBirthday;
    private PersonGraduateAge gradAgeMan;


    public Person(String name, String surname, int age, PersonSex sex, String placeBirthday) {
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
        this.setSex(sex);
        this.setPlaceBirthday(placeBirthday);
        this.gradueteAgeMan(this.getAge());
    }

    private void gradueteAgeMan(int age) {
        if (age <= 12) this.setGradAgeMan(PersonGraduateAge.KID);
        if (age >= 13 && age <= 18) this.setGradAgeMan(PersonGraduateAge.TEENAGER);
        if (age >= 19 && age <= 35) this.setGradAgeMan(PersonGraduateAge.YOUNG);
        if (age >= 36 && age <= 60) this.setGradAgeMan(PersonGraduateAge.ADULT);
        if (age >= 61) this.setGradAgeMan(PersonGraduateAge.OLD);
    }

    public PersonGraduateAge getGradAgeMan() {
        return this.gradAgeMan;
    }

    public void setGradAgeMan(PersonGraduateAge gradAgeMan) {
        this.gradAgeMan = gradAgeMan;
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

    public void setSex(PersonSex sex) {
        this.sex = sex;
    }

    public String getPlaceBirthday() {
        return this.placeBirthday;
    }

    public void setPlaceBirthday(String placeBirthday) {
        this.placeBirthday = placeBirthday;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public PersonSex getSex() {
        return this.sex;
    }

    public int getAge() {
        return this.age;
    }


    public String getFullPerson() {
        return String.format("name:%s, surname:%s, age:%d, sex:%s, city birth:%s, graduate of man:%s", this.getName(),
                this.getSurname(), this.getAge(), this.getSex(), this.getPlaceBirthday(), this.getGradAgeMan());
    }

    @Override
    public String toString() {
        return String.format("Class@%s, Hash:%d, Name:%s, Surname:%s, Age:%d, Sex:%s, City of Birth:%s, graduate of man:%s",
                this.getClass().getName(), this.hashCode(), this.getName(), this.getSurname(), this.getAge(),
                this.getSex(), this.getPlaceBirthday(), this.getGradAgeMan());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Person)) return false;
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getSurname(), this.getAge(), this.getSex(),
                this.getPlaceBirthday(), this.getGradAgeMan());
    }
}

