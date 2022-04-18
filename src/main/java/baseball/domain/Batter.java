package baseball.domain;

import baseball.common.Constants;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Batter {

    private static List<Integer> numbers = new ArrayList<>();

    public Batter() {
        numbers.clear();
        this.makeRandomNumber();
    }

    public List<Integer> makeRandomNumber() {
        while (numbers.size() < Constants.INPUT_NUMBER_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            this.setNumber(randomNumber);
        }

        return numbers;
    }

    public void setNumber(int number) {
        if (numbers.contains(number)) {
            return;
        }

        numbers.add(number);
    }

    public ArrayList<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }
}
