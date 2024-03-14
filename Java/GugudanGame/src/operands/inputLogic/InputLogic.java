package operands.inputLogic;

import java.util.Scanner;
import operands.Tuple;

public class InputLogic {

  public Tuple inputOperand(String type) {

    int leftOperand = 0;
    int rigthOperand = 0;
    Tuple operands = new Tuple<>(leftOperand, rigthOperand);

    switch (type) {
      case "left":
        leftOperand = printLeftOperandMessage();
        operands.setLeftHands(leftOperand);
      case "right":
        rigthOperand = printRightOperandMessage();
        System.out.println("===============>" + rigthOperand);
        operands.setRightHands(rigthOperand);
    }

    return operands;
  }

  private int printLeftOperandMessage() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("왼쪽에 들어갈 피연산자 숫자:");
    int operand = scanner.nextInt();

    return operand;
  }

  private int printRightOperandMessage() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("오른쪽에 들어갈 피연산자 숫자:");
    int operand = scanner.nextInt();

    return operand;
  }
}
