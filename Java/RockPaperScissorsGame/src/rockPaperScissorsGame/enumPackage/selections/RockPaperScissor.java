package rockPaperScissorsGame.enumPackage.selections;

public enum RockPaperScissor {
  SCISSOR(1),
  ROCK(2),
  PAPER(3);

  // 정수를 저장할 필드.
  private int element;

  // 생성자(싱글톤)
  private RockPaperScissor(int select) {
    this.element = select;
  }

  // Getter
  public String getRockPaperScissor() {
    String returnValue = "";
    switch (this.element) {
      case 1:
        returnValue = "SCISSOR";
        break;
      case 2:
        returnValue = "ROCK";
        break;
      case 3:
        returnValue = "PAPER";
        break;
    }
    return returnValue;
  }

  // Getter
  public int getElement() {
    return this.element;
  }
}
