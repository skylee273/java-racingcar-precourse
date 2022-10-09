package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumber {

    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 9;

    private int randomNumber;

    private static final int CAR_FORWARD_MOVE_CONDITION = 4;

    public RandomNumber(int randomNumber){
        isRandomNumberInRange(randomNumber);
        this.randomNumber = randomNumber;
    }

    public boolean isMovable() {
        return this.randomNumber >= CAR_FORWARD_MOVE_CONDITION;
    }

    private static void isRandomNumberInRange(int random) {
        if(random < 0 || random > 9) throw new IllegalArgumentException();
    }

}
