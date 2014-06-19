package Model;

import Constants.Direction;
import Constants.East;
import Constants.North;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: shubham
 * Date: 16/06/14
 * Time: 11:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class RoverPositionTest {
    private RoverPosition position;
    private Direction direction;

    @Before
    public void setUp() throws Exception {
        String[] inputArrayForPosition = {"3","3","E"} ;
        position = new RoverPosition(inputArrayForPosition);
    }
}
