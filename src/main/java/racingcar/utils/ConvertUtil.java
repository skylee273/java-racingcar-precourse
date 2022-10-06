package racingcar.utils;

public class ConvertUtil {

    public static void validateIntegerType(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    public static int convertStringToInteger(String input) {
        validateIntegerType(input);
        return Integer.parseInt(input);
    }

}
