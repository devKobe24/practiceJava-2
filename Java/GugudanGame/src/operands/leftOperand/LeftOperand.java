package operands.leftOperand;

import java.util.Scanner;
import operands.inputLogic.InputLogic;
import operands.type.OperandsType;

public class LeftOperand {
  public int printLeftOperandMessage() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("왼쪽에 들어갈 피연산자 숫자: ");
    int operand = scanner.nextInt();

    return operand;
  }
}
