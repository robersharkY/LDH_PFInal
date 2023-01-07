package es.ull.etsii.Rate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class RaterDatabaseTest {


    /**
     * Method under test: {@link RaterDatabase#addRatings(String)}
     */
    @Test
    void testAddRatings() {
        RaterDatabase database = new RaterDatabase();
        database.addRatings("ratings.csv");
        assertNotEquals(null,database.getRaters());
    }

    /**
     * Method under test: {@link RaterDatabase#addRaterRating(String, String, double)}
     */
    @Test
    void testAddRaterRating() {
        RaterDatabase database = new RaterDatabase();
        database.addRaterRating("0001", "0101010", 9);
        assertEquals(1051,database.size());
        database.addRaterRating("0001", "0202020", 7);
        assertEquals(1051,database.size());
        database.addRaterRating("0002", "0101015", 10);
        assertEquals(1052,database.size());
    }


    /**
     * Method under test: {@link RaterDatabase#getRater(String)}
     */
    @Test
    void testGetRater() {
        RaterDatabase database = new RaterDatabase();
        database.addRaterRating("0001", "0101010", 9);
        assertEquals(1049,database.size());
        assertEquals("0001",database.getRater("0001").getID());
    }

    /**
     * Method under test: {@link RaterDatabase#getRaters()}
     */
    @Test
    void testGetRaters() {
        RaterDatabase database = new RaterDatabase();
        database.addRaterRating("0001", "0101010", 9);
        assertEquals(1052,database.size());
        database.addRaterRating("0002", "3131010", 5);
        assertEquals(1052, RaterDatabase.getRaters().size());
    }

    /**
     * Method under test: {@link RaterDatabase#size()}
     */
    @Test
    void testSize() {
        RaterDatabase database = new RaterDatabase();
        database.addRaterRating("00001", "1023121", 9);
        assertEquals(1050, database.size());
        database.addRaterRating("00002", "1123121", 2);
        assertEquals(1051, database.size());
    }

}