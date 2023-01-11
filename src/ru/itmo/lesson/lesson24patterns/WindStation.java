package ru.itmo.lesson.lesson24patterns;

public class WindStation implements WindObserver{


    @Override
    public void low(double speed) {
        System.out.println("WindStation low");
    }

    @Override
    public void medium(double speed) {
        System.out.println("WindStation medium");
    }

    @Override
    public void high(double speed) {
        System.out.println("WindStation high");
    }
}
