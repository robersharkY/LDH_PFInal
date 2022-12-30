package es.ull.etsii.Filters;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for TrueFilter class.
 */
public class TrueFilterTest {

    /**
     * should answer with true
     */
    @Test
    public void satisfies() {
        assertTrue(true);
    }

    /**
     * Method under test: {@link TrueFilter#satisfies(String)}
     */
    @Test
    public void testSatisfies() {
        assertTrue((new TrueFilter()).satisfies("42"));
    }
}