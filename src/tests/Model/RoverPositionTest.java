package Model;

import Constants.Direction;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        String[] inputArrayForPosition = {"3", "3", "E"};
        position = new RoverPosition(inputArrayForPosition);
    }

    @Test
    public void testForFormattedOutput() throws Exception {
        assertEquals("33E", position.outPutInFormattedString());

    }
}
