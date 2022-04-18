package baseball.service;

import baseball.common.Constants;
import baseball.domain.Batter;
import baseball.domain.Pitcher;
import baseball.domain.Referee;
import camp.nextstep.edu.missionutils.Console;

public class BaseballService {

    public void playBall() {
        boolean again = true;

        while (again) {
            this.tryAnswer();
            again = askContinueGame();
        }
    }

    public void tryAnswer() {
        Batter batter = new Batter(); // computer
        Pitcher pitcher = new Pitcher(); // player
        Referee referee = new Referee();
        boolean isStrike = false;

        while (!isStrike) {
            pitcher.clearAndMakePlayerNumber();
            isStrike = referee.makeDecisionResult(batter.getNumbers(), pitcher.getNumbers());
        }
    }

    public boolean askContinueGame() {
        System.out.printf("%d개의 숫자를 모두 맞히셨습니다! 게임 종료%n", Constants.FINISH_STRIKE_OUT);
        System.out.printf(
            "게임을 새로 시작하려면 %s, 종료하려면 %s를 입력하세요%n", Constants.RESTART_GAME, Constants.FINISH_GAME);
        char answer = Console.readLine().charAt(0);

        return answer == Constants.RESTART_GAME;
    }
}
