package rockPaperScissorsGame.gameLogic.rockPaperScissor;

import rockPaperScissorsGame.command.Command;
import rockPaperScissorsGame.command.GenerateRandomCommand;
import rockPaperScissorsGame.enumPackage.gameResult.GameResult;
import rockPaperScissorsGame.gameLogic.mukJjiBba.MukJjiBbaGameLogic;
import rockPaperScissorsGame.typealias.UserVerseComputer;

public class GameLogic {

  public GameResult startGame() {
    Command command = new Command();
    int userInput = command.rockPaperScissorInputCommand();

    GameLogic gameLogic = new GameLogic();
    gameLogic.endGameLogic(userInput);

    MukJjiBbaGameLogic mukJjiBbaGameLogic;

    GenerateRandomCommand randomCommand = new GenerateRandomCommand();
    int computerInput = randomCommand.computerOutput();

    UserVerseComputer userVerseComputer = new UserVerseComputer(userInput, computerInput);
    GameResult gameResult = userVerseComputer.rockPaperScissorGameResult();

    switch (gameResult) {
      case LOSE:
        System.out.println("사용자의 패, 컴퓨터의 승");
        mukJjiBbaGameLogic = new MukJjiBbaGameLogic(gameResult, userInput, computerInput);
        mukJjiBbaGameLogic.mukJjiBbaGameStart();
        break;
      case WIN:
        System.out.println("사용자의 승");
        mukJjiBbaGameLogic = new MukJjiBbaGameLogic(gameResult, userInput, computerInput);
        mukJjiBbaGameLogic.mukJjiBbaGameStart();
        break;
      case DRAW:
        System.out.println("무승부");
        startGame();
    }

    return gameResult;
  }

  private void endGameLogic(int userInput) {
    if (userInput == 0) {
      System.out.println("게임을 종료합니다.");
    }
  }
}
