package rockPaperScissorsGame.command;

import static rockPaperScissorsGame.constant.Constant.COMPUTER_TURN;
import static rockPaperScissorsGame.constant.Constant.PAPER;
import static rockPaperScissorsGame.constant.Constant.ROCK;
import static rockPaperScissorsGame.constant.Constant.SCISSOR;
import static rockPaperScissorsGame.constant.Constant.computerTurnRawValue;
import static rockPaperScissorsGame.constant.Constant.userTurnRawValue;

import rockPaperScissorsGame.enumPackage.gameTurn.GameTurn;
import java.util.Scanner;
import rockPaperScissorsGame.gameLogic.mukJjiBba.MukJjiBbaGameLogic;

public class Command {
  public int rockPaperScissorInputCommand() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("가위(1), 바위(2), 보(3)! <종료 : 0> : ");
    int userInput = scanner.nextInt();

    return userInput;
  }

  public void mukJjiBbaIntputCommand(GameTurn turn) {
    Scanner scanner = new Scanner(System.in);

    boolean isCorrectNumber = true;
    GameTurn gameTurn = turn;

    while (isCorrectNumber) {

      System.out.print("["+ gameTurn.getGameTurn() + " 턴] 묵(1), 찌(2), 빠(3)! <종료 : 0> : ");
      int input = scanner.nextInt();

      if (input < 0 || input > 3) {
        System.out.println("잘못된 입력입니다. 다시 시도해주세요");
        gameTurn = turn;
        continue;
      }
      mukJjiBbaLogic(gameTurn, input);
    }
  }

  public void mukJjiBbaLogic(GameTurn status, int input) {
    String userChoice = "";
    String computerChoice = "";
    String turn = "";

    if (status == COMPUTER_TURN) {
      turn = computerTurnRawValue;
      switch (input) {
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
    } else {
      turn = userTurnRawValue;
      switch (input) {
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
    }
  }

  private void mukJjiBbaGameLogic(String userChoice, String computerChoice, String turn) {
    if (
        userChoice == SCISSOR && computerChoice == SCISSOR ||
            userChoice == ROCK && computerChoice == ROCK ||
            userChoice == PAPER && computerChoice == PAPER
    ) {
      System.out.println(turn + "의 승리 입니다.");
    } else if (
        userChoice == SCISSOR && computerChoice == ROCK ||
            userChoice == ROCK && computerChoice == PAPER ||
            userChoice == PAPER && computerChoice == SCISSOR
    ) {
      System.out.print(turn + "의 턴 입니다.");
    } else if (
        userChoice == ROCK && computerChoice == SCISSOR ||
            userChoice == PAPER && computerChoice == ROCK ||
            userChoice == SCISSOR && computerChoice == PAPER
    ) {
      turn = userTurnRawValue;
      System.out.print(turn + "의 턴 입니다.");
    }
  }
}
