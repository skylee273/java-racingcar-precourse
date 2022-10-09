package racingcar.model;

import java.util.Objects;

public class RacingCarName {

    private static final int MAX_CAR_NAME_INPUT = 5;
    private static final int MIN_CAR_NAME_INPUT = 1;
    private static final String CAR_NAME_BLANK = " ";

    private String carName;

    public RacingCarName(String carName){
        validateRacingCarNameNullAndEmpty(carName);
        validateRacingCarNameLengthFive(carName);
        validateRacingCarNameBlank(carName);
        this.carName = carName;
    }

    public String getCarName(){
        return this.carName;
    }

    private static void validateRacingCarNameNullAndEmpty(String carName){
        if(carName.isEmpty() || carName == null) throw new IllegalArgumentException();
    }

    private static void validateRacingCarNameLengthFive(String carName) {
        if (carName.length() < MIN_CAR_NAME_INPUT || carName.length() > MAX_CAR_NAME_INPUT) {
            throw new IllegalArgumentException();
        }
    }

    private static void validateRacingCarNameBlank(String carName){
        if(carName.contains(CAR_NAME_BLANK)) throw new IllegalArgumentException();
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
