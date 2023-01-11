package ru.itmo.lesson.lesson20serializable;

import java.io.*;

public class BinHandler<T> {
    private File file;

    public BinHandler() {
        file = new File("lesson20.bin");
    }

    public void writeToFile(T object) {
        try (FileOutputStream fileOutput = new FileOutputStream(file);
             ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput)) {
            objectOutput.writeObject(object);
            // ObjectOutputStream - сериализация - превращает объект в последовательность байт
            // ObjectOutputStream - вызывает метод write у потока, переданного ему
            //в конструктор (тут fileOutput), поэтому
            // FileOutputStream - записывает данную последовательность в файл
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // файл --десериализация--> объект
    public T readFromFile() {
        Object result = null;
        try (FileInputStream fileInput = new FileInputStream(file);
             ObjectInputStream objectInput = new ObjectInputStream(fileInput)) {
            result = objectInput.readObject();//
            //ObjectInputStream вызывает метод read у потока, переданного ему
            //в конструктор (тут fileInput), поэтому
            // осуществляется чтение последовательности байт из файла
            //ObjectInputStream преобразует полученную последовательность
            //в объект типа Object
        } catch (IOException | ClassNotFoundException e) { //ClassNotFoundException если не окажется типа данных в программе
            throw new RuntimeException(e);
        }
        return (T) result;
    }
}



