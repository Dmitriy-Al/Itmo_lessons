package homework6.catcher;

public class Mouse {

    //Класс Мышь: скорость.

    private int speed;

    public Mouse(int speed) {
        setMousesSpeed(speed);
    }

    private void setMousesSpeed(int speed) {
        this.speed = speed;
    }

    protected int getMousesSpeed() {
        return speed;
    }

}
