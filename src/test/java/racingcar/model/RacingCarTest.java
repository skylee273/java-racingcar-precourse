package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class RacingCarTest {

    @DisplayName("자동차 random 값을 구한 후 random 값이 4 이상일 경우 전진 하는가")
    @Test
    public void validateCarRandomNumberFourMoveForward() {

        RacingCar racingCar = new RacingCar("car");

        racingCar.move(() -> true);

        assertThat(racingCar.getRacingCarPosition().get()).isEqualTo(1);
    }

    @DisplayName("null 또는 공백 문자열이 입력되면 예외를 리턴한다.")
    @ParameterizedTest
    @NullAndEmptySource
    public void throwExceptionWhenCardNameNull(String input) {
        assertThatThrownBy(() -> {
            new RacingCarName(input);
        }).isInstanceOf(RuntimeException.class);
    }

    @DisplayName("자동차 이름 5글자 이상 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"sonata"})
    public void throwExceptionWhenCardNameLargeThanFive(String input) {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new RacingCarName(input);
        });
    }


}
