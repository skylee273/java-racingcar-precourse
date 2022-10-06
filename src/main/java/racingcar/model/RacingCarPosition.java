package racingcar.model;

public class RacingCarPosition {

    private static final int ZERO = 0;
    private static final String MOVE_CURRENT_POSITION = "-";

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

    @Override
    public String toString() {
        if(position == 0) return "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            stringBuilder.append(MOVE_CURRENT_POSITION);
        }
        return stringBuilder.toString();
    }


}
