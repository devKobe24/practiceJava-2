import operands.leftOperand.LeftOperand;
import operands.rightOperand.RightOperand;
import operator.MultiplyOperator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    MultiplyOperator multiplyOperator = new MultiplyOperator();
    String operator = multiplyOperator.MULTIPLY_OPERATOR;
    System.out.println(operator);

    LeftOperand leftOperand = new LeftOperand();
    int leftOperandNumber = leftOperand.getLeftOperand();
//    System.out.println(leftOperandNumber);

    RightOperand rightOperand = new RightOperand();
    int rightOperandNumber = rightOperand.getRightOperand();
//    System.out.println(rightOperandNumber);

  }
}