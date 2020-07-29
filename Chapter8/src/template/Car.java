package template;

public abstract class Car {

    public abstract void dirve();

    public abstract void stop();

    public void startCar() {
        System.out.println("Turn on");
    }

    public void turnOff() {
        System.out.println("Turn Off");
    }

    public void washCar() {
    }

    final public void run() {
        startCar();
        dirve();
        stop();
        turnOff();
        washCar();
    }
}
