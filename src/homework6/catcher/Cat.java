package homework6.catcher;

public class Cat {

    //Класс Кот: имя, скорость, вес, пойманные мыши;
    //Кот хранит информацию о пойманных мышах (максимум о 100).


    private final Mouse[] caughtMouse = new Mouse[100];
    private String name;
    private int speed;
    int weight;

    public Cat(String name, int speed, int weight) {
        setAboutCatInfo(name, speed, weight);
    }

    private void setAboutCatInfo(String name, int speed, int weight) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
    }

    protected int getCatsSpeed() {
        return speed;
    }

    protected int getCountOfMouses() {
        int counter = 0;
        for (Mouse m : caughtMouse) if (m != null) counter++;
        return counter;
    }

    protected void showCaughtMouse() {
        for (Mouse m : caughtMouse) {
            if (m != null) System.out.println(name + " got the mouse " + m);
        }
    }

    protected void isCatchMouse(Cat cat, Mouse... mouse) {   //Кот ловит мышь, только, если его скорость выше, чем у мыши. В качестве аргумента метод принимает вариативное кол-во мышей.
        for (Mouse m : mouse) {
            if (cat.getCatsSpeed() > m.getMousesSpeed()) {
                for (int i = 0; i < caughtMouse.length; i++) {
                    if (caughtMouse[i] == null) {
                        caughtMouse[i] = m;
                        break;
                    }
                }
            }
        }
    }

    protected void isSnatchMouse(Cat firstCat, Cat secondCat) {     //Кот может напасть на другого кота и, если он больше противника (по весу),
        int firstCatAllMouses = firstCat.getCountOfMouses();        // то может отобрать его мышей (если скорость мыши выше, чем скорость кота, она убежит).
        int secondCatAllMouses = secondCat.getCountOfMouses();

        if (firstCat.weight > secondCat.weight) {
            for (int i = 0; i < caughtMouse.length && i < firstCatAllMouses + secondCatAllMouses; i++) {
                if (caughtMouse[i] == null) {
                    if (secondCat.caughtMouse[i - firstCatAllMouses].getMousesSpeed() < firstCat.getCatsSpeed()) {
                        firstCat.caughtMouse[i] = secondCat.caughtMouse[i - firstCatAllMouses];
                    }
                    secondCat.caughtMouse[i - firstCatAllMouses] = null;
                }
            }
        } else if (firstCat.weight == secondCat.weight) {
            System.out.println("The power of cats is the same, each cant's to win other...");
            return;
        } else {
            for (int i = 0; i < caughtMouse.length && i < firstCatAllMouses + secondCatAllMouses; i++) {
                if (secondCat.caughtMouse[i] == null) {
                    if (firstCat.caughtMouse[i - secondCatAllMouses].getMousesSpeed() < secondCat.getCatsSpeed()) {
                        secondCat.caughtMouse[i] = firstCat.caughtMouse[i - secondCatAllMouses];
                    }
                    firstCat.caughtMouse[i - secondCatAllMouses] = null;
                }
            }
        }
    }

}
