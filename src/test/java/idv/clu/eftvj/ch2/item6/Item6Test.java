package idv.clu.eftvj.ch2.item6;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * @author Carl Lu
 */
public class Item6Test {

    @Test
    public void testKeySetIdentity() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        Set<Integer> keySet1 = map.keySet();
        System.out.println("--- set 1 ---" + keySet1);

        Set<Integer> keySet2 = map.keySet();
        System.out.println("--- set 2 ---" + keySet2);

        System.out.println("Remove key 2 from keySet1.");
        keySet1.remove(2);
        assertEquals(keySet1.size(), keySet2.size());
        System.out.println("--- set 1 ---" + keySet1);
        System.out.println("--- set 2 ---" + keySet2);

        System.out.println("Remove key 3 from map.");
        map.remove(3);
        System.out.println("--- set 1 ---" + keySet1);
        System.out.println("--- set 2 ---" + keySet2);

        Set<Integer> keySet3 = map.keySet();
        System.out.println("--- set 3 ---" + keySet3);

        System.out.println("set1 == set2 ? " + ( keySet1 == keySet2 ));
        System.out.println("set1 == set3 ? " + ( keySet1 == keySet3 ));

        assertEquals(keySet1.size(), keySet3.size());
        assertEquals(keySet1, keySet2);
        assertEquals(keySet1, keySet3);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testKeySetUnsupportedOperation() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        Set<Integer> keySet = map.keySet();
        keySet.add(6);
    }

    @Test
    public void testCalculateSumOfPrimitiveLong() {
        long expected = 2305843008139952128L;
        long actual = 0L;
        long start = System.currentTimeMillis();
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            actual += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Total cost for case testCalculateSumOfPrimitiveLong: " + ( end - start ) + " msec.");
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateSumOfBoxedPrimitiveLong() {
        Long expected = 2305843008139952128L;
        Long actual = 0L;
        long start = System.currentTimeMillis();
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            actual += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Total cost for case testCalculateSumOfBoxedPrimitiveLong: " + ( end - start ) + " msec.");
        assertEquals(expected, actual);
    }

}
