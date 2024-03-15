package operator;

public class MultiplyOperator {
  public final String MULTIPLY_OPERATOR = "*";

  public int multiply(int leftOperand, int rightOperand) {
    System.out.println(leftOperand + " " + this.MULTIPLY_OPERATOR + " " + rightOperand + " = " + leftOperand * rightOperand);
    return leftOperand * rightOperand;
  }
}
