package ru.itmo.lesson.lesson25threads;

public class Interrupting {

    public static void  main(String[] args) {
        // фоновый поток (поток-демон) завершает работу,
        // когда завершили работу все потоки, не являющиеся фоновыми

        // основной поток (main)
        // дополнительные потоки
        // фоновый поток (останавливается в любом случае после остановки других потоков)

        Thread threadDemon = new Thread(() -> {
            while(true){
                System.out.println("Запись данных");
            }
        });

        threadDemon.setDaemon(true); // поток становится фоновым
        threadDemon.start();

        System.out.println("stop");

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

        Thread thread02 = new Thread(() -> {
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("Инструкции потока");
                // если метод .interrupt() вызван когда поток находится в состоянии ожидания,
                // то будет выброшено InterruptedException. Это приведёт к тому, что
                // свойство interrupted снова изменится на false
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    System.out.println("Завершение потока");
                    Thread.currentThread().interrupt();
                }
            }
        });

        thread02.start(); // передача thread02 планировщику потоков (Thread Scheduler)
        thread02.interrupt(); // interrupted = true (метод вызывается в зависимости от логики программы)

    }
}
