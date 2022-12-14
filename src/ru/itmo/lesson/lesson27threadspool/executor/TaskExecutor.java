package ru.itmo.lesson.lesson27threadspool.executor;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskExecutor {
    public static void main(String[] args) {
        // пул потоков -
        // реализован на основе порождающего
        // паттерна проектирования - 'объектный пул'

        // пул потоков:
        //   потоки: [thread1, thread2, thread3]
        //   очередь задач: [runnable1, runnable2, runnable3, runnable4]

        // Пул можно создать:
        // 1. фиксированного размера -
        // количество потоков указывается при создании объекта и не меняется
        // 2. гибкого размера -
        // указывается минимальное и максимальное количество потоков
        // 3. пул для выполнения задач с указанным интервалом
        // 4.
        // 5.

        // fixedPool
        // thread1, thread2
        // очередь задач для пула: []
        ExecutorService fixedPool = Executors.newFixedThreadPool(2);
        // передать задачу (Runnable) в очередь на выполнение

        fixedPool.execute(() -> {
            System.out.println("Задача 1"); // run1
        });

        fixedPool.execute(() -> {
            System.out.println("Задача 2"); // run2
        });

        // пул после вызова метода shutdown
        // завершает текущие задачи, но не принимает новые
        // fixedPool.shutdown();
        // после вызова метода shutdown к пулу нельзя обратиться повторно

        // пул после вызова метода shutdownNow прерывает выполнение задач,
        // не принимает новые
        // возвращает список незавершенных задач
        // может вызвать утечку ресурсов
        List<Runnable> runnables = fixedPool.shutdownNow();
        System.out.println(runnables.size());


        ScheduledExecutorService everySevenSecond =
                Executors.newSingleThreadScheduledExecutor();

        // метод не берет в расчет время выполнения задачи
        everySevenSecond.scheduleAtFixedRate(
                () -> { // экземпляр Runnable
                    System.out.println("scheduleAtFixedRate 7");
                },
                0, // первоначальное время ожидания
                7, // задача запускается на выполнение каждые N
                TimeUnit.SECONDS // секунд
        );

        // можно завершить методом shutdown


        ScheduledExecutorService everyThreeSecond =
                Executors.newSingleThreadScheduledExecutor();
        // метод берет в расчет время выполнения задачи
        everyThreeSecond.scheduleWithFixedDelay(
                () -> {
                    System.out.println("scheduleWithFixedDelay 3");
                },
                0, // первоначальное время ожидания
                3, // задача запускается на выполнение каждые N
                TimeUnit.SECONDS // секунд
                // от момента завершения предыдущей задачи
        );

        // можно завершить методом shutdown

        ScheduledExecutorService delayTen =
                Executors.newSingleThreadScheduledExecutor();
        // метод берет в расчет время выполнения задачи
        everyThreeSecond.schedule(
                () -> {
                    System.out.println("schedule 10");
                },
                10, // время ожидания
                TimeUnit.SECONDS // секунд
        );

        // TODO:: какие задачи не стоит передавать в пул потоков
    }
}