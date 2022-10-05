package racingcar.model;

public class RacingCarPosition {

    private static final int ZERO = 0;

    private int position;

    public RacingCarPosition(int position) {
        validateRacingCardPositionPositive(position);
        this.position = position;
    }

    public int moveForward() {
        return ++this.position;
    }

    public int moveStop(){
        return this.position;
    }

    public static void validateRacingCardPositionPositive(int position) {
        if(position < ZERO) throw new IllegalArgumentException();
    }

}
