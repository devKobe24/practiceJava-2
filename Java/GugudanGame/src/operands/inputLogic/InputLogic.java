package operands.inputLogic;

import java.util.Scanner;
import operands.Tuple;
import operands.leftOperand.LeftOperand;
import operands.rightOperand.RightOperand;
import operator.MultiplyOperator;

public class InputLogic {

  public void gugudanLogic() {
    LeftOperand leftOperand = new LeftOperand();
    RightOperand rightOperand = new RightOperand();
    MultiplyOperator multiplyOperator = new MultiplyOperator();

    int leftOperandNumber = leftOperand.printLeftOperandMessage();
    int rightOperandNumber = rightOperand.printRightOperandMessage();

    int result = multiplyOperator.multiply(leftOperandNumber, rightOperandNumber);
  }




}
