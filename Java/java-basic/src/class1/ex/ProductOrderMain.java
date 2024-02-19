package class1.ex;

public class ProductOrderMain {

  public static void main(String[] args) {
    // 여러 상품의 주문 정보를 담는 배열 생성
    ProcuctOrder[] ordersInfo = new ProcuctOrder[3];

    // 상품 주문 정보를 'ProductOrder' 타입의 변수로 받아 저장
    ProcuctOrder dubu = new ProcuctOrder();
    dubu.productName = "두부";
    dubu.price = 2000;
    dubu.quantity = 2;
    ordersInfo[0] = dubu;

    ProcuctOrder kimchi = new ProcuctOrder();
    kimchi.productName = "김치";
    kimchi.price = 5000;
    kimchi.quantity = 1;
    ordersInfo[1] = kimchi;

    ProcuctOrder coke = new ProcuctOrder();
    coke.productName = "콜라";
    coke.price = 1500;
    coke.quantity = 2;
    ordersInfo[2] = coke;

    // 상품 주문 정보와 최종 금액 출력
    int totalPrice = 0;
    for (ProcuctOrder orderInfo : ordersInfo) {
      totalPrice += (orderInfo.price * orderInfo.quantity);
      System.out.println("상품명: " + orderInfo.productName + ", 가격: " + orderInfo.price + ", 수량: " + orderInfo.quantity);
    }
    System.out.println("총 결제 금액: " + totalPrice);
  }
}
