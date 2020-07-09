package template3;

public class Avante extends Car{
    @Override
    public void start() {
        System.out.println("Avante turn on");
    }

    @Override
    public void drive() {
        System.out.println("Avante is driving");
    }

    @Override
    public void stop() {
        System.out.println("Avante is stopping");
    }

    @Override
    public void turnoff() {
        System.out.println("Avante turn off");
    }
}
