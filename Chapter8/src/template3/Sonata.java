package template3;

public class Sonata extends Car {
    @Override
    public void start() {
        System.out.println("Sonata turn on");
    }

    @Override
    public void drive() {
        System.out.println("Sonata is driving");
    }

    @Override
    public void stop() {
        System.out.println("Sonata is stopping");
    }

    @Override
    public void turnoff() {
        System.out.println("Sonata turn off");
    }
}
