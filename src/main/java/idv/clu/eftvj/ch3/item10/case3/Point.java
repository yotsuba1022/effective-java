package idv.clu.eftvj.ch3.item10.case3;

import java.util.Objects;
import java.util.Set;

/**
 * @author Carl Lu
 */
public class Point {

    private static final Set<Point> unitCircle = Set.of(new Point(1, 0), new Point(0, 1), new Point(-1, 0), new Point(0, -1));
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // This implementation violates Liskov substitution principle
    @Override
    public boolean equals(Object o) {
        if (o == null || o.getClass() != getClass()) {
            return false;
        }
        Point p = (Point) o;
        return p.x == x && p.y == y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
