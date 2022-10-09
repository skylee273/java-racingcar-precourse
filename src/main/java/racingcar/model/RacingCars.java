package racingcar.model;

import racingcar.policy.MovingPolicy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RacingCars {

    private List<RacingCar> racingCars;

    public RacingCars(List<RacingCar> racingCars) {
        validateDuplication(racingCars);
        this.racingCars = racingCars;
    }

    public void moveForwardWithAllRacingCar(MovingPolicy movingPolicy) {
        for(RacingCar racingCar : racingCars) racingCar.move(movingPolicy);
    }

    private void validateDuplication(List<RacingCar> racingCars) {
        Set<RacingCar> racingCarSet = new HashSet<>(racingCars);

        if (racingCarSet.size() != racingCars.size()) {
            throw new IllegalArgumentException();
        }
    }


}
