package template;

public class ManualCar extends Car {
    @Override
    public void dirve() {
        System.out.println("This car is NOT auto");
        System.out.println("This car can NOT change root itself");
    }

    @Override
    public void stop() {
        System.out.println("This car can NOT stop itself");
    }
}
