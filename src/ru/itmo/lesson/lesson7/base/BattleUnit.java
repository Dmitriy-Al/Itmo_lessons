package ru.itmo.lesson.lesson7.base;

abstract public class BattleUnit extends Unit {

    protected int attackScore;

    protected BattleUnit(int healthScore, int attackScore) {
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
  /*  public static BattleUnit getBattleUnits() {
        String[] types = {"knight", "infantry"};
        //реализовать тип создаваемого юнита через рандом
        //в зависимости от типа создаем объект того или иного юнита

    }


    public static BattleUnit[] getBattleUnit(int count) {
        BattleUnit[] units = new BattleUnit[count];
        for(int i = 0; i < units.length; i++){
            // в статических методах можно обратиться только к статическим свойствам или
            // вызвать стат. методы класса
            units[i] = getBattleUnit();
        }
        return units;
    } */
}