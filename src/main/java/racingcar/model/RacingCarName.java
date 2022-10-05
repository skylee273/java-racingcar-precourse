package racingcar.model;

public class RacingCarName {

    public static final int MAX_CAR_NAME_INPUT = 5;
    public static final int MIN_CAR_NAME_INPUT = 1;

    private String cardName;

    public RacingCarName(String cardName){
        validateRacingCarNameLengthFive(cardName);
        this.cardName = cardName;
    }

    public static void validateRacingCarNameLengthFive(String cardName) {
        if (cardName.length() < MIN_CAR_NAME_INPUT || cardName.length() > MAX_CAR_NAME_INPUT) {
            throw new IllegalArgumentException();
        }
    }
}
