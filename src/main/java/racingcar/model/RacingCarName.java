package racingcar.model;

public class RacingCarName {


    public static final int MAX_CAR_NAME_INPUT = 5;
    public static final int MIN_CAR_NAME_INPUT = 1;

    public static boolean validateCarNameLengthFive(String carName) {
        return carName.length() <= MAX_CAR_NAME_INPUT && carName.length() >= MIN_CAR_NAME_INPUT;
    }

}
