package inheritance;

public class OverridingTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "Lee");
        customerLee.bonusPoint = 1000;
        int priceLee = customerLee.calcPrice(10000);

        VIPCustomer customerKim = new VIPCustomer(10020, "Kim");
        customerKim.bonusPoint = 10000;
        int priceKim = customerKim.calcPrice(10000);


        System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee + "원 입니다.");
        System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim + "원 입니다.");

        Customer customerNo = new VIPCustomer(10030, "La");
        customerNo.bonusPoint = 10000;
        int priceNo = customerNo.calcPrice(10000);
        System.out.println(customerNo.showCustomerInfo() + " 지불금액은 " + priceNo + "원 입니다.");

    }
}
