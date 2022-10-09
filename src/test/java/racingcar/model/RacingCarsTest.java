package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static java.util.Arrays.*;
import static org.assertj.core.api.Assertions.*;

public class RacingCarsTest {

    @DisplayName("중복된 자동차 이름 예외 발생")
    @Test
    public void throwExceptionWhenDuplicateCarName() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            new RacingCars(asList(new RacingCar("ray"), new RacingCar("ray")));
        });
    }

    @DisplayName("모든 참가자 우승인 경우 우승자 수 ")
    @Test
    public void allRacingCarWinnerTest() {

        List<RacingCar> cars = asList(new RacingCar("ray"), new RacingCar("volvo"), new RacingCar("benz"));

        RacingCars racingCars = new RacingCars(cars);

        racingCars.moveForwardWithAllRacingCar(() -> true);

        List<WinningRacingCar> winningRacingCars = racingCars.winningCar(new RacingCarPosition(1));

        assertThat(winningRacingCars.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("우승자가 한 명일 경우에 대해서 테스트")
    public void winnerRayTest() {

        List<RacingCar> cars = asList(new RacingCar("ray"), new RacingCar("volvo"), new RacingCar("benz"));

        RacingCars racingCars = new RacingCars(cars);

        racingCars.getRacingCar(0).move(() -> true);

        RacingCarPosition maxPosition = racingCars.getMaxPosition();

        List<WinningRacingCar> winningRacingCars = racingCars.winningCar(maxPosition);

        assertThat(winningRacingCars.size()).isEqualTo(1);
        assertThat(winningRacingCars.get(0).getWinningRacingCar().getRacingCarName().getCarName()).isEqualTo("ray");
        assertThat(winningRacingCars.get(0).getWinningRacingCar().getRacingCarPosition()).isEqualTo(maxPosition);

    }

    @Test
    @DisplayName("우승자가 N명일 경우에 대해서 테스트")
    public void winnerNTest() {

        List<RacingCar> cars = asList(new RacingCar("ray"), new RacingCar("volvo"), new RacingCar("benz"));

        RacingCars racingCars = new RacingCars(cars);

        racingCars.getRacingCar(0).move(() -> true);
        racingCars.getRacingCar(2).move(() -> true);

        RacingCarPosition maxPosition = racingCars.getMaxPosition();

        List<WinningRacingCar> winningRacingCars = racingCars.winningCar(maxPosition);

        assertThat(winningRacingCars.size()).isEqualTo(2);
        assertThat(winningRacingCars.get(0).getWinningRacingCar().getRacingCarName().getCarName()).isEqualTo("ray");
        assertThat(winningRacingCars.get(1).getWinningRacingCar().getRacingCarName().getCarName()).isEqualTo("benz");
        assertThat(winningRacingCars.get(0).getWinningRacingCar().getRacingCarPosition()).isEqualTo(maxPosition);
        assertThat(winningRacingCars.get(1).getWinningRacingCar().getRacingCarPosition()).isEqualTo(maxPosition);

    }


}
