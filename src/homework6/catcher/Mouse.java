package homework6.catcher;

public class Mouse {

    //Класс Мышь: скорость.

    private int speed;

    public Mouse(int speed) {
        setMousesSpeed(speed);
    }

    private void setMousesSpeed(int s) {
        this.speed = s;
    }

    protected int getMousesSpeed() {
        return speed;
    }

}
