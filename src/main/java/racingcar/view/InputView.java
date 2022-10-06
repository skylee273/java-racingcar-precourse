package racingcar.view;

import racingcar.utils.ScannerUtil;

import static racingcar.constant.RacingGameMessage.RACING_CAR_NAME_INPUT;

public class InputView {

    public static String[] RacingCardInputNames(){
        printMessage(RACING_CAR_NAME_INPUT);
        return splitByComma(ScannerUtil.readLine());
    }

    private static String[] splitByComma(String input) {
        return input.split(",");
    }
    private static void printMessage(String message) {
        System.out.println(message);
    }

}
