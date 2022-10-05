package homework6.catcher;

public class Catcher  {

    public static void main(String[] args) {

        //Кот ловит мышь, только, если его скорость выше, чем у мыши.
        //Кот может напасть на другого кота и, если он больше противника (по весу),
        //то может отобрать его мышей (если скорость мыши выше, чем скорость кота, она убежит).


        Mouse mouse1 = new Mouse(4);
        Mouse mouse2 = new Mouse(5);
        Mouse mouse3 = new Mouse(6);
        Mouse mouse4 = new Mouse(7);
        Mouse mouse5 = new Mouse(8);

        Cat grayCat = new Cat("Tom", 7,6);

        Cat gingerCat = new Cat("Barsik", 8, 5);

        grayCat.isCatchMouse(grayCat.getCatsSpeed(), mouse1.getMousesSpeed());
        grayCat.isCatchMouse(grayCat.getCatsSpeed(), mouse2.getMousesSpeed());
        grayCat.isCatchMouse(grayCat.getCatsSpeed(), mouse3.getMousesSpeed()); //Том ловит мышей
        grayCat.isCatchMouse(grayCat.getCatsSpeed(), mouse4.getMousesSpeed());
        grayCat.isCatchMouse(grayCat.getCatsSpeed(), mouse5.getMousesSpeed());

        gingerCat.isCatchMouse(gingerCat.getCatsSpeed(), mouse1.getMousesSpeed());
        gingerCat.isCatchMouse(gingerCat.getCatsSpeed(), mouse2.getMousesSpeed());
        gingerCat.isCatchMouse(gingerCat.getCatsSpeed(), mouse3.getMousesSpeed()); //Барсик ловит мышей
        gingerCat.isCatchMouse(gingerCat.getCatsSpeed(), mouse4.getMousesSpeed());
        gingerCat.isCatchMouse(gingerCat.getCatsSpeed(), mouse5.getMousesSpeed());

        System.out.println("\nAmount of mouses: \n");

        grayCat.showCaughtMouse();
        gingerCat.showCaughtMouse(); //Пойманные мыши


        System.out.println(grayCat.getCountOfMouses());

        System.out.println("\nThe first cat attempts to take out mouses from the second cat\n");

        grayCat.isCatSnatchMouse(grayCat.getCatWeight(), grayCat.getCountOfMouses(), gingerCat.getCatWeight(), gingerCat.getCountOfMouses()); //Том пытаеся отнять мышей у Барсика

        System.out.println("\nAmount of mouses: \n");

        grayCat.showCaughtMouse(); //Теперь мышей у Тома

    }
}
