package ru.itmo.lesson.lesson7.base;

abstract public class BattleUnit extends Unit {

    protected int attackScore;

    BattleUnit(int healthScore, int attackScore){
        super(healthScore);
        if(attackScore < 1){
            throw new IllegalArgumentException("Err");
        } else {
            this.attackScore = attackScore;
        }
    }

    public abstract int getAttackScore(BattleUnit enemy);




}
