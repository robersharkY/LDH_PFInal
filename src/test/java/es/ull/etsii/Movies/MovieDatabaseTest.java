package es.ull.etsii.Movies;

import es.ull.etsii.Filters.*;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
        MovieDatabase database = new MovieDatabase();
        MovieDatabase.initialize();
        database.loadMovies("src/main/resources/ratedmoviesfull.csv");
        assertFalse(database.containsID("0000"));

    }

    /**
     * Method under test: {@link MovieDatabase#loadMovies(String)}
     */
    @Test
    void testLoadMovies() {
        MovieDatabase database = new MovieDatabase();
        database.loadMovies("ratedmoviesfull.csv");
        assertFalse(database.containsID("0000"));
    }

    /**
     * Method under test: {@link MovieDatabase#loadMovies(String)}
     */
    @Test
    void testLoadMovies2() {
        MovieDatabase database = new MovieDatabase();
        database.loadMovies("");
        assertFalse(database.containsID("0000"));
    }

    /**
     * Method under test: {@link MovieDatabase#loadMovies(String)}
     */
    @Test
    void testLoadMovies3() {
        MovieDatabase database = new MovieDatabase();
        database.initialize();
        database.loadMovies("src/main/resources/ratedmoviesfull.csv");
        assertEquals(2014, database.getYear("3112654"));
    }

    /**
     * Method under test: {@link MovieDatabase#containsID(String)}
     */
    @Test
    void testContainsID() {
        MovieDatabase database = new MovieDatabase();
        database.loadMovies("src/main/resources/ratedmoviesfull.csv");
        assertEquals(true, database.containsID("3112654"));
        assertEquals(false, database.containsID("5"));
    }

    /**
     * Method under test: {@link MovieDatabase#getYear(String)}
     */
    @Test
    void testGetYear() {
        MovieDatabase database = new MovieDatabase();
        database.loadMovies("src/main/resources/ratedmoviesfull.csv");
        assertEquals(2014, database.getYear("3112654"));
    }

    /**
     * Method under test: {@link MovieDatabase#getGenres(String)}
     */
    @Test
    void testGetGenres() {
        MovieDatabase database = new MovieDatabase();
        database.loadMovies("src/main/resources/ratedmoviesfull.csv");
        assertEquals("Action, Thriller", database.getGenres("3112654"));
    }

    /**
     * Method under test: {@link MovieDatabase#getTitle(String)}
     */
    @Test
    void testGetTitle() {
        MovieDatabase database = new MovieDatabase();
        database.loadMovies("src/main/resources/ratedmoviesfull.csv");
        assertEquals("Mea culpa", database.getTitle("3112654"));
    }

    /**
     * Method under test: {@link MovieDatabase#getMovie(String)}
     */
    @Test
    void testGetMovie() {
        MovieDatabase database = new MovieDatabase();
        database.loadMovies("src/main/resources/ratedmoviesfull.csv");
        assertNotEquals(null, database.getMovie("3112654"));
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
        MovieDatabase database = new MovieDatabase();
        database.loadMovies("src/main/resources/ratedmoviesfull.csv");
        assertEquals(90, database.getMinutes("3112654"));
    }

    /**
     * Method under test: {@link MovieDatabase#getCountry(String)}
     */
    @Test
    void testGetCountry() {
        MovieDatabase database = new MovieDatabase();
        database.loadMovies("src/main/resources/ratedmoviesfull.csv");
        assertEquals("France", database.getCountry("3112654"));
    }

    /**
     * Method under test: {@link MovieDatabase#getDirector(String)}
     */
    @Test
    void testGetDirector() {
        MovieDatabase database = new MovieDatabase();
        database.loadMovies("src/main/resources/ratedmoviesfull.csv");
        assertEquals("David Cronenberg", database.getDirector("1571222"));
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
        allFilters.addFilter(new YearFilter(1));
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
        allFilters.addFilter(new YearFilter(1));
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