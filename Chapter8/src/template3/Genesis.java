package template3;

public class Genesis extends Car {
    @Override
    public void start() {
        System.out.println("Genesis turn on");
    }

    @Override
    public void drive() {
        System.out.println("Genesis is driving");
    }

    @Override
    public void stop() {
        System.out.println("Genesis is stopping");
    }

    @Override
    public void turnoff() {
        System.out.println("Genesis turn off");
    }
}