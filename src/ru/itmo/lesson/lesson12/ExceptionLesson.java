package ru.itmo.lesson.lesson12;

import java.io.IOException;

public class ExceptionLesson {

    public static void main(String[] args) {

        // Error - ошибки связаны с проблемами уровня JVM
        // Exception - ошибки кода:
        // 1. Исключения времени выполнения (наследники RuntimeException), unchecked. Обрабатываются по усмотрению
        // 2. Исключения времени компиляции (все остальные наследники Exception). Отслеживаемые, обязательны для обработки

        int a = 1;
        int b = 0;
        int res;
        try {
            res = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Err" + e.getMessage());
            res = a;
        }

        System.out.println(res);

        String string = null;
        // string.equals("null"); Exception in thread "main" java.lang.NullPointerException

        Object object = "123";
        String stringObject = (String) object;
        //Integer integer = (Integer) object;  Exception in thread "main" java.lang.ClassCastException


        Integer integer = null;
        // 1. Несколько блоков catch при обработке разных исключений обрабатываются разными способами:
        try {
            if (System.currentTimeMillis() % 2 == 0) integer = (Integer) object;
        } catch (ClassCastException e) {
            System.out.println("Err1" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Err2" + e.getMessage());
        }

        // 2. Несколько блоков catch при обработке разных исключений обрабатываются одним способом:
        try {
            if (System.currentTimeMillis() % 2 == 0) integer = (Integer) object;
        } catch (ClassCastException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Err" + e.getMessage());
        }

        // 3. Через общего родителя:
        try {
            if (System.currentTimeMillis() % 2 == 0) integer = (Integer) object;
        } catch (RuntimeException e) {
            System.out.println("Err" + e.getMessage());
        }

        // 4. Через общего родителя + несколько исключений обрабатываются одним способом, другие - другим:
        try {
            if (System.currentTimeMillis() % 2 == 0) integer = (Integer) object;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Err1" + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Err2" + e.getMessage());
        }

        // Необязательный блок finally:
        try {
            if (System.currentTimeMillis() % 2 == 0) integer = (Integer) object;
        } catch (ArrayIndexOutOfBoundsException | ClassCastException e) {
            System.out.println("Err1" + e.getMessage());
        } finally {
            // блок используется для инструкций связанных с корректным завершением программы, закрытием ресурсов.
            System.out.println("После обработки и отлова исключений бязательно выполняются инструкции из этого блока, потом программа завершается");
        }


        try {
            readFromJsonFile(".json");
        } catch (IOException e) {
            throw new RuntimeException(e + "ERROR");
        }


    }

    public static void readFromJsonFile(String fileName) throws IOException {
        if (!fileName.equals(".json")) {
            // Исключение времени компиляции
            throw new IOException("Err");
        }
        System.out.println("read from " + fileName);
    }


}
