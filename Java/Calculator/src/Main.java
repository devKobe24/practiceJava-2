import java.util.Scanner;
import message.calculatorOn.OnMessage;
import message.calculatorOn.OperatorChoiceMessage;
import message.calculatorOn.StartMessage;
import operands.enumeration.Hands;
import operands.lefthand.LeftHands;
import operands.righthand.RightHands;
import operators.Operators;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    StartMessage startMessage = new StartMessage();
    startMessage.calculatorStart();

    OnMessage leftHandMessage = new OnMessage(Hands.LEFT);
    OnMessage rightHandMessage = new OnMessage(Hands.RIGHT);

    leftHandMessage.inputOperand(Hands.LEFT);

    Scanner scanner = new Scanner(System.in);
    int leftOperand = scanner.nextInt();
    LeftHands leftHands = new LeftHands(leftOperand);
    leftOperand = leftHands.getOperand();

    rightHandMessage.inputOperand(Hands.RIGHT);
    int rightOperand = scanner.nextInt();
    RightHands rightHands = new RightHands(rightOperand);
    rightOperand = rightHands.getOperand();

    OperatorChoiceMessage operatorChoiceMessage = new OperatorChoiceMessage(leftOperand, rightOperand);
    operatorChoiceMessage.startOperator();
    String operator = scanner.next();
    operatorChoiceMessage.inputOperator(operator);
  }
}