package idv.clu.eftvj.ch2.item8;

import org.junit.Test;

/**
 * @author Carl Lu
 */
public class Item8Test {

    @Test
    public void testWellBehavedClient() throws Exception {
        try (Room myRoom = new Room(10)) {
            System.out.println("hehehe");
        }
    }

    @Test
    public void testIllBehavedClient() {
        new Room(99);
        System.out.println("lalala");
    }

}
