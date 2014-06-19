package Constants;

import Model.RoverPosition;

public class South extends Direction {
    public South() {
        value = "S";
    }

    @Override
    public Direction getLeftDirection() {
        return new East();
    }

    @Override
    public Direction getRightDirection() {
        return new West();
    }

    @Override
    public void moveForward(RoverPosition position) {
        position.decreaseXPosition();
    }
}
