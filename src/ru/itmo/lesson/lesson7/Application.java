package ru.itmo.lesson.lesson7;

import ru.itmo.lesson.lesson7.base.BattleUnit;
import ru.itmo.lesson.lesson7.units.Infantry;
import ru.itmo.lesson.lesson7.units.King;
import ru.itmo.lesson.lesson7.units.Knight;

public class Application {

    public static void main(String[] args){


        King arthur = new King(100);
        King karl = new King(100);

        arthur.minusHealScore(50);
        arthur.rest(karl);
        System.out.println(arthur.getHealthScore());
        arthur.plusHealth(30);
        System.out.println(arthur.getHealthScore());

        Knight knight = new Knight(100, 30, 20);

        Infantry infantry = new Infantry(100, 30, 20);

        BattleUnit battleUnit01 = new Knight(100, 30, 20);// методы ограничены методами BattleUnit((

        BattleUnit battleUnit02 = new Infantry(100, 30, 20);// методы ограничены методами BattleUnit((

        infantry.upAdditionalAttack();
        infantry.attack(knight);
        System.out.println("hp = " + infantry.getHealthScore());
        System.out.println("hp = " + knight.getHealthScore());
        infantry.attack(knight);
        System.out.println("hp = " + infantry.getHealthScore());
        System.out.println("hp = " + knight.getHealthScore());

        BattleUnit[] bu = {battleUnit01, knight, battleUnit02, infantry};

    }
}
//аргумент в методе может быть final и доступен только для чтения