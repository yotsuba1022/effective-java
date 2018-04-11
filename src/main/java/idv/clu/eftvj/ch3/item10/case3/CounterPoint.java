package idv.clu.eftvj.ch3.item10.case3;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Carl Lu
 */
public class CounterPoint extends Point {

    private final static AtomicInteger counter = new AtomicInteger();

    public CounterPoint(int x, int y) {
        super(x, y);
        counter.incrementAndGet();
    }

    public static int numberCreated() {
        return counter.get();
    }

}
