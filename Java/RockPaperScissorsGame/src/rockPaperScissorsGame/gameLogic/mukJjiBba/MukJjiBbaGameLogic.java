package rockPaperScissorsGame.gameLogic.mukJjiBba;

import static rockPaperScissorsGame.constant.Constant.*;

import java.util.Scanner;
import rockPaperScissorsGame.command.Command;
import rockPaperScissorsGame.constant.Constant;
import rockPaperScissorsGame.enumPackage.gameResult.GameResult;
import rockPaperScissorsGame.enumPackage.gameTurn.GameTurn;

public class MukJjiBbaGameLogic {
  private GameResult status;
  private int user;
  private int computer;

  public MukJjiBbaGameLogic(GameResult status, int user, int computer) {
    this.status = status;
    this.user = user;
    this.computer = computer;
  }

  public GameTurn mukJjiBbaGameResult(GameResult status) {
    GameTurn gameTurn = USER_TURN;

    switch (status) {
      case LOSE:
        gameTurn = COMPUTER_TURN;
        return gameTurn;
      case WIN:
        gameTurn = USER_TURN;
        return gameTurn;
    }
    return gameTurn;
  }

  public void mukJjiBbaGameStart() {
    String user = Constant.userTurnRawValue;
    String computer = Constant.computerTurnRawValue;
    Scanner scanner = new Scanner(System.in);
    GameTurn gameTurn = mukJjiBbaGameResult(status);
    Command command = new Command();
    int returnValue = 0;

    switch (status) {
      case LOSE:
        command.mukJjiBbaIntputCommand(gameTurn);
        int computerInput = scanner.nextInt();
//        returnValue = computerInput;
//        mukJjiBbaLogic(gameTurn);
//        return returnValue;
      case WIN:
        command.mukJjiBbaIntputCommand(gameTurn);
        int userInput = scanner.nextInt();
//        returnValue = userInput;
//        mukJjiBbaLogic(gameTurn);
//        return returnValue;
      case DRAW:
        System.out.println("[무승부]");
        mukJjiBbaGameStart();
    }
//    return returnValue;
  }
}
