package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;
import static org.assertj.core.api.Assertions.*;

public class RacingCarsTest {

    @DisplayName("중복된 자동차 이름 예외 발생")
    @Test
    public void throwExceptionWhenDuplicateCarName(){
        assertThatIllegalArgumentException().isThrownBy(() -> {
             new RacingCars(asList(new RacingCar("ray"), new RacingCar("ray")));
        });
    }
}
