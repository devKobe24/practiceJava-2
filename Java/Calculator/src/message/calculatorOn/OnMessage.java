package message.calculatorOn;

import message.Message;
import message.OperandsMessage;
import operands.enumeration.Hands;

public class OnMessage extends Message implements OperandsMessage {
  private Hands hand;

  public OnMessage(Hands hand) {
    this.hand = hand;
  }

  @Override
  public void inputOperand(Hands hand) {
    if (hand == Hands.LEFT) {
      System.out.print("첫 번째 숫자를 입력해주세요 :");
    } else if (hand == Hands.RIGHT) {
      System.out.print("두 번째 숫자를 입력해주세요 :");
    }
  }
}
