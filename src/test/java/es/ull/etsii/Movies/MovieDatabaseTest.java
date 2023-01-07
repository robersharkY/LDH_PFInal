package es.ull.etsii.Movies;

import es.ull.etsii.Filters.AllFilters;
import es.ull.etsii.Filters.DirectorsFilter;
import es.ull.etsii.Filters.Filter;
import es.ull.etsii.Filters.GenreFilter;
import es.ull.etsii.Filters.MinutesFilter;
import es.ull.etsii.Filters.TrueFilter;
import es.ull.etsii.Filters.YearAfterFilter;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for MovieDatabase class.
 */
public class MovieDatabaseTest {

    /**
     * Method under test: {@link MovieDatabase#initialize(String)}
     */
    @Test
    void testInitialize() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by initialize(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        MovieDatabase.initialize();
    }

    /**
     * Method under test: {@link MovieDatabase#loadMovies(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLoadMovies() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   es.courserajava.edu.duke.ResourceException: FileResource: cannot access foo.txt
        //       at es.courserajava.edu.duke.FileResource.initRead(FileResource.java:370)
        //       at es.courserajava.edu.duke.FileResource.<init>(FileResource.java:95)
        //       at es.ull.etsii.Ratings.FirstRatings.loadMovies(FirstRatings.java:150)
        //       at es.ull.etsii.Movies.MovieDatabase.loadMovies(MovieDatabase.java:29)
        //   In order to prevent loadMovies(String)
        //   from throwing ResourceException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   loadMovies(String).
        //   See https://diff.blue/R013 to resolve this issue.

        MovieDatabase.loadMovies("foo.txt");
    }

    /**
     * Method under test: {@link MovieDatabase#loadMovies(String)}
     */
    @Test
    void testLoadMovies2() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by loadMovies(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        MovieDatabase.loadMovies("");
    }

    /**
     * Method under test: {@link MovieDatabase#loadMovies(String)}
     */
    @Test
    void testLoadMovies3() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by loadMovies(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        MovieDatabase.loadMovies("src/main/resources/ratedmoviesfull.csv");
    }

    /**
     * Method under test: {@link MovieDatabase#containsID(String)}
     */
    @Test
    void testContainsID() {
        assertFalse(MovieDatabase.containsID("42"));
        assertFalse(MovieDatabase.containsID("foo"));
    }

    /**
     * Method under test: {@link MovieDatabase#getYear(String)}
     */
    @Test
    void testGetYear() {
        assertThrows(NullPointerException.class,()->{MovieDatabase.getYear("42");});
    }

    /**
     * Method under test: {@link MovieDatabase#getGenres(String)}
     */
    @Test
    void testGetGenres() {
        assertThrows(NullPointerException.class,()->{MovieDatabase.getGenres("42");});
    }

    /**
     * Method under test: {@link MovieDatabase#getTitle(String)}
     */
    @Test
    void testGetTitle() {
        assertThrows(NullPointerException.class,()->{MovieDatabase.getTitle("42");});
    }

    /**
     * Method under test: {@link MovieDatabase#getMovie(String)}
     */
    @Test
    void testGetMovie() {
        assertNull(MovieDatabase.getMovie("42"));
    }

    /**
     * Method under test: {@link MovieDatabase#getPoster(String)}
     */
    @Test
    void testGetPoster() {
        assertThrows(NullPointerException.class,()->{MovieDatabase.getPoster("42");});
    }

    /**
     * Method under test: {@link MovieDatabase#getMinutes(String)}
     */
    @Test
    void testGetMinutes() {
        assertThrows(NullPointerException.class,()->{MovieDatabase.getMinutes("42");});
    }

    /**
     * Method under test: {@link MovieDatabase#getCountry(String)}
     */
    @Test
    void testGetCountry() {
        assertThrows(NullPointerException.class,()->{ MovieDatabase.getCountry("42");});
    }

    /**
     * Method under test: {@link MovieDatabase#getDirector(String)}
     */
    @Test
    void testGetDirector() {
        assertThrows(NullPointerException.class,()->{ MovieDatabase.getDirector("42");});
    }

    /**
     * Method under test: {@link MovieDatabase#size()}
     */
    @Test
    void testSize() {
        assertEquals(3143, MovieDatabase.size());
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    void testFilterBy() {
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
    void testFilterBy2() {
        assertThrows(NullPointerException.class,()->{ MovieDatabase.filterBy(null);});
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    void testFilterBy3() {
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
    void testFilterBy4() {
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
    void testFilterBy5() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new DirectorsFilter("Directors"));
        assertTrue(MovieDatabase.filterBy(allFilters).isEmpty());
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    void testFilterBy6() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new GenreFilter("Genre"));
        assertTrue(MovieDatabase.filterBy(allFilters).isEmpty());
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    void testFilterBy7() {
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
    void testFilterBy8() {
        AllFilters allFilters = new AllFilters();
        allFilters.addFilter(new MinutesFilter(1));
        allFilters.addFilter(new DirectorsFilter("Directors"));
        assertTrue(MovieDatabase.filterBy(allFilters).isEmpty());
    }

    /**
     * Method under test: {@link MovieDatabase#filterBy(es.ull.etsii.Filters.Filter)}
     */
    @Test
    void testFilterBy9() {
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
    void testFilterBy10() {
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

}