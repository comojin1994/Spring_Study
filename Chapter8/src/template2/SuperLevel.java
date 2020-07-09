package template2;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("Super is running");
    }

    @Override
    public void jump() {
        System.out.println("Super is jumping");
    }

    @Override
    public void turn() {
        System.out.println("Super can turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("===== Super Level =====");
    }
}
