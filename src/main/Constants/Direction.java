package Constants;

import Model.RoverPosition;

import javax.swing.text.Position;

/**
 * Created with IntelliJ IDEA.
 * User: shubham
 * Date: 16/06/14
 * Time: 10:13 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Direction {
    public static String value;

    public String getValue() {
        return value;
    }

    public abstract Direction getLeftDirection();
    public abstract Direction getRightDirection() ;
    public abstract void moveForward(RoverPosition position);
}
