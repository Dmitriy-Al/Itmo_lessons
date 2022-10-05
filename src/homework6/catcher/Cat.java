package homework6.catcher;

public class Cat {

    //Класс Кот: имя, скорость, вес, пойманные мыши;
    //Кот хранит информацию о пойманных мышах (максимум о 100).

    private boolean[] caughtMouse = new boolean[100];
    private String name;
    private int speed;
    int weight;

    public Cat(String name, int speed, int weight) {
        setCatInfo(name, speed, weight);
        setCatsName(name);
        setCatsSpeed(speed);
        setWeight(weight);
    }

    private void setCatInfo(String n, int s, int w) {
        name = n;
        speed = s;
        weight = w;
    }

    private void setCatsName(String n) {
        name = n;
    }

    private void setCatsSpeed(int s) {
        speed = s;
    }

    private void setWeight(int w) {
        weight = w;
    }

    protected int getCatsSpeed() {
        return speed;
    }

    protected int getCatWeight() {
        return weight;
    }

    protected int getCountOfMouses() {
        int counter = 0;
        for (boolean b : caughtMouse) if (b) counter++;
        return counter;
    }

    protected void showCaughtMouse() {
        for (boolean b : caughtMouse) {
            if (b) System.out.println(name + " got the mouse " + b);
        }
    }

    protected void isCatchMouse(int catsSpeed, int mousesSpeed) {
        if (catsSpeed > mousesSpeed) {
            for (int i = 0; i < caughtMouse.length; i++) {
                if (caughtMouse[i] == false) {
                    caughtMouse[i] = true;
                    return;
                }
            }
        }
    }

    protected void isCatSnatchMouse(int firstWeight, int countMouses, int secondWeight, int counterMouses) {

        if (firstWeight > secondWeight) {
            for (int i = 0; i < caughtMouse.length && i < countMouses + counterMouses; i++) {
                if (caughtMouse[i] == false) {
                    caughtMouse[i] = true;
                }
            }
        } else {
            for (int i = 0; i < caughtMouse.length; i++) {
                if (caughtMouse[i] == true) {
                    caughtMouse[i] = false;
                }
            }
        }
    }


}
