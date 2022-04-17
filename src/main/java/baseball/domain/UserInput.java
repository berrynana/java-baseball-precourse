package baseball.domain;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class UserInput {

    private static List<Integer> playerNumber;

    private static int parseUserNumber(String number) {
        if (!number.matches("[1-9]")) {
            throw new IllegalArgumentException("1부터 9까지의 숫자 조합으로 3자리 수를 입력해주세요. ex) 234");
        }

        return Integer.parseInt(number);
    }

    private static boolean hasDuplicateNumber(String[] numbers) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(numbers));
        String[] resultArr = hashSet.toArray(new String[0]);

        return numbers.length != resultArr.length;
    }

    private static void validatePlayerNumber(String input, String[] inputNumber) {
        if (input.length() != 3 || hasDuplicateNumber(inputNumber)) {
            throw new IllegalArgumentException("각 자리수가 서로 다른 3자리 수를 입력해주세요 ex) 123");
        }
    }

    public static List<Integer> getNumber() {
        playerNumber = new ArrayList<>();
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        String[] inputNumber = input.split("");
        validatePlayerNumber(input, inputNumber);

        Arrays.asList(inputNumber).forEach(n -> playerNumber.add(parseUserNumber(n)));

        return playerNumber;
    }
}
