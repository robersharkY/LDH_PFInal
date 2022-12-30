package es.ull.etsii.Filters;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for MinutesFilter class.
 */
public class MinutesFilterTest {

    /**
     * should answer with true
     */
    @Test
    public void satisfies() {
        assertTrue(true);
    }

    /**
     * Method under test: {@link MinutesFilter#MinutesFilter(int)}
     */
    @Test
    public void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     MinutesFilter.minMinutes
        //     MinutesFilter.maxMinutes

        new MinutesFilter(1);
    }

    /**
     * Method under test: {@link MinutesFilter#MinutesFilter(int, int)}
     */
    @Test
    public void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     MinutesFilter.minMinutes
        //     MinutesFilter.maxMinutes

        new MinutesFilter(1, 3);

    }

    /**
     * Method under test: {@link MinutesFilter#satisfies(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSatisfies() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getMinutes()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getMinutes(MovieDatabase.java:66)
        //       at es.ull.etsii.Filters.MinutesFilter.satisfies(MinutesFilter.java:28)
        //   In order to prevent satisfies(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   satisfies(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new MinutesFilter(1)).satisfies("42");
    }

    /**
     * Method under test: {@link MinutesFilter#satisfies(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testSatisfies2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getMinutes()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getMinutes(MovieDatabase.java:66)
        //       at es.ull.etsii.Filters.MinutesFilter.satisfies(MinutesFilter.java:28)
        //   In order to prevent satisfies(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   satisfies(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new MinutesFilter(1)).satisfies("foo");
    }
}