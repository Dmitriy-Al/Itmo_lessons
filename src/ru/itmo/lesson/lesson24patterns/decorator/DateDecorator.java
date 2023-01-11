package ru.itmo.lesson.lesson24patterns.decorator;

import java.time.LocalDateTime;

public class DateDecorator extends BaseDecorator{
    public DateDecorator(ILog logger) {
        super(logger);
    }

    @Override
    public void log(String data) {
        String newData = data + " date: " + LocalDateTime.now();
        super.log(newData);
    }
}