package rockPaperScissorsGame.enumPackage.gameTurn;

public enum GameTurn {
  USER("사용자"),
  COMPUTER("컴퓨터"),
  GAME_END("");

  // 문자열을 저장할 필드
  private String gameTurn;

  // 생성자(싱글톤)
  private GameTurn(String gameTurn) {
    this.gameTurn = gameTurn;
  }

  // Getter
  public String getGameTurn() {
    return gameTurn;
  }
}
