package rockPaperScissorsGame.constant;

import rockPaperScissorsGame.enumPackage.gameTurn.GameTurn;
import rockPaperScissorsGame.enumPackage.selections.RockPaperScissor;


public class Constant {
  public static final GameTurn USER_TURN = GameTurn.USER;
  public static final GameTurn COMPUTER_TURN = GameTurn.COMPUTER;
  public static final String  userTurnRawValue = GameTurn.USER.getGameTurn();
  public static final String  computerTurnRawValue = GameTurn.COMPUTER.getGameTurn();

  public static final int scissorRawValue = RockPaperScissor.SCISSOR.getElement();
  public static final int rockRawValue = RockPaperScissor.ROCK.getElement();
  public static final int paperRawValue = RockPaperScissor.PAPER.getElement();

  public static final String SCISSOR = RockPaperScissor.SCISSOR.getRockPaperScissor();
  public static final String ROCK = RockPaperScissor.ROCK.getRockPaperScissor();
  public static final String PAPER = RockPaperScissor.PAPER.getRockPaperScissor();
}
