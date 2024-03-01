package access.ex;

public class CounterMainByYoungHan {

  public static void main(String[] args) {
    MaxCounterByYoungHan counter = new MaxCounterByYoungHan(3);
    counter.increment();
    counter.increment();
    counter.increment();
    counter.increment();
    int count = counter.getCount();
    System.out.println(count);
  }
}
