package message.calculatorOn;

public class OperatorChoiceMessage {
  private int leftOperand;
  private int rightOperand;

  public OperatorChoiceMessage(int leftOperand, int rightOperand) {
    this.leftOperand = leftOperand;
    this.rightOperand = rightOperand;
  }

  public void startOperator() {
    System.out.println("어떤 사칙 연산을 하시겠습니까? (+, -, *. /)");
  }

  public void inputOperator(String operator) {
    switch (operator) {
      case "+":
        System.out.println(this.leftOperand + operator + this.rightOperand + "=" + (leftOperand+rightOperand));
        break;
      case "-":
        System.out.println(this.leftOperand + operator + this.rightOperand + "=" + (leftOperand-rightOperand));
        break;
      case "*":
        System.out.println(this.leftOperand + operator + this.rightOperand + "=" + (leftOperand*rightOperand));
        break;
      case "/":
        System.out.println(this.leftOperand + operator + this.rightOperand + "=" + (leftOperand/rightOperand));
        break;
    }
  }
}
