package es.ull.etsii.Ratings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for FirstRatings class.
 */
 public class FirstRatingsTest {

    /**
     * Method under test: {@link FirstRatings#FirstRatings()}
     */
    @Test
    void testConstructor() {
        FirstRatings ratings = new FirstRatings(); // no hace nada
        ratings.loadMovies("ratedmoviesfull.csv");
        assertThrows(NullPointerException.class,()->{ (new FirstRatings()).testLoadMovies();});
    }

    /**
     * Method under test: {@link FirstRatings#FirstRatings(String)}
     */
    @Test
    void testConstructor2() {
        FirstRatings ratings = new FirstRatings("ratedmoviesfull.csv");
        assertThrows(NullPointerException.class,()->{ (new FirstRatings()).testLoadMovies();});
    }

    /**
     * Method under test: {@link FirstRatings#FirstRatings(String, String)}
     */
    @Test
    void testConstructor3() {
        new FirstRatings("ratedmoviesfull.csv", "ratings.csv");
        assertThrows(NullPointerException.class,()->{ (new FirstRatings()).testLoadMovies();});

    }

    /**
     * Method under test: {@link FirstRatings#loadRaters(String)}
     */
    @Test
    void testLoadRaters() {
        (new FirstRatings()).loadRaters("ratings.csv");
        assertThrows(NullPointerException.class,()->{ (new FirstRatings()).testLoadMovies();});
    }

    /**
     * Method under test: {@link FirstRatings#loadMovies(String)}
     */
    @Test
    void testLoadMovies() {
        (new FirstRatings()).loadMovies("ratedmoviesfull.csv");
        assertThrows(NullPointerException.class,()->{ (new FirstRatings()).testLoadMovies();});
    }

    /**
     * Method under test: {@link FirstRatings#loadMovies(String)}
     */
    @Test
    void testLoadMovies2() {
        assertTrue((new FirstRatings()).loadMovies("").isEmpty());
    }

    /**
     * Method under test: {@link FirstRatings#testLoadMovies()}
     */
    @Test
    void testTestLoadMovies() {
        assertThrows(NullPointerException.class,()->{ (new FirstRatings()).testLoadMovies();});
    }

    /**
     * Method under test: {@link FirstRatings#testLoadRaters(String, String)}
     */
    @Test
    void testTestLoadRaters() {
        assertThrows(NullPointerException.class,()->{ (new FirstRatings()).testLoadRaters("Rater ID", "Movie ID");});
    }

}