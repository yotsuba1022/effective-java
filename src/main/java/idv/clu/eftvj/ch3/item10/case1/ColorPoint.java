package idv.clu.eftvj.ch3.item10.case1;

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

    // This implementation violates symmetry
    @Override
    public boolean equals(Object o) {
        if (!( o instanceof ColorPoint ))
            return false;
        return super.equals(o) && ( (ColorPoint) o ).color == color;
    }

}
