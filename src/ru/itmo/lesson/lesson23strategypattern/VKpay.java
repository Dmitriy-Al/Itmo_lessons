package ru.itmo.lesson.lesson23strategypattern;

public class VKpay implements Payment {


    @Override
    public void pay(double sum) {
        System.out.println("VKpay оплата " + sum);
    }

    @Override
    public void cancel() {

    }
}
