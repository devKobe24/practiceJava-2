package operands.rightOperand;

import java.util.Scanner;

public class RightOperand {
  public int printRightOperandMessage() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("오른쪽에 들어갈 피연산자 숫자: ");
    int operand = scanner.nextInt();

    return operand;
  }
}
