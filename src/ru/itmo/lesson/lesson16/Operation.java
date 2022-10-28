package ru.itmo.lesson.lesson16;

// ИНТЕРФЕЙС БЕЗ МЕТОДОВ - МАРКЕР (Почитать)
// Интерфейс с одним абстрактным методом - функциональный интерфейс

@FunctionalInterface  // аннотация появилась в java 8
public interface Operation {

    double execute(double a, double b);

}
