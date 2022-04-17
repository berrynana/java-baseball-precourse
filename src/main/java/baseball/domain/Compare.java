package baseball.domain;

import java.util.List;
import java.util.Objects;

public class Compare {

    private static int booleanToInt(Boolean isTrue) {
        if (isTrue) {
            return 1;
        }

        return 0;
    }

    public static int howMany(List<Integer> computer, List<Integer> player) {
        int result = 0;

        for (Integer integer : player) {
            result += booleanToInt(computer.contains(integer));
        }

        return result;
    }

    public static int countStrike(List<Integer> computer, List<Integer> player) {
        int strike = 0;

        for (int i = 0; i < player.size(); i++) {
            strike += booleanToInt(Objects.equals(computer.get(i), player.get(i)));
        }

        return strike;
    }
}
