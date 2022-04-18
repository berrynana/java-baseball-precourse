package baseball.domain;

import baseball.common.Utils;
import java.util.List;
import java.util.Objects;

public class Compare {
    public static int howMany(List<Integer> computer, List<Integer> player) {
        int result = 0;

        for (Integer integer : player) {
            result += Utils.booleanToInt(computer.contains(integer));
        }

        return result;
    }

    public static int countStrike(List<Integer> computer, List<Integer> player) {
        int strike = 0;

        for (int i = 0; i < player.size(); i++) {
            strike += Utils.booleanToInt(Objects.equals(computer.get(i), player.get(i)));
        }

        return strike;
    }
}
