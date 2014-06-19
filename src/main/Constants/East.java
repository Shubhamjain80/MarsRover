package Constants;

import Model.RoverPosition;

/**
 * Created by shubham on 17/06/14.
 */
public class East extends Direction {
    public East() {
        value="E";
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
