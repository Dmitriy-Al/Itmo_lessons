
package ru.itmo.lesson.lesson20;

// class A extends B { }
// class B extends C { }
// Все классы наследуются от класса Object

// interface IA extends IB {}

// class A extends B implements IA {}



public class Application {
    public static void main(String[] args) {

        Point a = new Point(23, -12);
        Point b = new Point(23, -12);
        Point c = new Point(23, -12);
        System.out.println(a); // System.out.println(a.toString());
        System.out.println(b); // System.out.println(b.toString());

        BinHandler<Point> pointBinHandler = new BinHandler<>();
        pointBinHandler.writeToFile(a);
        // ru.itmo.lesson.lesson20.Point@568db2f2  x = 23, y = -12

        Point aFromFile = pointBinHandler.readFromFile();
        // ru.itmo.lesson.lesson20.Point@568db2f2  x = 23, y = -12
        // description - значение по умолчанию
        // для transient свойств восстанавливаются значения по умолчанию





    }


}