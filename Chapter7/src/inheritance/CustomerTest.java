package inheritance;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "Lee");
//        customerLee.setCustomerName("Lee");
//        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020, "Kim");
//        Customer customerKim = new VIPCustomer(10020, "Kim");
//        customerKim.setCustomerName("Kim");
//        customerKim.setCustomerID(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());

//        customerKim.
//        Customer 과 VIPCustomer 로 선언 했을시 매서드를 사용할 수 있는것이 다름
    }
}
