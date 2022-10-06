package racingcar.utils;

public class StringUtil {

    public static boolean isNullOrEmpty(String input) {
        return (input.isEmpty() || input == null);
    }

    public static void validateNullAndEmpty(boolean isNullOrEmpty) {
        if (isNullOrEmpty) throw new IllegalArgumentException();
    }
}
