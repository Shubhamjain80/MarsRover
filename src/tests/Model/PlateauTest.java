package Model;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PlateauTest {

    @Test
    public void testForCreatingOnlyOneInstanceOfPlateau() throws Exception {
        Plateau plateauOne = new Plateau("5 5");
        Plateau plateauTwo = new Plateau("3 3");
        assertEquals(plateauOne.xLimit, plateauTwo.xLimit);
    }

}
