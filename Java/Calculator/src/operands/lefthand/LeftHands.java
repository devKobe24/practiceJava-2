package operands.lefthand;

import operands.Operand;

public class LeftHands extends Operand {
  private int operand;

  public LeftHands(int operand) {
    this.operand = operand;
  }

  public int getOperand() {
    return this.operand;
  }

}
