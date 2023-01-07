package es.ull.etsii.Recommendations;

import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class RecommendationRunnerTest {

    /**
     * Method under test: {@link RecommendationRunner#getItemsToRate()}
     */
    @Test
    void testGetItemsToRate() {
        ArrayList<String> actualItemsToRate = (new RecommendationRunner()).getItemsToRate();
        assertEquals(25, actualItemsToRate.size());
        assertEquals("0055601", actualItemsToRate.get(0));
        assertEquals("1714915", actualItemsToRate.get(1));
        assertEquals("2277150", actualItemsToRate.get(2));
        assertEquals("4437212", actualItemsToRate.get(3));
        assertEquals("2820852", actualItemsToRate.get(4));
        assertEquals("1255953", actualItemsToRate.get(5));
        assertEquals("2131532", actualItemsToRate.get(19));
        assertEquals("1243974", actualItemsToRate.get(20));
        assertEquals("3787590", actualItemsToRate.get(21));
        assertEquals("0055614", actualItemsToRate.get(22));
        assertEquals("3477480", actualItemsToRate.get(23));
        assertEquals("1193138", actualItemsToRate.get(24));
    }

    /**
     * Method under test: {@link RecommendationRunner#printRecommendationsFor(String)}
     */
    @Test
    @Disabled
    void testPrintRecommendationsFor() {
        new RecommendationRunner().printRecommendationsFor("0068646");
    }


}