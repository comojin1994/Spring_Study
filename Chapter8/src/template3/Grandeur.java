package template3;

public class Grandeur extends Car {
    @Override
    public void start() {
        System.out.println("Grandeur turn on");
    }

    @Override
    public void drive() {
        System.out.println("Grandeur is driving");
    }

    @Override
    public void stop() {
        System.out.println("Grandeur is stopping");
    }

    @Override
    public void turnoff() {
        System.out.println("Grandeur turn off");
    }
}
