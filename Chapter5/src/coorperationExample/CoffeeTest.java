package coorperationExample;

public class CoffeeTest {
    public static void main(String[] args) {
        Person personKim = new Person("Kim", 20, 10000);
        Person personLee = new Person("Lee", 30, 10000);

        personKim.takeStar(Menu.StarAmericano);
        personLee.takeBean(Menu.BeanLatte);

        personKim.showInfo();
        personLee.showInfo();
    }
}
