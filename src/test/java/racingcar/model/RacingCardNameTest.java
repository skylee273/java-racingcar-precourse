package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.utils.StringUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingCardNameTest {

    @DisplayName("자동차 이름 입력 받기")
    @Test
    public void StringInputTest() {
        assertThat(StringUtils.readLine("abc")).isEqualTo("abc");
    }

    @DisplayName("자동차 이름 1 ~ 5자 이하인지 확인하기")
    @Test
    public void throwExceptionWhenNotFiveCarName() {
        assertThat(RacingCarName.validateCarNameLengthFive("")).isFalse();
        assertThat(RacingCarName.validateCarNameLengthFive("c")).isTrue();
        assertThat(RacingCarName.validateCarNameLengthFive("ac")).isTrue();
        assertThat(RacingCarName.validateCarNameLengthFive("car")).isTrue();
        assertThat(RacingCarName.validateCarNameLengthFive("test")).isTrue();
        assertThat(RacingCarName.validateCarNameLengthFive("space")).isTrue();
        assertThat(RacingCarName.validateCarNameLengthFive("mickey")).isFalse();
    }

}
