package es.ull.etsii.Filters;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for MinutesFilter class.
 */
public class MinutesFilterTest {


    /**
     * Method under test: {@link MinutesFilter#MinutesFilter(int)}
     */
    @Test
    void testConstructor() {
        MinutesFilter actualMinutesFilter = new MinutesFilter(1);
        assertEquals(1,actualMinutesFilter.getMinMinutes());
        assertEquals(Integer.MAX_VALUE,actualMinutesFilter.getMaxMinutes());
    }

    /**
     * Method under test: {@link MinutesFilter#MinutesFilter(int, int)}
     */
    @Test
    void testConstructor2() {
        MinutesFilter actualMinutesFilter = new MinutesFilter(1,3);
        assertEquals(1,actualMinutesFilter.getMinMinutes());
        assertEquals(3,actualMinutesFilter.getMaxMinutes());
    }

    /**
     * Method under test: {@link MinutesFilter#satisfies(String)}
     */
    @Test
    void testSatisfies() {
        assertThrows(NullPointerException.class,()->{ (new MinutesFilter(1)).satisfies("42");});
    }

    /**
     * Method under test: {@link MinutesFilter#satisfies(String)}
     */
    @Test
    void testSatisfies2() {
        assertThrows(NullPointerException.class,()->{ (new MinutesFilter(1)).satisfies("foo");});
    }

}