package ru.itmo.lesson.lesson7.units;

import ru.itmo.lesson.lesson7.base.Unit;

public class King extends Unit {

    public int gold = 500;

    public King(int healthScore) {
        super(healthScore);
    }

    public int getGold(){
        return gold;
    }

    @Override
    public void rest(){
        if(gold < 10) return;
        gold -= 10;
        super.rest();
        System.out.println("Kings health is up");
    }

    public void rest(Unit unit){
        if(gold < 20) return;
        gold -= 10;
        plusHealth(2);
        unit.plusHealth(1);
        System.out.println("Kings and units health are up");
    }

}
