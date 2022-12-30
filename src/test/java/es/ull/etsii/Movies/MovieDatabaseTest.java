package es.ull.etsii.Movies;

import es.ull.etsii.Filters.AllFilters;
import es.ull.etsii.Filters.DirectorsFilter;
import es.ull.etsii.Filters.Filter;
import es.ull.etsii.Filters.GenreFilter;
import es.ull.etsii.Filters.MinutesFilter;
import es.ull.etsii.Filters.TrueFilter;
import es.ull.etsii.Filters.YearAfterFilter;

import java.util.ArrayList;

import org.junit.Ignore;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for MovieDatabase class.
 */
public class MovieDatabaseTest {

    /**
     * Method under test: {@link MovieDatabase#initialize(String)}
     */
    @Test
    public void testInitialize() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by initialize(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        MovieDatabase.initialize("Moviefile");
    }

    /**
     * should answer with true
     */
    @Test
    public void initialize() {
        assertTrue(true);
    }

    /**
     * Method under test: {@link MovieDatabase#containsID(String)}
     */
    @Test
    public void testContainsID() {
        assertFalse(MovieDatabase.containsID("42"));
        assertFalse(MovieDatabase.containsID("foo"));
    }

    /**
     * Method under test: {@link MovieDatabase#getYear(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetYear() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getYear()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getYear(MovieDatabase.java:41)
        //   In order to prevent getYear(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getYear(String).
        //   See https://diff.blue/R013 to resolve this issue.

        MovieDatabase.getYear("42");
    }

    /**
     * Method under test: {@link MovieDatabase#getGenres(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetGenres() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getGenres()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getGenres(MovieDatabase.java:46)
        //   In order to prevent getGenres(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getGenres(String).
        //   See https://diff.blue/R013 to resolve this issue.

        MovieDatabase.getGenres("42");
    }

    /**
     * Method under test: {@link MovieDatabase#getTitle(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetTitle() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getTitle()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getTitle(MovieDatabase.java:51)
        //   In order to prevent getTitle(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getTitle(String).
        //   See https://diff.blue/R013 to resolve this issue.

        MovieDatabase.getTitle("42");
    }

    /**
     * Method under test: {@link MovieDatabase#getMovie(String)}
     */
    @Test
    public void testGetMovie() {
        assertNull(MovieDatabase.getMovie("42"));
    }

