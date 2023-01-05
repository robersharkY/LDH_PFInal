package es.ull.etsii.Ratings;

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
 * Unit test for MovieRunnerSimilarRatings class.
 */
public class MovieRunnerSimilarRatingsTest {

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printAverageRatings(int)}
     */
    @Test
    @Disabled
    void testPrintAverageRatings() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by printAverageRatings(int)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new MovieRunnerSimilarRatings()).printAverageRatings(1);
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printAverageRatingsByYearAfterAndGenre(int, int, String)}
     */
    @Test
    @Disabled
    void testPrintAverageRatingsByYearAfterAndGenre() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by printAverageRatingsByYearAfterAndGenre(int, int, String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new MovieRunnerSimilarRatings()).printAverageRatingsByYearAfterAndGenre(1, 1, "Genre");
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printAverageRatingsByYearAfterAndGenre(int, int, String)}
     */
    @Test
    @Disabled
    void testPrintAverageRatingsByYearAfterAndGenre2() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by printAverageRatingsByYearAfterAndGenre(int, int, String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        (new MovieRunnerSimilarRatings()).printAverageRatingsByYearAfterAndGenre(1, 1, "");
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printSimilarRatings()}
     */
    @Test
    @Disabled
    void testPrintSimilarRatings() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   There are no fields that could be asserted on.

        (new MovieRunnerSimilarRatings()).printSimilarRatings();
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printSimilarRatingsByGenre()}
     */
    @Test
    @Disabled
    void testPrintSimilarRatingsByGenre() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   There are no fields that could be asserted on.

        (new MovieRunnerSimilarRatings()).printSimilarRatingsByGenre();
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printSimilarRatingsByDirector()}
     */
    @Test
    @Disabled
    void testPrintSimilarRatingsByDirector() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   There are no fields that could be asserted on.

        (new MovieRunnerSimilarRatings()).printSimilarRatingsByDirector();
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printSimilarRatingsByGenreAndMinutes()}
     */
    @Test
    @Disabled
    void testPrintSimilarRatingsByGenreAndMinutes() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   There are no fields that could be asserted on.

        (new MovieRunnerSimilarRatings()).printSimilarRatingsByGenreAndMinutes();
    }

    /**
     * Method under test: {@link MovieRunnerSimilarRatings#printSimilarRatingsByYearAfterAndMinutes()}
     */
    @Test
    @Disabled
    void testPrintSimilarRatingsByYearAfterAndMinutes() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   There are no fields that could be asserted on.

        (new MovieRunnerSimilarRatings()).printSimilarRatingsByYearAfterAndMinutes();
    }

}