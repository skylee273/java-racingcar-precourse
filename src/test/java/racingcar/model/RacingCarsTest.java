package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;
import static org.assertj.core.api.Assertions.*;

public class RacingCarsTest {

    private RacingCars racingCars;
    private RacingCarPosition racingCarPosition;
    @BeforeEach
    void setUpCars() {
        List<RacingCar> cars = asList(new RacingCar("ray"), new RacingCar("volvo"), new RacingCar("benz") );
        racingCars = new RacingCars(cars);
    }

    @DisplayName("중복된 자동차 이름 예외 발생")
    @Test
    public void throwExceptionWhenDuplicateCarName(){
        assertThatIllegalArgumentException().isThrownBy(() -> {
             new RacingCars(asList(new RacingCar("ray"), new RacingCar("ray")));
        });
    }

    @DisplayName("모든 참가자 우승인 경우 우승자 수 ")
    @Test
    public void allRacingCarWinnerTest() {

        racingCars.moveForwardWithAllRacingCar(() -> true);

        List<WinningRacingCar> winningRacingCars = racingCars.winningCar(new RacingCarPosition(1));

        assertThat(winningRacingCars.size()).isEqualTo(3);
    }



}
