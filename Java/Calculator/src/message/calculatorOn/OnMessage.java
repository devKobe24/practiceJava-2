package message.calculatorOn;

import message.Message;
import operands.enumeration.Hands;
import operands.lefthand.LeftHands;
import operands.righthand.RightHands;

public class OnMessage extends Message {
  private Hands hand;

  public OnMessage(Hands hand) {
    this.hand = hand;
  }
}
