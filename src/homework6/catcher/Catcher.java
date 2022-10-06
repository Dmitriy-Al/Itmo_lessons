package homework6.catcher;

public class Catcher {

    public static void main(String[] args) {

        //Кот ловит мышь, только, если его скорость выше, чем у мыши.
        //Кот может напасть на другого кота и, если он больше противника (по весу),
        //то может отобрать его мышей (если скорость мыши выше, чем скорость кота, она убежит).


        Mouse mouse1 = new Mouse(4); //Мыши
        Mouse mouse2 = new Mouse(5);
        Mouse mouse3 = new Mouse(6);
        Mouse mouse4 = new Mouse(7);
        Mouse jerry = new Mouse(8);


        Cat tomCat = new Cat("Tom", 8, 5); //Том

        Cat garfieldCat = new Cat("Garfield", 6, 8); //Гарфилд


        tomCat.isCatchMouse(tomCat, mouse1, mouse2, mouse3, mouse4, jerry); //Том ловит мышей

        garfieldCat.isCatchMouse(garfieldCat, mouse1, mouse2, mouse3, mouse4, jerry); //Гарфилд ловит мышей

        System.out.println("\nAmount of caught mouses:");

        tomCat.showCaughtMouse(); //Пойманные мыши
        garfieldCat.showCaughtMouse(); //Пойманные мыши

        System.out.println("\nCaught mouses:");

        System.out.println("Garfield caught: " + garfieldCat.getCountOfMouses() + " mouses");
        System.out.println("Tom caught: " + tomCat.getCountOfMouses() + " mouses");

        garfieldCat.isSnatchMouse(garfieldCat, tomCat); //Кот может напасть на другого кота и, если он больше противника (по весу), то может отобрать его мышей (если скорость мыши выше, чем скорость кота, она убежит).

        System.out.println("\nAfter fought cats have mouses:");

        tomCat.showCaughtMouse(); //Пойманные мыши
        garfieldCat.showCaughtMouse(); //Пойманные мыши

    }
}
