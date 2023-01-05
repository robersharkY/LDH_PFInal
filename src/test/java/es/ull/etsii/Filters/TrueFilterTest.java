package es.ull.etsii.Filters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Unit test for TrueFilter class.
 */
public class TrueFilterTest {

    /**
     * Method under test: {@link TrueFilter#satisfies(String)}
     */
    @Test
    void testSatisfies() {
        assertEquals(true,new TrueFilter().satisfies("42"));
        assertEquals(true,new TrueFilter().satisfies("45"));
        assertNotEquals(false,new TrueFilter().satisfies("45"));
    }

}