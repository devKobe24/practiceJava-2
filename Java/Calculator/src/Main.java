import java.util.Scanner;
import message.calculatorOn.OnMessage;
import message.calculatorOn.StartMessage;
import operands.enumeration.Hands;

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
    String leftOperand = scanner.next();

    rightHandMessage.inputOperand(Hands.RIGHT);

    String rightOperand = scanner.next();




  }
}