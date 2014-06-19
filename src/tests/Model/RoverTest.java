package Model;

import Constants.Direction;
import Constants.East;
import Constants.North;
import Constants.South;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class RoverTest {
    Direction direction;

    @Before
    public void setUp() throws Exception {
        Plateau plateau = new Plateau("5 5");
    }

    @Test
    public void testForRoverCreationOnValidPositions() throws Exception {
        Rover rover = new Rover("3 4 E");
        assertNotNull(rover);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testForRoverNotCreatedIfInvalidPositions() throws Exception {
        Rover rover = new Rover("6 5 E");
    }

    @Test
    public void roverShouldMoveLeft() throws Exception {
        Rover rover = new Rover("3 3 E");
        rover.moveRover('L');
        assertEquals(rover.position.direction.getClass(), North.class);
    }

    @Test
    public void roverShouldMoveRight() throws Exception {
        Rover rover = new Rover("3 3 E");
        rover.moveRover('R');
        assertEquals(rover.position.direction.getClass(), South.class);
    }

    @Test
    public void roverShouldMoveForward() throws Exception {
        Rover rover = new Rover("3 3 E");
        rover.moveRover('M');
        assertEquals(rover.position.direction.getClass(), East.class);
        assertEquals(rover.position.xPosition, 4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void roverShouldNotMoveForwardIfOutOfBound() throws Exception {
        Rover rover = new Rover("5 5 E");
        rover.moveRover('M');
    }

}
