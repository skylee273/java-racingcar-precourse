package racingcar.model;

public class RacingCarMove {

    private static final int MIN_MOVE = 1;
    private final int move;

    public RacingCarMove(int move) {
        validateMove(move);
        this.move = move;
    }

    public void validateMove(int move) {
        if(move < MIN_MOVE) throw new IllegalArgumentException();
    }
}
