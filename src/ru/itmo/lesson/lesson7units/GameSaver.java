package ru.itmo.lesson.lesson7units;

import ru.itmo.lesson.lesson7units.base.Unit;
import java.io.Serializable;
import java.util.ArrayList;

public class GameSaver implements Serializable {

    ArrayList<Unit> unit = new ArrayList<>();

    public GameSaver(Unit... units){
        for(Unit u : units){
            this.unit.add(u);
        }
    }

    public ArrayList<Unit> getUnit(){
        return unit;
    }


}
