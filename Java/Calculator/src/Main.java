import calculatorLogic.CalculatorLogic;
import message.Message;
import message.calculatorOn.OnMessage;
import operands.enumeration.Hands;
import operators.Operator;
import operators.Operators;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    OnMessage leftHandMessage = new OnMessage(Hands.LEFT);
    OnMessage rightHandMessage = new OnMessage(Hands.RIGHT);

    leftHandMessage.calculatorStart();

    Hands leftHand = leftHandMessage.inputOperandMessage();
    Hands rightHand = rightHandMessage.inputOperandMessage();

    CalculatorLogic leftCalculatorLogic = new CalculatorLogic(leftHand);
    CalculatorLogic rightCalculatorLogic = new CalculatorLogic(rightHand);

    leftCalculatorLogic.inputOperand();
    rightCalculatorLogic.inputOperand();

    Operator operator = new Operator();
    String userInputOperator = operator.inputOperator();

    leftCalculatorLogic.operation(userInputOperator);
    rightCalculatorLogic.operation(userInputOperator);
  }
}