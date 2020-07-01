package Exercise;

public class OrderTest {
    public static void main(String[] args) {
        Order firstOrder = new Order();
        firstOrder.orderNumber = "201907210001";
        firstOrder.orderId = "abc123";
        firstOrder.orderDate = "2019년 7월 21일";
        firstOrder.orderName = "홍길동";
        firstOrder.orderThingNumber = "PD0345-12";
        firstOrder.orderAddress = "서울시 영등포구 여의도동 20번지";

        firstOrder.orderInfo();;
    }
}
