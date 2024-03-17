package message;

import operands.enumeration.Hands;

public class Message {
  private Hands hand;

  public Message(Hands hand) {
    this.hand = hand;
  }

  public Hands inputOperandMessage() {
    switch (this.hand) {
      case LEFT:
        System.out.print("처음으로 들어갈 숫자를 입력해주세요 : ");
        return Hands.LEFT;
      case RIGHT:
        System.out.print("두 번째로 들어갈 숫자를 입력해주세요 : ");
        return Hands.RIGHT;
    }
    return Hands.DEFAULT;
  }
}
