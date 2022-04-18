package baseball.domain;

import baseball.common.Utils;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class Pitcher {
    private static List<Integer> numbers = new ArrayList<>();

    public Pitcher() {
        numbers.clear();
    }

    public void clearAndMakePlayerNumber() {
        numbers.clear();
        this.makePlayerNumber();
    }

    public List<Integer> makePlayerNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        String playerNumber = Console.readLine();

        if (!Utils.validateNumber(playerNumber)) {
            throw new IllegalArgumentException();
        }

        numbers.addAll(Utils.stringToIntList(playerNumber));

        return numbers;
    }

    public ArrayList<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }
}
