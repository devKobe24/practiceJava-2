package rockPaperScissorsGame.typealias;

import static rockPaperScissorsGame.constant.Constant.*;
import static rockPaperScissorsGame.enumPackage.gameResult.GameResult.*;

import rockPaperScissorsGame.enumPackage.gameResult.GameResult;

public class UserVerseComputer {

  public int user;
  public int computer;

  public UserVerseComputer(int user, int computer) {
    this.user = user;
    this.computer = computer;
  }

  public GameResult rockPaperScissorGameResult() {
    String userChoice = "";
    String computerChoice = "";
    GameResult gameResult = DRAW;

    switch (user) {
      case 1:
        userChoice = SCISSOR;
        break;
      case 2:
        userChoice = ROCK;
        break;
      case 3:
        userChoice = PAPER;
        break;
    }

    switch (computer) {
      case 1:
        computerChoice = SCISSOR;
        break;
      case 2:
        computerChoice = ROCK;
        break;
      case 3:
        computerChoice = PAPER;
        break;
    }

    if (
        userChoice == SCISSOR && computerChoice == SCISSOR ||
            userChoice == ROCK && computerChoice == ROCK ||
            userChoice == PAPER && computerChoice == PAPER
    ) {
      gameResult = DRAW;
      return gameResult;
    } else if (
        userChoice == SCISSOR && computerChoice == ROCK ||
            userChoice == ROCK && computerChoice == PAPER ||
            userChoice == PAPER && computerChoice == SCISSOR
    ) {
      gameResult = LOSE;
      return gameResult;
    } else if (
        userChoice == ROCK && computerChoice == SCISSOR ||
            userChoice == PAPER && computerChoice == ROCK ||
            userChoice == SCISSOR && computerChoice == PAPER
    ) {
      gameResult = WIN;
      return gameResult;
    }

    return gameResult;
  }
}
