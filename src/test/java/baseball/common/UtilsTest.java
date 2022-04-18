package baseball.common;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("유틸 테스트")
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class UtilsTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    @DisplayName("01. showMessage() 테스트")
    void showMessageTest(){
        String message = "테스트 메세지 출력";
        Utils.showMessage(message);
        assertThat(message).isEqualTo(outputStreamCaptor.toString());
    }

    @Test
    @DisplayName("02. booleanToIntTest() 테스트")
    void booleanToIntTest_ConvertBooleanToInteger() {
        boolean isTrue = true;
        int result = Utils.booleanToInt(isTrue);
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("03. 입력값이 숫자가 아닐경우 체크")
    void isNumber_NotNumberString_False() {
        String strNum = "1a3";
        boolean isNum = Utils.isNumber(strNum);
        assertThat(isNum).isFalse();
    }

    @Test
    @DisplayName("03. 입력값이 중복하지 않은 3자리 숫자가 아닌 경우 체크 (List)")
    void validateNumber_ListType_True() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        boolean isValid = Utils.validateNumber(numbers);
        assertThat(isValid).isTrue();
    }

    @Test
    @DisplayName("04. 입력값이 3자리 숫자가 아닌 경우 체크 (string type)")
    void validateNumberRange_OverRangeStringType_False() {
        String strNum = "123451";
        boolean isNum = Utils.validateNumberRange(strNum, Constants.INPUT_NUMBER_LENGTH);
        assertThat(isNum).isFalse();
    }

    @Test
    @DisplayName("05. 중복문자 체크 테스트")
    void removeDuplicateNumber_includeDuplicateNumber_False() {
        String strDuplicateNumbers = "111111122222223333333";
        boolean result = Utils.hasNotDuplicateNumber(strDuplicateNumbers);
        assertThat(result).isFalse();
    }
}
