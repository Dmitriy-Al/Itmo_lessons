package homework6.catcher;

public class Cat {

    //Класс Кот: имя, скорость, вес, пойманные мыши;
    //Кот хранит информацию о пойманных мышах (максимум о 100).


    private final Mouse[] caughtMouse = new Mouse[100];
    private String name;
    private int speed;
    private int weight;

    public Cat(String name, int speed, int weight) {
        setCatName(name);
        setCatSpeed(speed);
        setCatWeight(weight);
    }

    private void setCatName(String name) {
        if (name.length() >= 1) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Err! Name cant's to be less than 1 symbol");
        }
    }

    private void setCatSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("Err! Speed cant's to be less 0");
        }
    }

    private void setCatWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Err! Weight cant's to be less 0");
        }
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

    protected void isCatchMouse(Mouse... mouse) {   //Кот ловит мышь, только, если его скорость выше, чем у мыши. В качестве аргумента метод принимает вариативное кол-во мышей.
        for (Mouse m : mouse) {
            if (this.getCatsSpeed() > m.getMousesSpeed()) {
                for (int i = 0; i < caughtMouse.length; i++) {
                    if (caughtMouse[i] == null) {
                        caughtMouse[i] = m;
                        break;
                    }
                }
            }
        }
    }

    protected void isSnatchMouse(Cat secondCat) {                //Кот может напасть на другого кота и, если он больше противника (по весу),
        int firstCatAllMouses = this.getCountOfMouses();        // то может отобрать его мышей (если скорость мыши выше, чем скорость кота, она убежит).
        int secondCatAllMouses = secondCat.getCountOfMouses();

        if (this.weight > secondCat.weight) {
            for (int i = 0; i < caughtMouse.length && i < firstCatAllMouses + secondCatAllMouses; i++) {
                if (caughtMouse[i] == null) {
                    if (secondCat.caughtMouse[i - firstCatAllMouses].getMousesSpeed() < this.getCatsSpeed()) {
                        this.caughtMouse[i] = secondCat.caughtMouse[i - firstCatAllMouses];
                    }
                    secondCat.caughtMouse[i - firstCatAllMouses] = null;
                }
            }
        } else if (this.weight == secondCat.weight) {
            System.out.println("The power of cats is the same, each cant's to win other...");
            return;
        } else {
            for (int i = 0; i < caughtMouse.length && i < firstCatAllMouses + secondCatAllMouses; i++) {
                if (secondCat.caughtMouse[i] == null) {
                    if (this.caughtMouse[i - secondCatAllMouses].getMousesSpeed() < secondCat.getCatsSpeed()) {
                        secondCat.caughtMouse[i] = this.caughtMouse[i - secondCatAllMouses];
                    }
                    this.caughtMouse[i - secondCatAllMouses] = null;
                }
            }
        }
    }

}
