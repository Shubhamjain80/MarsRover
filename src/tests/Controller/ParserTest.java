package Controller;

import Model.Plateau;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Before
    public void setUp() throws Exception {
        Plateau plateau = new Plateau("5 5");

    }

    @Test
    public void testForParsingTheInput() throws Exception {
        Parser parser = new Parser("1 2 N", "LMLMLMLMM");
        String output = parser.parseInput();
        assertEquals(output, "13N");
    }
}