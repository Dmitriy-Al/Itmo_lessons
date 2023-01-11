package ru.itmo.lesson.lesson24patterns;

public class MeteoStation implements WindObserver{
    @Override
    public void low(double speed) {
        System.out.println("MeteoStation low");
    }

    @Override
    public void medium(double speed) {
        System.out.println("MeteoStation medium");
    }

    @Override
    public void high(double speed) {
        System.out.println("MeteoStation high");
    }
}
