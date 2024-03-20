package message;

import operands.enumeration.Hands;
import operators.Operator;
import operators.Operators;

public class Message {

  public void calculatorStart() {
    System.out.println("계산기를 시작합니다.");
  }

  public void inputOperand(Hands hand) {
    switch (hand) {
      case LEFT:
        System.out.print("처음으로 들어갈 숫자를 입력해주세요 : ");
        break;
      case RIGHT:
        System.out.print("두 번째로 들어갈 숫자를 입력해주세요 : ");
        break;
    }
  }

  public void inputOperator(String operator) {
    Operators userChoiceOperator = Operators.DEFAULT
    switch (operator) {
      case "+":

    }
  }
}
