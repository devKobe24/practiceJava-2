package operands.rightOperand;

import operands.inputLogic.InputLogic;
import operands.type.OperandsType;

public class RightOperand {
  private int operand;
  private final String RIGHT = OperandsType.RIGHT.getOperandType();

  public RightOperand() {
    InputLogic inputRightOperandLogic = new InputLogic();
    int rightOperand = (Integer) inputRightOperandLogic.inputOperand(RIGHT).getLeftHands();

    this.operand = rightOperand;
  }

  public int getRightOperand() {
    return this.operand;
  }
}
