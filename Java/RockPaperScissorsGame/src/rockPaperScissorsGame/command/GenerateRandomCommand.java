package rockPaperScissorsGame.command;

import rockPaperScissorsGame.constant.Constant;
import java.util.Random;

public class GenerateRandomCommand {

  public int computerOutput() {
    // 베열 생성
    int[] randomRockPaperScissors = {
        Constant.rockRawValue,
        Constant.scissorRawValue,
        Constant.paperRawValue
    };

    // Random 객체 생성
    Random random = new Random();

    // 무작위 인덱스 생성
    int randomIndex = random.nextInt(randomRockPaperScissors.length);

    // 무작위로 선택된 배열의 요소
    int randomRockPaperScissor = randomRockPaperScissors[randomIndex];

    return randomRockPaperScissor;
  }
}
