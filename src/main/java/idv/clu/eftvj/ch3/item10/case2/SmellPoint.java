package idv.clu.eftvj.ch3.item10.case2;

/**
 * @author Carl Lu
 */
public class SmellPoint extends Point {

    private final String smell;

    public SmellPoint(int x, int y, String smell) {
        super(x, y);
        this.smell = smell;
    }

    public String getSmell() {
        return smell;
    }

    // This implementation violates transitivity
    @Override
    public boolean equals(Object o) {
        if (!( o instanceof Point )) {
            return false; // If o is a normal Point, do a color-blind comparison
        }

        if (!( o instanceof SmellPoint )) {
            return o.equals(this);
        }

        // o is a ColorPoint; do a full comparison
        return super.equals(o) && ( (SmellPoint) o ).smell.equals(smell);
    }
}
