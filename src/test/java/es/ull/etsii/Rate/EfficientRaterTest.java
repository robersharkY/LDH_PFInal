package es.ull.etsii.Rate;

import es.ull.etsii.Ratings.Rating;

import java.util.HashMap;

import org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
        assertEquals("42", (new EfficientRater("42")).getID());
    }

    /**
     * Method under test: {@link EfficientRater#addRating(String, double)}
     */
    @Test
    void testAddRating() {
        EfficientRater efficientRater = new EfficientRater("42");
        efficientRater.addRating("Movie ID", 10.0d);
        HashMap<String, Rating> myRatings = efficientRater.getMyRatings();
        assertEquals(1, myRatings.size());
        Rating getResult = myRatings.get("Movie ID");
        assertEquals("Movie ID", getResult.getItem());
        assertEquals(10.0d, getResult.getValue());
    }

    /**
     * Method under test: {@link EfficientRater#hasRating(String)}
     */
    @Test
    void testHasRating() {
        assertFalse((new EfficientRater("42")).hasRating("Movie ID"));
    }

    /**
     * Method under test: {@link EfficientRater#hasRating(String)}
     */
    @Test
    void testHasRating2() {
        EfficientRater efficientRater = new EfficientRater("42");
        efficientRater.addRating("Movie ID", 10.0d);
        assertTrue(efficientRater.hasRating("Movie ID"));
    }

    /**
     * Method under test: {@link EfficientRater#getRating(String)}
     */
    @Test
    void testGetRating() {
        assertEquals(-1.0d, (new EfficientRater("42")).getRating("Movie ID"));
    }

    /**
     * Method under test: {@link EfficientRater#getRating(String)}
     */
    @Test
    void testGetRating2() {
        EfficientRater efficientRater = new EfficientRater("42");
        efficientRater.addRating("Movie ID", -1.0d);
        assertEquals(-1.0d, efficientRater.getRating("Movie ID"));
    }

    /**
     * Method under test: {@link EfficientRater#numRatings()}
     */
    @Test
    void testNumRatings() {
        assertEquals(0, (new EfficientRater("42")).numRatings());
    }

    /**
     * Method under test: {@link EfficientRater#getItemsRated()}
     */
    @Test
    void testGetItemsRated() {
        assertTrue((new EfficientRater("42")).getItemsRated().isEmpty());
    }

}