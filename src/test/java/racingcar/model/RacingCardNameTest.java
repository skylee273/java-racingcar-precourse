package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import racingcar.utils.StringUtils;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

public class RacingCardNameTest {

    @DisplayName("자동차 이름 1보다 작으면 예외 발생")
    @ParameterizedTest
    @ValueSource(strings = {""})
    public void throwExceptionWhenCardNameSizeZero(String input) {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new RacingCarName(input);
        });
    }

    @DisplayName("자동차 이름 5보다 크면 예외 발생")
    @ParameterizedTest
    @ValueSource(strings = {"Volkswagen"})
    public void throwExceptionWhenCardNameLargeThanFive(String input) {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new RacingCarName(input);
        });
    }



}
