package ru.itmo.lesson.lesson25threads;

public class BaseInfo {
    public static void  main(String[] args){

        // После создания процесса в ОС создается основной поток
        // Поток представлен экземпляром класса Thread

        SomeThread thread01 = new SomeThread(); // Это поток
        thread01.setName("thread01 "); // .setName используется для отладки
        thread01.setPriority(2); // Приоритет потока от 1 до 10, по умолчанию - 5

        //thread01.run(); // так поток не запускается, происходит простое последовательное выполнение команд

        // передача thread01 планировщику потоков (Thread Scheduler)
        thread01.start();

        SomeThread thread02 = new SomeThread();
        thread01.setPriority(9); // узнать приоритет можно из .getPriority
        thread02.start();

        SomeTask someTask01 = new SomeTask(); // Это не поток, только объект с инструкцией Runnable
        Thread thread03 = new Thread(someTask01);
        thread03.start();

        new Thread(() -> System.out.println("lambda thread")).start();

        //  thread01.stop(); // Не используется

        // Завершение потока происходит:
        // 1) если выброшено необработанное исключение
        // 2) если остановилась виртуальная машина jvm
        // 3) если поток является фоновым и другие не фоновые потоки завершили работу
        // 4) если все инструкции потока выполнены

        // Thread:
        // свойство interrupted = false
        // isInterrupted() - возвращает значение
        // метод interrupt() меняет значение interrupted на true
        // метод не останавливает поток, просто меняет значение свойства

    }
}
