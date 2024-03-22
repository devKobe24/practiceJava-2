package operands.righthand;

import operands.Operand;

public class RightHands extends Operand {
  private int operand;

  public RightHands(int operand) {
    this.operand = operand;
  }

  public int getOperand() {
    return this.operand;
  }
}
