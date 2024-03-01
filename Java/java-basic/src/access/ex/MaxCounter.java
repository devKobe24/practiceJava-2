package access.ex;

public class MaxCounter {

  private int count = 0;
  private int max;

  // public 이기 때문에 다른 패키지에서도 사용 가능.
  // default 이면 현재 패키지 내부에서만 사용 가능.
  public MaxCounter(int max) {
    this.max = max;
  }

  // public 메서드: increment() -> 숫자를 하나 증가.
  public void increment() {
    if (max > count) {
      count += 1;
      System.out.println("숫자를 하나 증가합니다. 현재 count는 " + count + "입니다.");
    } else {
      System.out.println("최대값을 초과할 수 없습니다.");
    }
  }

  // public 메서드: getCount() -> 지금까지 증가한 값을 반환합니다.
  public int getCount() {
    return count;
  }
}
