package template2;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("Advanced is running");
    }

    @Override
    public void jump() {
        System.out.println("Advanced is jumping");
    }

    @Override
    public void turn() {
        System.out.println("Advanced cannot turn");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("===== Advanced Level =====");
    }
}
