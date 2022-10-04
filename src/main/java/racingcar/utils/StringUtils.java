package racingcar.utils;

public class StringUtils {

    public static final int MAX_CAR_NAME_INPUT = 5;
    public static final int MIN_CAR_NAME_INPUT = 1;

    public static String readLine(String carName) {
        return carName;
    }

    public static boolean validateCarNameLengthFive(String carName) {
        return carName.length() <= MAX_CAR_NAME_INPUT && carName.length() >= MIN_CAR_NAME_INPUT;
    }
}
