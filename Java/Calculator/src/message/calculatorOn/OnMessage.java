package message.calculatorOn;

import message.Message;
import operands.enumeration.Hands;
import operands.lefthand.LeftHands;
import operands.righthand.RightHands;

public class OnMessage extends Message {
  private Hands hand;

  public OnMessage(Hands hand) {
    super(hand);
    this.hand = hand;
  }

  public void calculatorStart() {
    System.out.println("계산기를 시작합니다.");
  }

  private Hands onMessage() {
    return super.inputOperandMessage();
  }
}
