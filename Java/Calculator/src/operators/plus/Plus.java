package operators.plus;

import operators.Operator;
import operators.Operators;

public class Plus extends Operator {
  String plusOperationSysmbol = "+";
  Operators plusOperator = Operators.PLUS;
  int leftOperand;
  int rightOperand;

  public Plus(int leftOperand, int rightOperand) {
    this.leftOperand = leftOperand;
    this.rightOperand = rightOperand;
  }

  @Override
  public void getCalculationResult(int left, int right, String operator) {
    super.getCalculationResult(left, right, operator);
  }
}
