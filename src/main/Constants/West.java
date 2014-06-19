package Constants;

import Model.RoverPosition;

public class West extends Direction {
    public West() {
        value = "W";
    }

    @Override
    public Direction getLeftDirection() {
        return new South();
    }

    @Override
    public Direction getRightDirection() {
        return new North();
    }

    @Override
    public void moveForward(RoverPosition position) {
        position.decreaseYPosition();
    }
}
