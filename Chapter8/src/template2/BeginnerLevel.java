package template2;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("Beginner is running");
    }

    @Override
    public void jump() {
        System.out.println("Beginner cannot jumping");
    }

    @Override
    public void turn() {
        System.out.println("Beginner cannot turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("===== Beginner Level =====");
    }
}
