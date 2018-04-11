package idv.clu.eftvj.ch3.item10.case2;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Carl Lu
 */
public class CompareTest {

    @Test
    public void testEqualsViolatesTransitivity() {
        ColorPoint p1 = new ColorPoint(1, 2, Color.PINK);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.CYAN);

        assertEquals(p1, p2);
        assertEquals(p2, p3);
        assertNotEquals(p1, p3);
    }

    @Test(expected = StackOverflowError.class)
    public void testEqualsThrowsStackOverflowError() {
        ColorPoint p1 = new ColorPoint(8, 7, Color.YELLOW);
        SmellPoint p2 = new SmellPoint(8, 7, "STINKY");

        p1.equals(p2);
    }

}
