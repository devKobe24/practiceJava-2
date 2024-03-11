package rockPaperScissorsGame.command;

import rockPaperScissorsGame.enumPackage.gameTurn.GameTurn;
import java.util.Scanner;

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
    GameTurn gameTurn = GameTurn.USER;

    while (isCorrectNumber) {

      System.out.print("["+ gameTurn.getGameTurn() + " 턴] 묵(1), 찌(2), 빠(3)! <종료 : 0> : ");
      int userInput = scanner.nextInt();

      if (userInput < 0 || userInput > 3) {
        System.out.println("잘못된 입력입니다. 다시 시도해주세요");
        gameTurn = GameTurn.COMPUTER;
        continue;
      }
    }
  }
}
