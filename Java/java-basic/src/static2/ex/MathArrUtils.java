package static2.ex;

public class MathArrUtils {
  private int[] values;

  private MathArrUtils(int[] values) {
    this.values = values;
  }

  public static int sum(int[] values) {
    int sum = 0;
    for (int value : values) {
      sum += value;
    }
    return sum;
  }

  public static Double average(int[] values) {
    Double average = 0.0;
    Double sum = 0.0;
    for (int value : values) {
      sum += value;
      average = (sum / values.length);
    }
    return average;
  }

  public static int min(int[] values) {
    int min = values[0];
    for (int value : values) {
      if (min > value) {
        min = value;
      }
    }
    return min;
  }

  public static int max(int[] values) {
    int max = values[0];
    for (int value : values) {
      if (max < value) {
        max = value;
      }
    }
    return max;
  }
}
