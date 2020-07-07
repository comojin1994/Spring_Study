package inherpolyex;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();

        Customer customerLee = new Customer(10010, "Lee");
        Customer customerShin = new Customer(10020, "Shin");
        Customer customerHong = new GoldCustomer(10030, "Hong");
        Customer customerYul = new GoldCustomer(10040, "Yul");
        Customer customerKim = new VIPCustomer(10050, "Kim", 12345);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerYul);
        customerList.add(customerKim);

        System.out.println("========== Print Customer Info ==========");

        for (Customer customer: customerList){
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("========== SalesRate and Bonus points ==========");

        int price = 10000;
        for (Customer customer: customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " pays " + cost);
            System.out.println(customer.getCustomerName() + " has " + customer.bonusPoint + " points.");
        }
    }
}
