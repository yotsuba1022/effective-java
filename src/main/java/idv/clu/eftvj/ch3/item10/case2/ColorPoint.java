package idv.clu.eftvj.ch3.item10.case2;

import java.awt.*;

/**
 * @author Carl Lu
 */
public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    // This implementation violates transitivity
    @Override
    public boolean equals(Object o) {
        if (!( o instanceof Point )) {
            return false; // If o is a normal Point, do a color-blind comparison
        }

        if (!( o instanceof ColorPoint )) {
            return o.equals(this);
        }

        // o is a ColorPoint; do a full comparison
        return super.equals(o) && ( (ColorPoint) o ).color == color;
    }

}
