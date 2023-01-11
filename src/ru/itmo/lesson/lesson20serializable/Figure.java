package ru.itmo.lesson.lesson20serializable;


import ru.itmo.lesson.lesson10cloneable.Point;

import java.util.Arrays;

public class Figure {
    private final Point[] points;

    public Figure(int pointsCount) {
        if (pointsCount < 2) {
            throw new IllegalArgumentException("Фигура" +
                    "должна состоять из 2 и более точек");
        }
        this.points = new Point[pointsCount];
    }

    public Point[] getPoints(){
        return points;
    }

    public void addPoint(Point point) {
        for (int i = 0; i < points.length; i++) {
            if (points[i] == null) {
                points[i] = point;
                System.out.println("Точка " + point + " была добавлена");
                return;
            }
        }
        System.out.println("Точка " + point + " не была добавлена." +
                "У фигуры достаточное количество точек.");
    }

    // переопределние метода clone класса Object
    @Override
    public ru.itmo.lesson.lesson10cloneable.Figure clone() {
        // super.clone()
        ru.itmo.lesson.lesson10cloneable.Figure clone = new ru.itmo.lesson.lesson10cloneable.Figure(points.length);
        for (int i = 0; i < points.length; i++) {
            clone.getPoints()[i] = points[i].clone();
        }
        return clone;
    }

    // переопределние метода equals класса Object
    @Override
    public boolean equals(Object object){
        if (this == object) return true;
        if (!(object instanceof ru.itmo.lesson.lesson10cloneable.Figure)) return false;
        ru.itmo.lesson.lesson10cloneable.Figure figure = (ru.itmo.lesson.lesson10cloneable.Figure) object;
        return Arrays.equals(points, figure.getPoints());
    }

    // переопределние метода toString класса Object
    @Override
    public String toString() {
        return "Figure{" +
                "points=" + Arrays.toString(points) +
                '}';
    }
}
