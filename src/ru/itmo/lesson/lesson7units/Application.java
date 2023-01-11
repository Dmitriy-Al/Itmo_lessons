package ru.itmo.lesson.lesson7units;

import ru.itmo.lesson.lesson7units.base.BattleUnit;
import ru.itmo.lesson.lesson7units.base.Unit;
import ru.itmo.lesson.lesson7units.units.Infantry;
import ru.itmo.lesson.lesson7units.units.King;
import ru.itmo.lesson.lesson7units.units.Knight;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Application {

    public static void main(String[] args) {

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

        battleUnit02.getBattleUnits();

        infantry.upAdditionalAttack();
        infantry.attack(knight);
        System.out.println("hp = " + infantry.getHealthScore());
        System.out.println("hp = " + knight.getHealthScore());
        infantry.attack(knight);
        System.out.println("hp = " + infantry.getHealthScore());
        System.out.println("hp = " + knight.getHealthScore());

        BattleUnit[] bu = {battleUnit01, knight, battleUnit02, infantry};

        GameSaver save = new GameSaver(arthur, karl, knight, infantry, battleUnit01, battleUnit02);


        try (
                FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/admit/OneDrive/Рабочий стол/Game_save.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
        )
        {
            objectOutputStream.writeObject(save);

    /*          objectOutputStream.writeObject(arthur);
            objectOutputStream.writeObject(karl);
            objectOutputStream.writeObject(knight);
            objectOutputStream.writeObject(infantry);
            objectOutputStream.writeObject(battleUnit01);
            objectOutputStream.writeObject(battleUnit02);   */

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
//аргумент в методе может быть final и доступен только для чтения