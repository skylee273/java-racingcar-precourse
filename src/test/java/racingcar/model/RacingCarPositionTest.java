package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class RacingCarPositionTest {

    @DisplayName("자동차 전진 테스트")
    @Test
    public void validateCarMoveForwardTest() {
        RacingCarPosition racingCarPosition = new RacingCarPosition(0);
        assertThat(racingCarPosition.moveForward()).isEqualTo(1);
        assertThat(racingCarPosition.moveForward()).isEqualTo(2);
    }

    @DisplayName("자동차 스탑 테스트")
    @Test
    public void validateCarMoveStopTest() {
        RacingCarPosition racingCarPosition = new RacingCarPosition(0);
        assertThat(racingCarPosition.moveStop()).isEqualTo(0);
    }

    @DisplayName("자동차 전진 후 스탑 테스트")
    @Test
    public void validateCardMoveForwardAndMoveStopTest() {
        RacingCarPosition racingCarPosition = new RacingCarPosition(0);
        assertThat(racingCarPosition.moveForward()).isEqualTo(1);
        assertThat(racingCarPosition.moveStop()).isEqualTo(1);
    }

    @DisplayName("자동차 위치 음수 값 오류")
    @ParameterizedTest
    @ValueSource(ints = {-1})
    public void throwExceptionWhenCardPositionNegative(int input) {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new RacingCarPosition(input);
        });
    }

}
