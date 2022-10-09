package racingcar.model;

public class RacingCarName {

    public static final int MAX_CAR_NAME_INPUT = 5;
    public static final int MIN_CAR_NAME_INPUT = 1;

    private String carName;

    public RacingCarName(String carName){
        validateRacingCarNameLengthFive(carName);
        this.carName = carName;
    }

    public static void validateRacingCarNameLengthFive(String carName) {
        if (carName.length() < MIN_CAR_NAME_INPUT || carName.length() > MAX_CAR_NAME_INPUT) {
            throw new IllegalArgumentException();
        }
    }
}
