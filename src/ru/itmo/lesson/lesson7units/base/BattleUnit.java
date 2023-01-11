package ru.itmo.lesson.lesson7units.base;

import ru.itmo.lesson.lesson7units.units.Infantry;
import ru.itmo.lesson.lesson7units.units.Knight;

import java.io.Serializable;

abstract public class BattleUnit extends Unit implements Serializable {

    protected int attackScore;

    public BattleUnit(int healthScore, int attackScore) {
        super(healthScore);
        if (attackScore < 1) {
            throw new IllegalArgumentException("Err");
        } else {
            this.attackScore = attackScore;
        }
    }

    public abstract int getAttackScore(BattleUnit enemy);

    abstract public void attack(BattleUnit enemy);

    // фабричный метод, создаёт объекты и ТОЛКО ПОТОМУ ОН СТАТИЧЕСКИЙ
    public static BattleUnit getBattleUnits() {
        String[] types = {"knight", "infantry"};
        int random = (int) (Math.random() * 10);
        if(random > 5) {
            return new Knight(100, 30, 20);   //реализовать тип создаваемого юнита через рандом в зависимости от типа создаем объект того или иного юнита
        } else {
            return new Infantry(100, 30, 20);
        }

    }



    public static BattleUnit[] getBattleUnit(int count) {// в статических методах можно обратиться только к статическим свойствам или вызвать стат. методы класса
        BattleUnit[] units = new BattleUnit[count];
        for(int i = 0; i < units.length; i++){
            units[i] = getBattleUnits();
        }
        return units;
    }
}