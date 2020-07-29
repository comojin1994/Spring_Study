package Exercise;

public class Order {
    String orderNumber;
    String orderId;
    String orderDate;
    String orderName;
    String orderThingNumber;
    String orderAddress;

    void orderInfo() {
        System.out.println("주문 번호 : " + orderNumber);
        System.out.println("주문자 아이디 : " + orderId);
        System.out.println("주문 날짜 : " + orderDate);
        System.out.println("주문자 이름 : " + orderName);
        System.out.println("주문 상품 번호 : " + orderThingNumber);
        System.out.println("배송 주소 : " + orderAddress);
    }
}
