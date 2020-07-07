package inherpolyex;

public class GoldCustomer extends Customer{
    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        bonusPoint = 0;
        bonusRate = 0.02;
        salesRate = 0.1;
    }
}
