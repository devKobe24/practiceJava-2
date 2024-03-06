package static2.ex;

public class Car {
  private static int carCount;

  public Car(String modelName) {
    System.out.println("차량 구입, 이름: " + modelName);
    this.carCount++;
  }

  public static void showTotalCars() {
    System.out.println("구매한 차량 수: " + carCount);
  }
}
