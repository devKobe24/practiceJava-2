package rockPaperScissorsGame.enumPackage.gameResult;

public enum GameResult {
  LOSE(0),
  WIN(1),
  DRAW(2);

  // GameResult를 저장할 필드
  private int gameResult;

  // 생성자(싱글톤)
  private GameResult(int gameResult) {
    this.gameResult = gameResult;
  }


  // Getter
  public int getGameResult() {
    return gameResult;
  }
}
