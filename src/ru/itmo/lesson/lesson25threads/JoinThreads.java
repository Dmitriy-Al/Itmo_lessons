package ru.itmo.lesson.lesson25threads;

import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class JoinThreads {

    public static void main(String[] args) {

        // метод Join используется, если нужно дождаться завершения других потоков

        CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();

        Thread thread01 = new Thread(
                () -> {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    integers.add(1);
                    System.out.println("Поток thread01 получил данные");
                }
        );

        Thread thread02 = new Thread(
                () -> {
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    integers.add(2);
                    System.out.println("Поток thread02 получил данные");
                });

        Thread thread03 = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные");
            int userNum = scanner.nextInt();
            System.out.println("Поток thread03 получил данные: " + userNum);
            integers.add(userNum);
        });

        thread01.start();
        thread02.start();
        thread03.start();

        // основной поток ждёт завершение других потоков

        try{
            thread01.join();
            thread02.join();
            thread03.join(10000); // время ожидания присоединения
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main " + integers);

    }
}
