package template;

public class AICar extends Car{
    @Override
    public void dirve() {
        System.out.println("This car is auto");
        System.out.println("This car can chage root itself");
    }

    @Override
    public void stop() {
        System.out.println("This car can stop auto");
    }

    @Override
    public void washCar() {
        System.out.println("Wash Cars");
    }
}
