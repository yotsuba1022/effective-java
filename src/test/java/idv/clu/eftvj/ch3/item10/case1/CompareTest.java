package idv.clu.eftvj.ch3.item10.case1;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * @author Carl Lu
 */
public class CompareTest {

    @Test
    public void testEqualsViolatesSymmetry() {
        Point point = new Point(1, 2);
        ColorPoint colorPoint = new ColorPoint(1, 2, Color.BLUE);
        assertEquals(point, colorPoint);
        assertNotEquals(colorPoint, point);
    }

}
