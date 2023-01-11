package ru.itmo.lesson.lesson22patterns.pattern01;

import java.io.File;
import java.io.IOException;

abstract public class Handler {
    protected File file;

    public Handler(File file) {
        this.file = file;
    }

    abstract public void read();
    abstract public void write(String data);


    // фабричный метод является паттерном проектирования
    public static Handler getHandler(String filename){
        if(filename.endsWith(".json")) return new JsonHandler(new File(filename));
        if(filename.endsWith(".xml")) return new XMLHandler(new File(filename));
            throw new IllegalArgumentException("Err");
    }

}