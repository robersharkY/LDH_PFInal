package es.ull.etsii.Ratings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Unit test for Rating class.
 */
 class RatingTest {


    @Test
     void testgetItem() {
        Rating actualRating = new Rating("Item", 10.0d);
        assertEquals("Item", actualRating.getItem());
        assertNotEquals("An Item", actualRating.getItem());
    }


    @Test
    void testgetValue() {
        Rating actualRating = new Rating("Item", 5);
        assertEquals(5, actualRating.getValue());
        assertEquals("Item", actualRating.getItem());
        assertNotEquals("An item", actualRating.getItem());
    }


    @Test
    void testToString() {
        String cadena = "[Item, 5.0]";
        Rating actualRating = new Rating("Item", 5);
        assertEquals(actualRating.toString(), cadena);
        assertNotEquals(actualRating.toString(),"");

    }


    @Test
     void testcompareTo() {
        Rating rating = new Rating("An Item", 10.0d);
        assertEquals(0, rating.compareTo(new Rating("An Item", 10.0d)));
        assertEquals(1, rating.compareTo(new Rating("An Item", 5)));
    }

    /**
     * Method under test: default or parameterless constructor of {@link Rating}
     */
    @Test
    void testConstructor() {
        Rating actualRating = new Rating("An Item", 10.0d);
        assertEquals("An Item", actualRating.getItem());
        assertEquals(10.0d, actualRating.getValue());
    }

    /**
     * Method under test: {@link Rating#compareTo(Rating)}
     */
    @Test
    void testCompareTo() {
        Rating rating = new Rating("An Item", 10.0d);
        assertEquals(0, rating.compareTo(new Rating("An Item", 10.0d)));
    }

    /**
     * Method under test: {@link Rating#compareTo(Rating)}
     */
    @Test
    void testCompareTo2() {
        assertThrows(NullPointerException.class,()->{ new Rating("An Item", 10.0d).compareTo(null);});
    }
}