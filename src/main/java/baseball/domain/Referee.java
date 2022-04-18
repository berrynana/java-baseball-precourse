package baseball.domain;

import baseball.common.Constants;
import baseball.common.Utils;
import java.util.List;

public class Referee {

    public boolean makeDecisionResult(List<Integer> batterNumber, List<Integer> pitcherNumber) {
        int total = Compare.howMany(batterNumber, pitcherNumber);
        int strike = Compare.countStrike(batterNumber, pitcherNumber);
        int ball = total - strike;

        Utils.showMessage(this.getDecisionMessage(strike, ball));

        return strike == Constants.FINISH_STRIKE_OUT;
    }

    private String getDecisionMessage(int strike, int ball) {
        if (strike < 1 && ball < 1) {
            return "낫싱\n";
        }

        if (strike == 0) {
            return String.format("%d볼\n", ball);
        }

        if (ball == 0) {
            return String.format("%d스트라이크\n", strike);
        }

        return String.format("%d볼 %d스트라이크\n", ball, strike);
    }
}
