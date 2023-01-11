package ru.itmo.lesson.lesson25threads;

public class SomeThread extends Thread {

    public void SomeVoid(){
        System.out.println(this.getName());
        System.out.println("поток main = " + Thread.currentThread().getName()); // основной поток main
    }

    @Override
    public void run(){  // Инструкции потока
        System.out.println(this.getName());
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 300; i++) {
            System.out.println("THREAD 2 = " + i);
        }
    }

}
