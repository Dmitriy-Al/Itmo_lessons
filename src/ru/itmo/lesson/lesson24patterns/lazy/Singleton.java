package ru.itmo.lesson.lesson24patterns.lazy;

public class Singleton {
    public static void main(String[] args) {
        Settings01 lazy = Settings01.getSettings();
        Settings02 eager = Settings02.getSettings();
        Settings03 enumInstance = Settings03.getSettings();
        Settings04 nested = Settings04.getSettings();

        // какие условия,
        // кроме многопоточности могут привести к созданию более, чем одно экземпляра?
        // О: клонирование, сериализация, рефлексия
        // перечисления не подвержены вышеперечисленным действиям
    }
}