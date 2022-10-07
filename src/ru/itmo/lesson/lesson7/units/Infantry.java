package ru.itmo.lesson.lesson7.units;

import ru.itmo.lesson.lesson7.base.BattleUnit;

public final class Infantry extends BattleUnit {
//от final класса наследоваться запрещено
    private int additionalAttack;

    public Infantry(int healthScore, int attackScore, int additionalAttack){
        super(healthScore, attackScore);
        if(additionalAttack < 1){
            throw new IllegalArgumentException("Err, additional attack cant's to be less than 1");
        } else {
            this.additionalAttack = additionalAttack;
        }
    }

    public void upAdditionalAttack(){
        additionalAttack += (int) (Math.random() * 10);
    }

    @Override
    public int getAttackScore(BattleUnit enemy) {
        return attackScore;
    }

    @Override
    public void attack(BattleUnit enemy) {
        System.out.println("Infantry attacks");
        enemy.minusHealScore(attackScore + additionalAttack);
    }

}