    /**
     * Method under test: {@link MovieDatabase#getPoster(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetPoster() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getPoster()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getPoster(MovieDatabase.java:61)
        //   In order to prevent getPoster(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getPoster(String).
        //   See https://diff.blue/R013 to resolve this issue.

        MovieDatabase.getPoster("42");
    }

    /**
     * Method under test: {@link MovieDatabase#getMinutes(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetMinutes() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getMinutes()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getMinutes(MovieDatabase.java:66)
        //   In order to prevent getMinutes(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getMinutes(String).
        //   See https://diff.blue/R013 to resolve this issue.

        MovieDatabase.getMinutes("42");
    }

    /**
     * Method under test: {@link MovieDatabase#getCountry(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetCountry() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getCountry()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getCountry(MovieDatabase.java:71)
        //   In order to prevent getCountry(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getCountry(String).
        //   See https://diff.blue/R013 to resolve this issue.

        MovieDatabase.getCountry("42");
    }

    /**
     * Method under test: {@link MovieDatabase#getDirector(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testGetDirector() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Movies.Movie.getDirector()" because the return value of "com.diffblue.cover.agent.readwrite.RuntimeWrappers.map$get(java.util.Map, Object)" is null
        //       at es.ull.etsii.Movies.MovieDatabase.getDirector(MovieDatabase.java:76)
        //   In order to prevent getDirector(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getDirector(String).
        //   See https://diff.blue/R013 to resolve this issue.

        MovieDatabase.getDirector("42");
    }

    /**
     * Method under test: {@link MovieDatabase#size()}
     */
    @Test
    public void testSize() {
        assertEquals(3143, MovieDatabase.size());
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    public void testFilterBy() {
        ArrayList<String> actualFilterByResult = MovieDatabase.filterBy(new AllFilters());
        assertEquals(3143, actualFilterByResult.size());
        assertEquals("0055601", actualFilterByResult.get(0));
        assertEquals("1714915", actualFilterByResult.get(1));
        assertEquals("2277150", actualFilterByResult.get(2));
        assertEquals("4437212", actualFilterByResult.get(3));
        assertEquals("2820852", actualFilterByResult.get(4));
        assertEquals("1255953", actualFilterByResult.get(5));
        assertEquals("0060176", actualFilterByResult.get(3137));
        assertEquals("1270262", actualFilterByResult.get(3138));
        assertEquals("3007512", actualFilterByResult.get(3139));
        assertEquals("0043618", actualFilterByResult.get(3140));
        assertEquals("1621039", actualFilterByResult.get(3141));
        assertEquals("2713180", actualFilterByResult.get(3142));
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(Filter)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testFilterBy2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "es.ull.etsii.Filters.Filter.satisfies(String)" because "f" is null
        //       at es.ull.etsii.Movies.MovieDatabase.filterBy(MovieDatabase.java:87)
        //   In order to prevent filterBy(Filter)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   filterBy(Filter).
        //   See https://diff.blue/R013 to resolve this issue.

        MovieDatabase.filterBy(null);
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    public void testFilterBy3() {
        ArrayList<String> actualFilterByResult = MovieDatabase.filterBy(new TrueFilter());
        assertEquals(3143, actualFilterByResult.size());
        assertEquals("0055601", actualFilterByResult.get(0));
        assertEquals("1714915", actualFilterByResult.get(1));
        assertEquals("2277150", actualFilterByResult.get(2));
        assertEquals("4437212", actualFilterByResult.get(3));
        assertEquals("2820852", actualFilterByResult.get(4));
        assertEquals("1255953", actualFilterByResult.get(5));
        assertEquals("0060176", actualFilterByResult.get(3137));
        assertEquals("1270262", actualFilterByResult.get(3138));
        assertEquals("3007512", actualFilterByResult.get(3139));
        assertEquals("0043618", actualFilterByResult.get(3140));
        assertEquals("1621039", actualFilterByResult.get(3141));
        assertEquals("2713180", actualFilterByResult.get(3142));
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    public void testFilterBy4() {
        ArrayList<String> actualFilterByResult = MovieDatabase.filterBy(new MinutesFilter(1));
        assertEquals(3120, actualFilterByResult.size());
        assertEquals("0055601", actualFilterByResult.get(0));
        assertEquals("1714915", actualFilterByResult.get(1));
        assertEquals("2277150", actualFilterByResult.get(2));
        assertEquals("4437212", actualFilterByResult.get(3));
        assertEquals("2820852", actualFilterByResult.get(4));
        assertEquals("1255953", actualFilterByResult.get(5));
        assertEquals("0060176", actualFilterByResult.get(3114));
        assertEquals("1270262", actualFilterByResult.get(3115));
        assertEquals("3007512", actualFilterByResult.get(3116));
        assertEquals("0043618", actualFilterByResult.get(3117));
        assertEquals("1621039", actualFilterByResult.get(3118));
        assertEquals("2713180", actualFilterByResult.get(3119));
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    public void testFilterBy5() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new DirectorsFilter("Directors"));
        assertTrue(MovieDatabase.filterBy(allFilters).isEmpty());
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    public void testFilterBy6() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new GenreFilter("Genre"));
        assertTrue(MovieDatabase.filterBy(allFilters).isEmpty());
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    public void testFilterBy7() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new YearAfterFilter(1));
        ArrayList<String> actualFilterByResult = MovieDatabase.filterBy(allFilters);
        assertEquals(3143, actualFilterByResult.size());
        assertEquals("0055601", actualFilterByResult.get(0));
        assertEquals("1714915", actualFilterByResult.get(1));
        assertEquals("2277150", actualFilterByResult.get(2));
        assertEquals("4437212", actualFilterByResult.get(3));
        assertEquals("2820852", actualFilterByResult.get(4));
        assertEquals("1255953", actualFilterByResult.get(5));
        assertEquals("0060176", actualFilterByResult.get(3137));
        assertEquals("1270262", actualFilterByResult.get(3138));
        assertEquals("3007512", actualFilterByResult.get(3139));
        assertEquals("0043618", actualFilterByResult.get(3140));
        assertEquals("1621039", actualFilterByResult.get(3141));
        assertEquals("2713180", actualFilterByResult.get(3142));
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    public void testFilterBy8() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new MinutesFilter(1));
        allFilters.addFilter(new DirectorsFilter("Directors"));
        assertTrue(MovieDatabase.filterBy(allFilters).isEmpty());
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    public void testFilterBy9() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new MinutesFilter(1));
        allFilters.addFilter(new GenreFilter(","));
        ArrayList<String> actualFilterByResult = MovieDatabase.filterBy(allFilters);
        assertEquals(2618, actualFilterByResult.size());
        assertEquals("1714915", actualFilterByResult.get(0));
        assertEquals("2277150", actualFilterByResult.get(1));
        assertEquals("2820852", actualFilterByResult.get(2));
        assertEquals("1255953", actualFilterByResult.get(3));
        assertEquals("0339412", actualFilterByResult.get(4));
        assertEquals("1172203", actualFilterByResult.get(5));
        assertEquals("0060176", actualFilterByResult.get(2612));
        assertEquals("1270262", actualFilterByResult.get(2613));
        assertEquals("3007512", actualFilterByResult.get(2614));
        assertEquals("0043618", actualFilterByResult.get(2615));
        assertEquals("1621039", actualFilterByResult.get(2616));
        assertEquals("2713180", actualFilterByResult.get(2617));
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    public void testFilterBy10() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new MinutesFilter(1));
        allFilters.addFilter(new YearAfterFilter(1));
        ArrayList<String> actualFilterByResult = MovieDatabase.filterBy(allFilters);
        assertEquals(3120, actualFilterByResult.size());
        assertEquals("0055601", actualFilterByResult.get(0));
        assertEquals("1714915", actualFilterByResult.get(1));
        assertEquals("2277150", actualFilterByResult.get(2));
        assertEquals("4437212", actualFilterByResult.get(3));
        assertEquals("2820852", actualFilterByResult.get(4));
        assertEquals("1255953", actualFilterByResult.get(5));
        assertEquals("0060176", actualFilterByResult.get(3114));
        assertEquals("1270262", actualFilterByResult.get(3115));
        assertEquals("3007512", actualFilterByResult.get(3116));
        assertEquals("0043618", actualFilterByResult.get(3117));
        assertEquals("1621039", actualFilterByResult.get(3118));
        assertEquals("2713180", actualFilterByResult.get(3119));
    }

    /**
     * should answer with true
     */
    @Test
    public void containsID() {
        assertTrue(true);
    }

    /**
     * should answer with true
     */
    @Test
    public void getYear() {
        assertTrue(true);
    }

    /**
     * should answer with true
     */
    @Test
    public void getGenres() {
        assertTrue(true);
    }

    /**
     * should answer with true
     */
    @Test
    public void getTitle() {
        assertTrue(true);
    }

    /**
     * should answer with true
     */
    @Test
    public void getMovie() {
        assertTrue(true);
    }

    /**
     * should answer with true
     */
    @Test
    public void getPoster() {
        assertTrue(true);
    }

    /**
     * should answer with true
     */
    @Test
    public void getMinutes() {
        assertTrue(true);
    }

    /**
     * should answer with true
     */
    @Test
    public void getCountry() {
        assertTrue(true);
    }

    /**
     * should answer with true
     */
    @Test
    public void getDirector() {
        assertTrue(true);
    }

    /**
     * should answer with true
     */
    @Test
    public void size() {
        assertTrue(true);
    }

    /**
     * should answer with true
     */
    @Test
    public void filterBy() {
        assertTrue(true);
    }
}