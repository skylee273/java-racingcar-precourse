package racingcar.utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringUtilsTest {

    @DisplayName("자동차 이름 입력 받기")
    @Test
    public void StringInputTest() {
        assertThat(StringUtils.readLine("abc")).isEqualTo("abc");
    }

    @DisplayName("자동차 이름 1 ~ 5자 이하인지 확인하기")
    @Test
    public void throwExceptionWhenNotFiveCarName() {
        assertThat(StringUtils.validateCarNameLengthFive("")).isFalse();
        assertThat(StringUtils.validateCarNameLengthFive("c")).isTrue();
        assertThat(StringUtils.validateCarNameLengthFive("ac")).isTrue();
        assertThat(StringUtils.validateCarNameLengthFive("car")).isTrue();
        assertThat(StringUtils.validateCarNameLengthFive("test")).isTrue();
        assertThat(StringUtils.validateCarNameLengthFive("space")).isTrue();
        assertThat(StringUtils.validateCarNameLengthFive("mickey")).isFalse();
    }


}
