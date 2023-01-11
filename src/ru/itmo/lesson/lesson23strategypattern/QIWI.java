package ru.itmo.lesson.lesson23strategypattern;

public class QIWI implements Payment {


    @Override
    public void pay(double sum) {
        System.out.println("QIWI оплата " + sum);
    }

    @Override
    public void cancel() {
;
    }
}
