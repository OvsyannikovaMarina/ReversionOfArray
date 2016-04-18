package it.sevenbits.reversion_with_generics.reversion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test for Reverse class
 */
public class ReversionTest {

    private Reversion rev;

    @Before
    public void setUp() throws Exception {
        this.rev = new Reversion();
    }

    @Test
    public void testReverseIntegerArray() throws Exception {
        Integer[] original = {0, 1, 2, 3, 4, 5, 6};
        this.rev.reverse(original);
        assertArrayEquals("wrong reverse", new Integer[] {6, 5, 4, 3, 2, 1, 0}, original);
    }

    @Test
    public void testReverseCharacterArray() throws Exception {
        Character[] original = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        this.rev.reverse(original);
        assertArrayEquals("wrong reverse", new Character[] {'g', 'f', 'e', 'd', 'c', 'b', 'a'}, original);
    }

    @Test
    public void testReverseFloatArray() throws Exception {
        Float[] original = {0.11f, 2.0f, 3.33f, 5.75f, 10.10f};
        this.rev.reverse(original);
        assertArrayEquals("wrong reverse", new Float[] {10.10f, 5.75f, 3.33f, 2.0f, 0.11f}, original);
    }

    @Test
    public void testReverseStringArray() throws Exception {
        String[] original = {"one", "two", "three", "four", "five"};
        this.rev.reverse(original);
        assertArrayEquals("wrong reverse", new String[] {"five", "four", "three", "two", "one"}, original);
    }

    @Test(expected = NullPointerException.class)
    public void testReverseNullPointer() throws Exception {
        this.rev.reverse(null);
    }
}