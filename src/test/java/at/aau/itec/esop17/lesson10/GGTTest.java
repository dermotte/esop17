package at.aau.itec.esop17.lesson10;

import junit.framework.TestCase;

public class GGTTest extends TestCase {
    public void testGGT() {
        GGT myGGT = new GGT();
        assertEquals(myGGT.ggtRecursive(7, 3), 1);
        assertEquals(myGGT.ggtRecursive(4, 4), 4);
        assertEquals(myGGT.ggtIterative(4, 4), 4);
        assertEquals(myGGT.ggtIterative(21, 3), 3);
    }
}
