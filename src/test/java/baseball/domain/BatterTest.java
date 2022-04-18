package baseball.domain;

import baseball.common.Utils;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BatterTest {

    @Test
    @DisplayName("1~9까지 중복하지 않는 3자리 숫자 확인하기")
    void makeRandomNumberTest() {
        Batter batter = new Batter();
        List<Integer> numbers = batter.getNumbers();
        boolean result = Utils.validateNumber(numbers);

        assertThat(result).isTrue();
    }
}
