package ru.itmo.lesson.lesson7units.units;

import ru.itmo.lesson.lesson7units.base.AppSetting;
import ru.itmo.lesson.lesson7units.base.BattleUnit;
import ru.itmo.lesson.lesson7units.base.Unit;

import java.io.Serializable;


public class King extends Unit implements Serializable {

    private static BattleUnit[] unit = new BattleUnit[100];

    public static int gold = AppSetting.GOLD;

    private BattleUnit[] army;

    public King(int healthScore) {
        super(healthScore);
    }

    public int getGold(){
        return gold;
    }

    public static void generateArmy(){
        if(gold < AppSetting.ARMY_PRICE){
            System.out.println("Price of army " + AppSetting.ARMY_PRICE);
            return;
        }
        gold -= AppSetting.ARMY_PRICE;

        for(int i = 0; i < unit.length; i++){
            if(unit[i] == null && Math.random() < 0.5) {
                unit[i] = new Knight(100, 30, 10);
            }
            else unit[i] = new Infantry(100, 30, 10);
        }
    }


    public void updateArmy(){ // замена неживых юнитов живыми
        for(int i = 0; i < army.length; i++){
            if(gold < AppSetting.UNIT_PRICE){
                System.out.println("It is to expensive");
                return;
            }
            if(!army[i].isAlive()){
                gold -= AppSetting.UNIT_PRICE;
            }
        }
    }

    public  void startBattle(King enemy){}

    @Override
    public void rest(){
        if(gold < AppSetting.REST_PRICE) return;
        gold -= AppSetting.REST_PRICE;
        super.rest();
        System.out.println("Kings health is up");
    }

    public final void rest(Unit unit){ //final метод нельзя переопределить
        if(gold < 20) return;
        gold -= 10;
        plusHealth(2);
        unit.plusHealth(1);
        System.out.println("Kings and units health are up");
    }




}
