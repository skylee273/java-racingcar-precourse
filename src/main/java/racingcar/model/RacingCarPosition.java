package racingcar.model;


import java.util.Objects;

public class RacingCarPosition {

    private static final int ZERO = 0;
    private static final int FORWARD = 1;
    private static final String MOVE_CURRENT_POSITION = "-";

    private final int position;

    public RacingCarPosition(final int position) {
        validateRacingCardPositionPositive(position);
        this.position = position;
    }

    public RacingCarPosition moveForward() {
        return new RacingCarPosition(position + FORWARD);
    }

    public int moveStop(){
        return this.position;
    }

    public static void validateRacingCardPositionPositive(int position) {
        if(position < ZERO) throw new IllegalArgumentException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingCarPosition that = (RacingCarPosition) o;
        return position == that.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
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
