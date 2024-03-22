package message;

import operands.enumeration.Hands;
import operators.Operator;
import operators.Operators;

public abstract class Message {

  public void calculatorStart() {
    System.out.println("계산기를 시작합니다.");
  }



  public void inputOperator(String operator) {
    Operators userChoiceOperator = Operators.DEFAULT;
    switch (operator) {
      case "+":

    }
  }
}
