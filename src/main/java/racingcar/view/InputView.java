package racingcar.view;

import racingcar.utils.ConvertUtil;
import racingcar.utils.ScannerUtil;

import static racingcar.constant.RacingGameMessage.RACING_CAR_NAME_INPUT;
import static racingcar.constant.RacingGameMessage.RACING_CAR_TRY_COUNT_INPUT;

public class InputView {

    public static String[] RacingCardInputNames() {
        printMessage(RACING_CAR_NAME_INPUT);
        return splitByComma(ScannerUtil.readLine());
    }

    public static int RacingCardInputsTry() {
        printMessage(RACING_CAR_TRY_COUNT_INPUT);
        return ConvertUtil.convertStringToInteger(ScannerUtil.readLine());
    }

    private static String[] splitByComma(String input) {
        return input.split(",");
    }
    private static void printMessage(String message) {
        System.out.println(message);
    }

}
