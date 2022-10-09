package racingcar.model;

import java.util.Objects;

public class RacingCarName {

    public static final int MAX_CAR_NAME_INPUT = 5;
    public static final int MIN_CAR_NAME_INPUT = 1;

    private String carName;

    public RacingCarName(String carName){
        validateRacingCarNameNullAndEmpty(carName);
        validateRacingCarNameLengthFive(carName);
        this.carName = carName;
    }

    public static void validateRacingCarNameNullAndEmpty(String carName){
        if(carName.isEmpty() || carName == null) throw new IllegalArgumentException();
    }

    public static void validateRacingCarNameLengthFive(String carName) {
        if (carName.length() < MIN_CAR_NAME_INPUT || carName.length() > MAX_CAR_NAME_INPUT) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingCarName that = (RacingCarName) o;
        return Objects.equals(carName, that.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
