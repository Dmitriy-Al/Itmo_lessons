package ru.itmo.lesson.lesson7.base;

public abstract class Unit {

    protected int healthScore;
    private final int maxHealthScore = 100;

    public Unit(int healthScore) {
        if (healthScore < 1) {
            throw new IllegalArgumentException("Err, healthScore cants to be less 1");
        }
        this.healthScore = healthScore;
    }

    public boolean isAlive() {
        return healthScore > 0;
    }

    public void plusHealth(int healthScore) {
        if (isAlive()) {
            this.healthScore += healthScore;
            if (this.healthScore > maxHealthScore) {
                this.healthScore = maxHealthScore;
            }
        }
        //или так: this.healthScore = Math.min(this.healthScore + healthScore, maxHealthScore);
    }

    public void minusHealScore(int healthScore) {
        if (isAlive()) this.healthScore -= healthScore;
    }

    public int getHealthScore(){
        return healthScore;
    }

    public void rest(){
        plusHealth(1);
        System.out.println("Units health is up");
    }


}
