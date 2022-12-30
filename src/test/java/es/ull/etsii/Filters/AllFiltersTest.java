package es.ull.etsii.Filters;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for AllFilters class.
 */
public class AllFiltersTest {

    /**
     * Method under test: default or parameterless constructor of {@link AllFilters}
     */
    @Test
    public void testConstructor() {
        assertTrue((new AllFilters()).filters.isEmpty());
        assertTrue((new AllFilters()).filters.isEmpty());
    }

    /**
     * Method under test: {@link AllFilters#addFilter(Filter)}
     */
    @Test
    public void testAddFilter() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new AllFilters());
        assertEquals(1, allFilters.filters.size());
    }

    /**
     * Method under test: {@link AllFilters#addFilter(Filter)}
     */
    @Test
    public void testAddFilter2() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new AllFilters());
        assertEquals(1, allFilters.filters.size());
    }

    /**
     * should answer with true
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    /**
     * Method under test: {@link AllFilters#satisfies(String)}
     */
    @Test
    public void testSatisfies() {
        assertTrue((new AllFilters()).satisfies("42"));
        assertTrue((new AllFilters()).satisfies("42"));
    }

    /**
     * Method under test: {@link AllFilters#satisfies(String)}
     */
    @Test
    public void testSatisfies2() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new AllFilters());
        assertTrue(allFilters.satisfies("42"));
    }

    /**
     * Method under test: {@link AllFilters#satisfies(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSatisfies3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Filters.Filter.satisfies(String)" because "f" is null
        //       at es.ull.etsii.Filters.AllFilters.satisfies(AllFilters.java:19)
        //   In order to prevent satisfies(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   satisfies(String).
        //   See https://diff.blue/R013 to resolve this issue.

        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(null);
        allFilters.satisfies("42");
    }

    /**
     * Method under test: {@link AllFilters#satisfies(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSatisfies4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getDirector()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getDirector(MovieDatabase.java:76)
        //       at es.ull.etsii.Filters.DirectorsFilter.satisfies(DirectorsFilter.java:20)
        //       at es.ull.etsii.Filters.AllFilters.satisfies(AllFilters.java:19)
        //   In order to prevent satisfies(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   satisfies(String).
        //   See https://diff.blue/R013 to resolve this issue.

        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new DirectorsFilter("Directors"));
        allFilters.satisfies("42");
    }

    /**
     * Method under test: {@link AllFilters#satisfies(String)}
     */
    @Test
    public void testSatisfies5() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new TrueFilter());
        assertTrue(allFilters.satisfies("42"));
    }

    /**
     * Method under test: {@link AllFilters#satisfies(String)}
     */
    @Test
    public void testSatisfies6() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new AllFilters());
        assertTrue(allFilters.satisfies("42"));
    }

    /**
     * Method under test: {@link AllFilters#satisfies(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSatisfies7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Filters.Filter.satisfies(String)" because "f" is null
        //       at es.ull.etsii.Filters.AllFilters.satisfies(AllFilters.java:19)
        //   In order to prevent satisfies(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   satisfies(String).
        //   See https://diff.blue/R013 to resolve this issue.

        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(null);
        allFilters.satisfies("42");
    }

    /**
     * Method under test: {@link AllFilters#satisfies(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSatisfies8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getDirector()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getDirector(MovieDatabase.java:76)
        //       at es.ull.etsii.Filters.DirectorsFilter.satisfies(DirectorsFilter.java:20)
        //       at es.ull.etsii.Filters.AllFilters.satisfies(AllFilters.java:19)
        //   In order to prevent satisfies(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   satisfies(String).
        //   See https://diff.blue/R013 to resolve this issue.

        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new DirectorsFilter("Directors"));
        allFilters.satisfies("42");
    }

    /**
     * Method under test: {@link AllFilters#satisfies(String)}
     */
    @Test
    public void testSatisfies9() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new TrueFilter());
        assertTrue(allFilters.satisfies("42"));
    }
}