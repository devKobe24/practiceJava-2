package rockPaperScissorsGame.typealias;

import rockPaperScissorsGame.enumPackage.gameTurn.GameTurn;

public class InputNumberAndGameTurn {
  public int inputNumber;
  public GameTurn gameTurn;

  public InputNumberAndGameTurn(int userInput, GameTurn gameTurn) {
    this.inputNumber = userInput;
    this.gameTurn = gameTurn;
  }
}
