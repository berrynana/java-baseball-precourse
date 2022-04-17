package baseball.domain;

import java.util.List;

public class ProcessGame {
    public static void tryAnswer(List<Integer> computer) {
        String result = "";

        while (!result.equals("3스트라이크")) {
            result = Judge.judgement(computer, UserInput.getNumber());
            System.out.println(result);
        }
    }
}
