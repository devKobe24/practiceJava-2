package operands.leftOperand;

import operands.inputLogic.InputLogic;
import operands.type.OperandsType;

public class LeftOperand {
  private int operand;
  private final String LEFT = OperandsType.LEFT.getOperandType();

  public LeftOperand() {
    InputLogic inputLeftOperandLogic = new InputLogic();
    int leftOperand = (Integer) inputLeftOperandLogic.inputOperand(LEFT).getLeftHands();

    this.operand = leftOperand;
  }

  public int getLeftOperand() {
    return this.operand;
  }
}
