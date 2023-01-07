package es.ull.etsii.Ratings;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Unit test for MovieRunnerSimilarRatings class.
 */
public class MovieRunnerSimilarRatingsTest {

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printAverageRatings(int)}
     */
    @Test
    void testPrintAverageRatings() {
        new MovieRunnerSimilarRatings().printAverageRatings(1);
        new MovieRunnerSimilarRatings().printAverageRatings(10);
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printAverageRatingsByYearAfterAndGenre(int, int, String)}
     */
    @Test
    void testPrintAverageRatingsByYearAfterAndGenre() {
        new MovieRunnerSimilarRatings().printAverageRatingsByYearAfterAndGenre(2, 2014, "Action, Thriller");
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printAverageRatingsByYearAfterAndGenre(int, int, String)}
     */
    @Test
    void testPrintAverageRatingsByYearAfterAndGenre2() {

        (new MovieRunnerSimilarRatings()).printAverageRatingsByYearAfterAndGenre(1, 2010, "Comedy, Romance");
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printSimilarRatings()}
     */
    @Test
    @Disabled
    void testPrintSimilarRatings() {
        new MovieRunnerSimilarRatings().printSimilarRatings();
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printSimilarRatingsByGenre()}
     */
    @Test
    @Disabled
    void testPrintSimilarRatingsByGenre() {
        new MovieRunnerSimilarRatings().printSimilarRatingsByGenre();
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printSimilarRatingsByDirector()}
     */
    @Test
    @Disabled
    void testPrintSimilarRatingsByDirector() {

        new MovieRunnerSimilarRatings().printSimilarRatingsByDirector();
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printSimilarRatingsByGenreAndMinutes()}
     */
    @Test
    @Disabled
    void testPrintSimilarRatingsByGenreAndMinutes() {
        new MovieRunnerSimilarRatings().printSimilarRatingsByGenreAndMinutes();
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printSimilarRatingsByYearAfterAndMinutes()}
     */
    @Test
    @Disabled
    void testPrintSimilarRatingsByYearAfterAndMinutes() {
        new MovieRunnerSimilarRatings().printSimilarRatingsByYearAfterAndMinutes();
    }

}