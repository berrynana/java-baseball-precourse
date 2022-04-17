package baseball.domain;

import java.util.List;

public class Judge {
    private static String printJudge(int strike, int ball) {
        if (strike < 1 && ball < 1) {
            return "낫싱";
        }

        if (strike == 0) {
            return ball + "볼";
        }

        if (ball == 0) {
            return strike + "스트라이크";
        }

        return ball + "볼 " + strike + "스트라이크";
    }

    public static String judgement(List<Integer> computer, List<Integer> player) {
        int total = Compare.howMany(computer, player);
        int strike = Compare.countStrike(computer, player);
        int ball = total - strike;

        return printJudge(strike, ball);
    }
}
