package es.ull.etsii.Movies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Unit test for Movie class.
 */
 public class MovieTest {

    /**
     * Method under test: {@link Movie#Movie(String, String, String, String)}
     */
    @Test
     void testConstructor() {
        assertThrows(NumberFormatException.class,()->{new Movie("An ID", "Dr", "42.2", "The Genres");} );
    }

    /**
     * Method under test: {@link Movie#Movie(String, String, String, String)}
     */
    @Test
     void testConstructor2() {
        Movie actualMovie = new Movie("An ID", "Dr", "42", "The Genres");

        assertEquals(42, actualMovie.getYear());
        assertEquals("Dr", actualMovie.getTitle());
        assertEquals("An ID", actualMovie.getID());
        assertEquals("The Genres", actualMovie.getGenres());
    }

    /**
     * Method under test: {@link Movie#Movie(String, String, String, String, String, String, String, int)}
     */
    @Test
     void testConstructor3() {
        assertThrows(NumberFormatException.class,()->{new Movie("An ID", "Dr", "A Year", "The Genres", "A Director", "GB", "A Poster", 1);} );
    }

    /**
     * Method under test: {@link Movie#Movie(String, String, String, String, String, String, String, int)}
     */
    @Test
     void testConstructor4() {
        Movie actualMovie = new Movie("An ID", "Dr", "42", "The Genres", "A Director", "GB", "A Poster", 1);

        assertEquals("GB", actualMovie.getCountry());
        assertEquals(42, actualMovie.getYear());
        assertEquals("Dr", actualMovie.getTitle());
        assertEquals("A Poster", actualMovie.getPoster());
        assertEquals(1, actualMovie.getMinutes());
        assertEquals("An ID", actualMovie.getID());
        assertEquals("The Genres", actualMovie.getGenres());
        assertEquals("A Director", actualMovie.getDirector());
    }

    /**
     * should answer with true
     */
    @Test
     void getID() {
        Movie actualMovie = new Movie("An ID", "Dr", "42", "The Genres", "A Director", "GB", "A Poster", 1);
        assertEquals(actualMovie.getID(),"An ID");
        assertNotEquals(actualMovie.getID(),"other ID");
    }

    /**
     * should answer with true
     */
    @Test
     void getTitle() {
        Movie actualMovie = new Movie("An ID", "Dr", "42", "The Genres", "A Director", "GB", "A Poster", 1);
        assertEquals(actualMovie.getTitle(),"Dr");
        assertNotEquals(actualMovie.getTitle(),"another Dr");
    }

    /**
     * should answer with true
     */
    @Test
     void getYear() {
        Movie actualMovie = new Movie("An ID", "Dr", "42", "The Genres", "A Director", "GB", "A Poster", 1);
        assertEquals(actualMovie.getYear(),42);
        assertNotEquals(actualMovie.getYear(),45);
    }

    /**
     * should answer with true
     */
    @Test
     void getGenres() {
        Movie actualMovie = new Movie("An ID", "Dr", "42", "The Genres", "A Director", "GB", "A Poster", 1);
        assertEquals(actualMovie.getGenres(),"The Genres");
        assertNotEquals(actualMovie.getGenres(),"Another genres");
    }

    /**
     * should answer with true
     */
    @Test
     void getCountry() {
        Movie actualMovie = new Movie("An ID", "Dr", "42", "The Genres", "A Director", "GB", "A Poster", 1);
        assertEquals(actualMovie.getCountry(),"GB");
        assertNotEquals(actualMovie.getCountry(),"another country");
    }

    /**
     * should answer with true
     */
    @Test
     void getDirector() {
        Movie actualMovie = new Movie("An ID", "Dr", "42", "The Genres", "A Director", "GB", "A Poster", 1);
        assertEquals(actualMovie.getDirector(),"A Director");
        assertNotEquals(actualMovie.getDirector(),"another director");
    }

    /**
     * should answer with true
     */
    @Test
     void getPoster() {
        Movie actualMovie = new Movie("An ID", "Dr", "42", "The Genres", "A Director", "GB", "A Poster", 1);
        assertEquals(actualMovie.getPoster(),"A Poster");
        assertNotEquals(actualMovie.getPoster(),"another poster");
    }

    /**
     * should answer with true
     */
    @Test
     void getMinutes() {
        Movie actualMovie = new Movie("An ID", "Dr", "42", "The Genres", "A Director", "GB", "A Poster", 1);
        assertEquals(actualMovie.getMinutes(),1);
        assertNotEquals(actualMovie.getMinutes(),3);
    }

    /**
     * should answer with true
     */
    @Test
    void testToString() {
        Movie actualMovie = new Movie("An ID", "Dr", "42", "The Genres", "A Director", "GB", "A Poster", 1);
        String frase ="Movie [id=An ID, title=Dr, year=42, genres= The Genres]";
        assertEquals(actualMovie.toString(),frase);
        assertNotEquals(actualMovie.getMinutes(),"");
    }
}