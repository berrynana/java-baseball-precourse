package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.common.Utils;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RefereeTest {
    @DisplayName("01. 투수와 타자의 숫자값 비교 테스트")
    @ParameterizedTest
    @CsvSource(value = {"123:123"}, delimiter = ':')
    void makeDecisionResult_True(String batterNumber, String pitcherNumber) {

        List<Integer> batterNumbers = Utils.stringToIntList(batterNumber);
        List<Integer> pitcherNumbers = Utils.stringToIntList(pitcherNumber);

        Referee referee = new Referee();
        boolean result = referee.makeDecisionResult(batterNumbers, pitcherNumbers);

        assertThat(result).isTrue();
    }

    @DisplayName("02. 투수와 타자의 숫자값 비교 테스트")
    @ParameterizedTest
    @CsvSource(value = {"789:123"}, delimiter = ':')
    void makeDecisionResult_False(String batterNumber, String pitcherNumber) {

        List<Integer> batterNumbers = Utils.stringToIntList(batterNumber);
        List<Integer> pitcherNumbers = Utils.stringToIntList(pitcherNumber);

        Referee referee = new Referee();
        boolean result = referee.makeDecisionResult(batterNumbers, pitcherNumbers);

        assertThat(result).isFalse();
    }
}
