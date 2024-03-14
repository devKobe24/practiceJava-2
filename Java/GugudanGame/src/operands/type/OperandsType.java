package operands.type;

public enum OperandsType {
  LEFT("left"),
  RIGHT("right");

  private String operandType;

  private OperandsType(String operandType) {
    this.operandType = operandType;
  }

  public String getOperandType() {
    return operandType;
  }
}
