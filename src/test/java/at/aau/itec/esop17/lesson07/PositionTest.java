package at.aau.itec.esop17.lesson07;

import junit.framework.TestCase;

public class PositionTest extends TestCase {
    public void testGetLength() {
        Position p = new Position(1d, 1d, 1d);
        assertEquals(3.0, p.getLength());
    }
}
