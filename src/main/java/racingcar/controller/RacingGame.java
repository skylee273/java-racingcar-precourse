package racingcar.controller;

import racingcar.model.*;
import racingcar.policy.MovingPolicy;
import racingcar.policy.RandomMovingPolicy;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

import static racingcar.view.OutputView.*;

public class RacingGame {

    private RacingCars racingCars;
    private Coin coin;
    private MovingPolicy movingPolicy = new RandomMovingPolicy();

    public void ready() throws IllegalArgumentException {

        String[] carNames = InputView.RacingCarInputNames();

        List<RacingCar> cars = new ArrayList<>();

        for (String carName : carNames) cars.add(new RacingCar(carName));

        racingCars = new RacingCars(cars);

        coin = new Coin(InputView.RacingCarInputsTry());
    }


    public void start() throws IllegalArgumentException {
        printRunResultMessage();

        while (coin.isContinue()) {
            coin.useCoin();
            run();
        }

        printWinners(getWinners());
    }

    private void run() {
        racingCars.moveForwardWithAllRacingCar(movingPolicy);
        printCurrentRacingCarRoot();
    }

    private void printCurrentRacingCarRoot() {
        for (RacingCar racingCar : racingCars.getRacingCars()) {
            OutputView.printRacingCarRootDraw(racingCar);
        }
        OutputView.printLine();
    }


    private List<WinningRacingCar> getWinners() {
        return racingCars.winningCar(racingCars.getMaxPosition());
    }

}
