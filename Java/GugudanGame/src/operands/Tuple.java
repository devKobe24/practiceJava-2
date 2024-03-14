package operands;

public class Tuple<Left, Right> {

  private Left leftHands;
  private Right rightHands;

  public Tuple(Left leftHands, Right rightHands) {
    this.leftHands = leftHands;
    this.rightHands = rightHands;
  }

  public static <Left, Right> Tuple<Left, Right> of(final Left leftHands, final Right rightHands) {
    return new Tuple<>(leftHands, rightHands);
  }

  public Left getLeftHands() {
    return leftHands;
  }

  public void setLeftHands(Left leftHands) {
    this.leftHands = leftHands;
  }

  public Right getRightHands() {
    return rightHands;
  }

  public void setRightHands(Right rightHands) {
    this.rightHands = rightHands;
  }
}
