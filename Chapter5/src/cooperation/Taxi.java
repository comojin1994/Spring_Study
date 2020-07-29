package cooperation;

public class Taxi {
    int passengerCount;
    int money;

    public void take(int money) {
        this.money += money;
        this.passengerCount++;
    }

    public void showTaxiInfo() {
        System.out.println("Taxi has " + passengerCount + " and " + money);
    }
}
