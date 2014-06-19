package Constants;

import Model.RoverPosition;

import java.util.HashMap;
import java.util.Map;

public abstract class Direction {
    public String value;

    public abstract Direction getLeftDirection();

    public abstract Direction getRightDirection();

    public abstract void moveForward(RoverPosition position);
    public static Direction getDirectionForString(String directionString) {
        Map<String, Direction> directionMap = new HashMap();
        directionMap.put("N", new North());
        directionMap.put("S", new South());
        directionMap.put("E", new East());
        directionMap.put("W", new West());
        if (!directionMap.containsKey(directionString))
            throw new IllegalArgumentException("Wrong direction");
        return directionMap.get(directionString);
    }

    public String getOutput(String output) {
        return output+value;
    }
}
