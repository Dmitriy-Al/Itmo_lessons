package ru.itmo.lesson.lesson24patterns.decorator;

public class ConsoleLogging implements ILog {
    @Override
    public void log(String data) {
        System.out.println(data);
    }
}