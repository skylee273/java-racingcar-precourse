package racingcar.view;

import static racingcar.constant.RacingGameMessage.RACING_CAR_NAME_INPUT;

public class InputView {

    public static void readyManual(){
        printMessage(RACING_CAR_NAME_INPUT);
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

}
