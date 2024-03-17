package operators;

public enum Operators {
  PLUS("+"),
  MINUS("-"),
  DIVIDE("/"),
  MUTIPLY("*");

  private String operator;

  private Operators(String operator) {
    this.operator = operator;
  }

  // GETTER
  public String getOperator() {
    return operator;
  }
}
