package it.sevenbits.reversion_with_generics.reversion;

import it.sevenbits.reversion_with_generics.exceptions.MyNullPointerException;
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
        Integer[] reversed = this.rev.reverse(original);
        assertArrayEquals("wrong reverse", new Integer[] {6, 5, 4, 3, 2, 1, 0}, reversed);
    }

    @Test
    public void testReverseCharacterArray() throws Exception {
        Character[] original = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        Character[] reversed = this.rev.reverse(original);
        assertArrayEquals("wrong reverse", new Character[] {'g', 'f', 'e', 'd', 'c', 'b', 'a'}, reversed);
    }

    @Test
    public void testReverseFloatArray() throws Exception {
        Float[] original = {0.11f, 2.0f, 3.33f, 5.75f, 10.10f};
        Float[] reversed = this.rev.reverse(original);
        assertArrayEquals("wrong reverse", new Float[] {10.10f, 5.75f, 3.33f, 2.0f, 0.11f}, reversed);
    }

    @Test
    public void testReverseStringArray() throws Exception {
        String[] original = {"one", "two", "three", "four", "five"};
        String[] reversed = this.rev.reverse(original);
        assertArrayEquals("wrong reverse", new String[] {"five", "four", "three", "two", "one"}, reversed);
    }

    @Test(expected = MyNullPointerException.class)
    public void testReverseNullPointer() throws Exception {
        String[] reversed = this.rev.reverse(null);
    }
}