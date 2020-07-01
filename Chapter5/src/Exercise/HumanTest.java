package Exercise;

public class HumanTest {
    public static void main(String[] args) {
        Human humanJames = new Human();
        humanJames.age = 40;
        humanJames.name = "James";
        humanJames.isMarried = true;
        humanJames.numberOfChild = 3;

        humanJames.humanInfo();
    }
}
