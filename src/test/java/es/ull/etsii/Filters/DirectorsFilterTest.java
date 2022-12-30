package es.ull.etsii.Filters;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for DirectorsFilter class.
 */
public class DirectorsFilterTest {

    /**
     * should answer with true
     */
    @Test
    public void satisfies() {
        assertTrue(true);
    }

    /**
     * Method under test: default or parameterless constructor of {@link DirectorsFilter}
     */
    @Test
    public void testConstructor() {
        assertEquals("Directors", (new DirectorsFilter("Directors")).directors);
    }

    /**
     * Method under test: {@link DirectorsFilter#satisfies(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSatisfies() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getDirector()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getDirector(MovieDatabase.java:76)
        //       at es.ull.etsii.Filters.DirectorsFilter.satisfies(DirectorsFilter.java:20)
        //   In order to prevent satisfies(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   satisfies(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new DirectorsFilter("Directors")).satisfies("42");
    }

    /**
     * Method under test: {@link DirectorsFilter#satisfies(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSatisfies2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getDirector()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getDirector(MovieDatabase.java:76)
        //       at es.ull.etsii.Filters.DirectorsFilter.satisfies(DirectorsFilter.java:20)
        //   In order to prevent satisfies(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   satisfies(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new DirectorsFilter("Directors")).satisfies("foo");
    }
}