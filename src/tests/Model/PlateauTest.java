package Model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: shubham
 * Date: 16/06/14
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlateauTest {

    @Test
    public void testForCreatingOnlyOneInstanceOfPlateau() throws Exception {
        Plateau plateauOne = new Plateau("5 5");
        Plateau plateauTwo = new Plateau("3 3");
        assertEquals(plateauOne.xLimit,plateauTwo.xLimit);
    }

}
