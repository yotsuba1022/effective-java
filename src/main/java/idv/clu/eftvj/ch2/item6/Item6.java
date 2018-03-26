package idv.clu.eftvj.ch2.item6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Carl Lu
 */
public class Item6 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        Set<Integer> set1 = map.keySet();
        System.out.println("--- set 1 ---" + set1);

        Set<Integer> set2 = map.keySet();
        System.out.println("--- set 2 ---" + set2);

        System.out.println("Remove key 3:");
        map.remove(3);
        System.out.println("--- set 1 ---" + set1);
        System.out.println("--- set 2 ---" + set2);

        Set<Integer> set3 = map.keySet();
        System.out.println("--- set 3 ---" + set3);

        System.out.println("set1 == set2? " + ( set1 == set2 ));
        System.out.println("set1 == set3? " + ( set1 == set3 ));
    }

}
