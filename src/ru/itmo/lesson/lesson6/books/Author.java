package ru.itmo.lesson.lesson6.books;

public class Author {

    //Свойства хар.стики, поля, атрибуты.

    public String name;
    public String surname;

    public Author() {

    }

    public Author(String name, String surname) {
        setFullName(name, surname);
    }

    public void setFullName(String n, String s) {
        name = n;
        surname = s;
    }

    public void printFullName() {
        System.out.println(name + " " + surname);
    }

    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';

    }
}
