package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class MakeRandomNumber {
    private static List<Integer> computerNumber;

    private static void setComputerNumber(int random) {
        if (computerNumber.contains(random)) {
            return;
        }

        computerNumber.add(random);
    }

    public static List<Integer> create() {
        computerNumber = new ArrayList<>();

        while (computerNumber.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            setComputerNumber(randomNumber);
        }

        return computerNumber;
    }
}
