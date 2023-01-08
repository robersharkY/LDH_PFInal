package es.ull.etsii.Rate;

import es.ull.etsii.Ratings.Rating;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for EfficientRater class.
 */
 public class EfficientRaterTest {

    /**
     * Method under test: default or parameterless constructor of {@link EfficientRater}
     */
    @Test
    void testConstructor() {
        EfficientRater rater = new EfficientRater("1");
        assertEquals("1", rater.getID());
    }

    /**
     * Method under test: {@link EfficientRater#addRating(String, double)}
     */
    @Test
    void testAddRating() {
        EfficientRater efficientRater = new EfficientRater("1");
        efficientRater.addRating("0068646", 10);
        HashMap<String, Rating> myRatings = efficientRater.getMyRatings();
        assertEquals(1, myRatings.size());
        Rating getResult = myRatings.get("0068646");
        assertEquals("0068646", getResult.getItem());
        assertEquals(10, getResult.getValue());
    }

    /**
     * Method under test: {@link EfficientRater#hasRating(String)}
     */
    @Test
    void testHasRating() {
        EfficientRater efficientRater = new EfficientRater("1");
        efficientRater.addRating("0068646", 10);
        assertEquals(true,efficientRater.hasRating("0068646"));
        assertNotEquals(true,efficientRater.hasRating("otro numero"));
    }

    /**
     * Method under test: {@link EfficientRater#getRating(String)}
     */
    @Test
    void testGetRating() {
        EfficientRater efficientRater = new EfficientRater("1");
        efficientRater.addRating("0068646", 10);
        assertEquals(10,efficientRater.getRating("0068646"));
        assertNotEquals(10,efficientRater.getRating("otro numero"));
        assertEquals(-1,efficientRater.getRating("otro numero"));
    }


    /**
     * Method under test: {@link EfficientRater#numRatings()}
     */
    @Test
    void testNumRatings() {
        EfficientRater efficientRater = new EfficientRater("1");
        efficientRater.addRating("0068646", 10);
        assertEquals(1,efficientRater.numRatings());
        assertNotEquals(0,efficientRater.numRatings());
        efficientRater.addRating("0068641", 3);
        assertEquals(2,efficientRater.numRatings());
        assertNotEquals(1,efficientRater.numRatings());
    }

    /**
     * Method under test: {@link EfficientRater#getItemsRated()}
     */
    @Test
    void testGetItemsRated() {
        assertTrue((new EfficientRater("42")).getItemsRated().isEmpty());
    }

}