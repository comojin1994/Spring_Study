package inheritance;

public class VIPCustomer extends Customer {

    double salesRatio;
    private int agentID;

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

//        System.out.println("log : VIPCustomer(int, String) generate");
    }

//    public int calcPrice(int price){
//        bonusPoint += price * bonusRatio;
//        return price * salesRatio;
//    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int) (price * salesRatio);
    }

//    public VIPCustomer(){
//
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//
//        System.out.println("log : VIPCustomer generate");
//    }

}
