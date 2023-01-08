package es.ull.etsii.Filters;

import es.ull.etsii.Movies.MovieDatabase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for AllFilters class.
 */
 class AllFiltersTest {

    /**
     * should answer with true
     */
    @Test
    void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    /**
     * Method under test: default or parameterless constructor of {@link AllFilters}
     */
    @Test
    void testConstructor() {
        AllFilters allFilters = new AllFilters();
        assertNotEquals(allFilters,null);
        assertTrue((new AllFilters()).filters.isEmpty());
    }

    /**
     * Method under test: {@link AllFilters#addFilter(Filter)}
     */
    @Test
    void testAddFilter() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new AllFilters());
        assertEquals(1, allFilters.filters.size());
        allFilters.addFilter(new AllFilters());
        assertEquals(2, allFilters.filters.size());
    }

    /**
     * Method under test: {@link AllFilters#satisfies(String)}
     */
    @Test
    void testSatisfies() {
        assertEquals(true,new AllFilters().satisfies("42"));
    }

    /**
     * Method under test: {@link AllFilters#satisfies(String)}
     */
    @Test
    void testSatisfies2() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new AllFilters());
        assertTrue(allFilters.satisfies("42"));
    }

    /**
     * Method under test: {@link AllFilters#satisfies(String)}
     */
    @Test
    void testSatisfies3() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(null);
        assertThrows(NullPointerException.class,()->{allFilters.satisfies("42");});
    }

    /**
     * Method under test: {@link AllFilters#satisfies(String)}
     */
    @Test
    void testSatisfies4() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new DirectorsFilter("Directors"));
        assertThrows(NullPointerException.class,()->{allFilters.satisfies("42");});
    }

}