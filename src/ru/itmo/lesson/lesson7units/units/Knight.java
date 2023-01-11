package ru.itmo.lesson.lesson7units.units;

import ru.itmo.lesson.lesson7units.base.BattleUnit;

import java.io.Serializable;

public class Knight extends BattleUnit implements Serializable {

    private int additionalHealth;

    public Knight(int healthScore, int attackScore, int additionalHealth){
        super(healthScore, attackScore);

        if(additionalHealth < 1){
            throw new IllegalArgumentException("Err, additional health cant's to be less than 1");
        } else {
            this.additionalHealth = additionalHealth;
        }

    }

    private void upAdditionalHealth(){
        additionalHealth += (int) (Math.random() * 3);
    }


    @Override
    public int getAttackScore(BattleUnit enemy) {
        return attackScore;
    }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Knight attacks");
        enemy.minusHealScore(attackScore);
    }


}
