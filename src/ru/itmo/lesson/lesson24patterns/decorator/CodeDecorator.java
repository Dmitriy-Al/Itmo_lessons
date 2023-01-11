package ru.itmo.lesson.lesson24patterns.decorator;

import java.util.UUID;

public class CodeDecorator extends BaseDecorator{
    public CodeDecorator(ILog logger) {
        super(logger);
    }

    @Override
    public void log(String data) {
        String newData = data + " " + UUID.randomUUID();
        super.log(newData);
    }
}