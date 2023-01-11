package ru.itmo.lesson.lesson25threads;

public class SomeTask implements Runnable {


    @Override
    public void run(){
        System.out.println("run SomeTask");
    }


}
