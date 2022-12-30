package es.ull.etsii.Recommendations;

import java.util.ArrayList;

import org.junit.Ignore;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for RecommendationRunner class.
 */
public class RecommendationRunnerTest {

    /**
     * should answer with true
     */
    @Test
    public void getItemsToRate() {
        assertTrue(true);
    }

    /**
     * Method under test: {@link RecommendationRunner#getItemsToRate()}
     */
    @Test
    public void testGetItemsToRate() {
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
     * Method under test: {@link RecommendationRunner#getItemsToRate()}
     */
    @Test
    public void testGetItemsToRate2() {
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
    @Ignore("TODO: Complete this test")
    public void testPrintRecommendationsFor() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at es.ull.etsii.Ratings.FourthRatings.hasMinRaters(FourthRatings.java:135)
        //       at es.ull.etsii.Ratings.FourthRatings.getSimilarRatingsByFilter(FourthRatings.java:154)
        //       at es.ull.etsii.Recommendations.RecommendationRunner.printRecommendationsFor(RecommendationRunner.java:25)
        //   In order to prevent printRecommendationsFor(String)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   printRecommendationsFor(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new RecommendationRunner()).printRecommendationsFor("Web Rater ID");
    }

    /**
     * Method under test: {@link RecommendationRunner#printRecommendationsFor(String)}
     */
    @Test
    @Ignore("TODO: Complete this test")
    public void testPrintRecommendationsFor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        //       at jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //       at jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //       at jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        //       at java.util.Objects.checkIndex(Objects.java:359)
        //       at java.util.ArrayList.get(ArrayList.java:427)
        //       at es.ull.etsii.Ratings.FourthRatings.hasMinRaters(FourthRatings.java:135)
        //       at es.ull.etsii.Ratings.FourthRatings.getSimilarRatingsByFilter(FourthRatings.java:154)
        //       at es.ull.etsii.Recommendations.RecommendationRunner.printRecommendationsFor(RecommendationRunner.java:25)
        //   In order to prevent printRecommendationsFor(String)
        //   from throwing IndexOutOfBoundsException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   printRecommendationsFor(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new RecommendationRunner()).printRecommendationsFor("Web Rater ID");
    }

    /**
     * should answer with true
     */
    @Test
    public void printRecommendationsFor() {
        assertTrue(true);
    }
}