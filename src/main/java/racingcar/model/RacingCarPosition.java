package racingcar.model;


import java.util.Objects;

public class RacingCarPosition {

    private static final int ZERO = 0;
    private static final int FORWARD = 1;

    private int position;

    public RacingCarPosition(int position) {
        validateRacingCardPositionPositive(position);
        this.position = position;
    }

    public void moveForward() {
         this.position++;
    }

    public int get(){
        return this.position;
    }

    private static void validateRacingCardPositionPositive(int position) {
        if (position < ZERO) throw new IllegalArgumentException();
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

}
