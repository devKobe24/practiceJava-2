package static2.ex;

public class MathArrayUtilsMain {

  public static void main(String[] args) {
    int[] values = {1, 2, 3, 4, 5};
    System.out.println("sum=" + MathArrUtils.sum(values));
    System.out.println("average=" + MathArrUtils.average(values));
    System.out.println("min=" + MathArrUtils.min(values));
    System.out.println("max=" + MathArrUtils.max(values));
  }

}
