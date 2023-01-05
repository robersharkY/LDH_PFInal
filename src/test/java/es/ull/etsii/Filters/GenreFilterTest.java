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
 * Unit test for GenreFilter class.
 */
public class GenreFilterTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GenreFilter#GenreFilter(String)}
     *   <li>{@link GenreFilter#satisfies(String)}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getGenres()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getGenres(MovieDatabase.java:47)
        //       at es.ull.etsii.Filters.GenreFilter.satisfies(GenreFilter.java:24)
        //   In order to prevent <init>(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new GenreFilter("Genre")).satisfies("42");
    }

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GenreFilter#GenreFilter(String)}
     *   <li>{@link GenreFilter#satisfies(String)}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getGenres()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getGenres(MovieDatabase.java:47)
        //       at es.ull.etsii.Filters.GenreFilter.satisfies(GenreFilter.java:24)
        //   In order to prevent <init>(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new GenreFilter("foo")).satisfies("42");
    }

    /**
     * Method under test: {@link GenreFilter#satisfies(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSatisfies() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getGenres()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getGenres(MovieDatabase.java:47)
        //       at es.ull.etsii.Filters.GenreFilter.satisfies(GenreFilter.java:24)
        //   In order to prevent satisfies(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   satisfies(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new GenreFilter("Genre")).satisfies("42");
    }

}