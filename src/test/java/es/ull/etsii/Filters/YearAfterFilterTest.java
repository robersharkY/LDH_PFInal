package es.ull.etsii.Filters;

import org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for YearAfterFilter class.
 */
public class YearAfterFilterTest {

    /**
     * Method under test: default or parameterless constructor of {@link YearAfterFilter}
     */
    @Test
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     YearAfterFilter.myYear

        new YearAfterFilter(1);
    }

    /**
     * Method under test: {@link YearAfterFilter#satisfies(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSatisfies() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getYear()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getYear(MovieDatabase.java:42)
        //       at es.ull.etsii.Filters.YearAfterFilter.satisfies(YearAfterFilter.java:14)
        //   In order to prevent satisfies(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   satisfies(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new YearAfterFilter(1)).satisfies("42");
    }

    /**
     * Method under test: {@link YearAfterFilter#satisfies(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSatisfies2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getYear()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getYear(MovieDatabase.java:42)
        //       at es.ull.etsii.Filters.YearAfterFilter.satisfies(YearAfterFilter.java:14)
        //   In order to prevent satisfies(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   satisfies(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new YearAfterFilter(1)).satisfies("foo");
    }

}