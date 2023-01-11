package ru.itmo.lesson.lesson20serializable;


import java.io.Serializable;

// implements Cloneable необходимо,
// если происходит вызов метода super.clone();
public class Point implements Cloneable, Serializable {

    transient public final String description = "для создания точки необходимо просто..."; // transient помеченный объект не передаётся!
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // protected Object clone()
    // переопределние метода clone класса Object
    @Override
    public ru.itmo.lesson.lesson10cloneable.Point clone() {
        try {
            return (ru.itmo.lesson.lesson10cloneable.Point) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Клонирование не поддерживается");
            return null;
        }
    }
}