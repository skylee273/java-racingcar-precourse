package racingcar.model;

import racingcar.policy.MovingPolicy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static racingcar.constant.RacingCarGameErrorMessage.ERROR_RACING_CARS_NAME_NOT_DUPLICATE;

public class RacingCars {

    private List<RacingCar> racingCars;

    public RacingCars(List<RacingCar> racingCars) {
        validateDuplication(racingCars);
        this.racingCars = racingCars;
    }

    public void moveForwardWithAllRacingCar(MovingPolicy movingPolicy) {
        for (RacingCar racingCar : racingCars) racingCar.move(movingPolicy);
    }

    public RacingCarPosition getMaxPosition() {
        racingCars.sort(((o1, o2) -> o2.getRacingCarPosition().get() - o1.getRacingCarPosition().get()));
        return racingCars.get(0).getRacingCarPosition();
    }

    public List<WinningRacingCar> winningCar(RacingCarPosition maxRacingCarPosition) {
        List<WinningRacingCar> winningRacingCars = new ArrayList<>();
        for (RacingCar car : racingCars) {
            if (car.isSamePositionRacingCar(maxRacingCarPosition)) {
                winningRacingCars.add(new WinningRacingCar(car));
            }
        }
        return winningRacingCars;
    }

    public RacingCar getRacingCar(int index) {
        return racingCars.get(index);
    }

    private void validateDuplication(List<RacingCar> racingCars) {
        Set<RacingCar> racingCarSet = new HashSet<>(racingCars);

        if (racingCarSet.size() != racingCars.size()) {
            throw new IllegalArgumentException(ERROR_RACING_CARS_NAME_NOT_DUPLICATE);
        }
    }


}
