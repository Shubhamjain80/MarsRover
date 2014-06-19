package Constants;

import Model.RoverPosition;

public class East extends Direction {
    public East() {
        value = "E";
    }

    @Override
    public Direction getLeftDirection() {
        return new North();
    }

    @Override
    public Direction getRightDirection() {
        return new South();
    }

    @Override
    public void moveForward(RoverPosition position) {
        position.increaseXPosition();
    }

}
