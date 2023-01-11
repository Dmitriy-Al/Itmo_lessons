package ru.itmo.lesson.lesson26threadsblock.synchronization;

public class SomeAccount {
    private int balance;

    public int getBalance() {
        return balance;
    }

    // synchronized метод блокирует монитор объекта,
    // у которого данный метод вызывается
    public /* synchronized */ void upBalance(int count) {
        balance += count;
    }

}