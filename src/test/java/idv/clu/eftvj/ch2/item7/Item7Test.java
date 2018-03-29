package idv.clu.eftvj.ch2.item7;

import org.junit.Test;

import java.util.Map;
import java.util.WeakHashMap;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class Item7Test {

    @Test
    public void testWeakHashMap() {
        Loser winner = new Loser("clu");
        Loser loser = new Loser("bku");

        Map<Loser, String> weakHashMap = new WeakHashMap<>();

        weakHashMap.put(winner, "樓下領紙箱");
        weakHashMap.put(loser, "我領紙箱");

        int defaultMapSize = weakHashMap.size();

        winner = null;

        System.gc();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (weakHashMap.size() < defaultMapSize) {
                break;
            }
        }

        assertEquals(1, weakHashMap.size());
    }

}
