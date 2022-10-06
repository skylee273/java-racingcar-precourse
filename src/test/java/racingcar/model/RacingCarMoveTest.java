package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class RacingCarMoveTest {

    @DisplayName("이동 횟수가 1보다 작을 떄 예외 발생")
    @ParameterizedTest
    @ValueSource(ints = {0})
    void throwExceptionWhenCarMoveCountLessThanOne(int tryCount){
        assertThatIllegalArgumentException().isThrownBy(() -> {
                new RacingCarMove(tryCount);
        });
    }

}
