package ru.itmo.lesson.lesson7units;

import ru.itmo.lesson.lesson7units.base.Unit;

import java.io.*;
import java.util.ArrayList;

public class SaveGameLoader {

    public static void main(String[] args) {

        ArrayList<Unit> unit = new ArrayList<>();

        GameSaver saver = null;

        try (
                FileInputStream fileInputStream = new FileInputStream("C:/Users/admit/OneDrive/Рабочий стол/Game_save.txt");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        )
        {
            saver = (GameSaver) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        unit = saver.getUnit();

        for (Unit u : unit) {
            System.out.println("unit = " + u);
        }


    }
}