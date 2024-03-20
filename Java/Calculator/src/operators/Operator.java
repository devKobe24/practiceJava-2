package operators;

import java.util.Scanner;

public class Operator {

  public String getOperator() {
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.next();
    Operators operators = null;

    switch (userInput) {
      case "+":
        operators = Operators.PLUS;
        break;
      case "*":
        operators = Operators.MUTIPLY;
        break;
      case "-":
        operators = Operators.MINUS;
        break;
      case "/":
        operators = Operators.DIVIDE;
        break;
    }

    System.out.println(operators);

    return userInput;
  }

  private int operation(int left, int right, String operator) {
    switch (operator) {
      case "+":
        return left + right;
      case "*":
        return left * right;
      case "-":
        return left - right;
      case "/":
        return left / right;
    }
    return 0;
  }

  public void getCalculationResult(int left, int right, String operator) {

    int result = operation(left, right, operator);

    System.out.println(left + operator + right + " = " + result);
  }
}
