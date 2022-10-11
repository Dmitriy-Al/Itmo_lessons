package homework6.catcher;

public class Mouse {

    //Класс Мышь: скорость.

    private int speed;

    public Mouse(int speed) {
        setMousesSpeed(speed);
    }

    private void setMousesSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            throw new IllegalArgumentException("Err! Speed cant's to be less 0");
        }
    }

    protected int getMousesSpeed() {
        return speed;
    }

}
