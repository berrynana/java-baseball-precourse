package baseball;

import baseball.domain.MakeRandomNumber;
import baseball.domain.Playagain;
import baseball.domain.ProcessGame;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        boolean again = true;

        while (again) {
            List<Integer> computer = MakeRandomNumber.create();
            ProcessGame.tryAnswer(computer);
            again = Playagain.isContinue();
        }
    }
}
