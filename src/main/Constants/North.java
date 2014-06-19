package Constants;

import Model.RoverPosition;

/**
 * Created by shubham on 17/06/14.
 */
public class North extends Direction {
    public North() {
        value = "N" ;
    }

    @Override
    public Direction getLeftDirection() {
        return new West();
    }

    @Override
    public Direction getRightDirection() {
        return new East();
    }

    @Override
    public void moveForward(RoverPosition position) {
        position.increaseYPosition();
    }
}
