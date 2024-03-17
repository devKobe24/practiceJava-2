package operators;

import java.util.Scanner;

public class Operator {

  public String inputOperator() {
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
}
