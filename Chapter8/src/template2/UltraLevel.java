package template2;

public class UltraLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("Ultra is running");
    }

    @Override
    public void jump() {
        System.out.println("Ultra is jumping");
    }

    @Override
    public void turn() {
        System.out.println("Ultra can super turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("===== Ultra Level =====");
    }
}
