package idv.clu.eftvj.ch3.item10.case3;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * @author Carl Lu
 */
public class CompareTest {

    @Test
    public void testEqualsViolatesLiskovPrinciple() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

        assertEquals(p1, p2);
        assertNotEquals(p1, p3);
    }

    @Test
    public void testEqualsViolatesLiskovPrinciple2() {
        CounterPoint counterPoint = new CounterPoint(1, 0);
        assertFalse(Point.onUnitCircle(counterPoint));
    }

}
