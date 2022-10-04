package racingcar.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringUtilsTest {

    @DisplayName("자동차 이름 입력 받기")
    @Test
    public void StringInputTest() {
        String input = StringUtils.readLine("oin");
        assertThat(input).isEqualTo("abc");
    }
}
