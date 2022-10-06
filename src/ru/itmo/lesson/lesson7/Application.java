package ru.itmo.lesson.lesson7;

import ru.itmo.lesson.lesson7.units.King;

public class Application {

    public static void main(String[] args){


        King arthur = new King(2000);
        King karl = new King(1000);

        arthur.minusHealScore(500);
        arthur.rest(karl);
        System.out.println(arthur.getHealthScore());
        arthur.plusHealth(300);
        System.out.println(arthur.getHealthScore());


    }
}
