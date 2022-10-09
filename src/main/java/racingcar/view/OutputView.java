package racingcar.view;

import racingcar.model.RacingCar;
import racingcar.model.WinningRacingCar;

import java.util.List;

import static racingcar.constant.RacingGameMessage.RACING_CAR_GAME_RESULT;
import static racingcar.constant.RacingGameMessage.RACING_CAR_MATCH_FINAL_WINNER;

public class OutputView {

    private static final String DELIMITER = ", ";
    private static final String RACING_CAR_MOVE_ROOT = "-";
    private static final String SEPARATOR = " : ";

    public static void printRunResultMessage() {
        printLine();
        printMessage(RACING_CAR_GAME_RESULT);
    }

    public static void printRacingCarRootDraw(RacingCar racingCar) {
        printMessage(racingCar.getRacingCarName().getName() + SEPARATOR + printRacingCarMovingRoot(racingCar));
    }

    public static void printWinners(List<WinningRacingCar> winners) {
        StringBuilder winnersBuffer = new StringBuilder();
        for(int i = 0; i < winners.size(); ++i) {
            winnersBuffer.append(winners.get(i).getRacingCar().getRacingCarName().getName());
            if (i != winners.size() - 1) winnersBuffer.append(DELIMITER);
        }
        printMessage(RACING_CAR_MATCH_FINAL_WINNER + winnersBuffer.toString());
    }

    public static void printErrorMessage(String errorMessage) {
        System.out.println(errorMessage);
    }

    private static String printRacingCarMovingRoot(RacingCar racingCar) {
        StringBuilder buffer = new StringBuilder();
        for (int i = racingCar.getRacingCarPosition().get(); i > 0; i--) {
            buffer.append(RACING_CAR_MOVE_ROOT);
        }
        return buffer.toString();
    }

    public static void printLine() {
        System.out.println();
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

}
