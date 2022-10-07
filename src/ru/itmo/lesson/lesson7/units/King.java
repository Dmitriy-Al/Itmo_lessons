package ru.itmo.lesson.lesson7.units;

import ru.itmo.lesson.lesson7.base.AppSetting;
import ru.itmo.lesson.lesson7.base.BattleUnit;
import ru.itmo.lesson.lesson7.base.Unit;


public class King extends Unit {

    public int gold = AppSetting.GOLD;

    private BattleUnit[] army;

    public King(int healthScore) {
        super(healthScore);
    }

    public int getGold(){
        return gold;
    }

    public void generateArmy(){
        if(gold < AppSetting.ARMY_PRICE){
            System.out.println("Price of army " + AppSetting.ARMY_PRICE);
            return;
        }
        gold -= AppSetting.ARMY_PRICE;
    }

    //army = BattleUnit.getBattleUnits(AppSetting.UNIT_COUNT){

    //}

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

    public  void startBattle(King enemy){
        //реализовать метод войны армий королей
    }

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
