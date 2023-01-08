package es.ull.etsii.Ratings;

import es.ull.etsii.Filters.AllFilters;
import es.ull.etsii.Filters.DirectorsFilter;
import es.ull.etsii.Rate.EfficientRater;
import es.ull.etsii.Rate.Rater;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for FirstRatings class.
 */
 public class FourthRatingsTest {

    /**
     * Method under test: {@link FourthRatings#getAverageRatings(int)}
     */
    @Test
    void testGetAverageRatings() {
        ArrayList<Rating> actualAverageRatings = new FourthRatings().getAverageRatings(1);
        assertEquals(3143, actualAverageRatings.size());
        Rating getResult = actualAverageRatings.get(5);
        assertEquals(8.0d, getResult.getValue());
        Rating getResult1 = actualAverageRatings.get(3137);
        assertEquals(8.0d, getResult1.getValue());
        assertEquals("0060176", getResult1.getItem());
        assertEquals("1255953", getResult.getItem());
    }

    /**
     * Method under test: {@link FourthRatings#getAverageRatings(int)}
     */
    @Test
    void testGetAverageRatings2() {
        ArrayList<Rating> actualAverageRatings = new FourthRatings().getAverageRatings(0);
        assertEquals(3143, actualAverageRatings.size());
        Rating getResult = actualAverageRatings.get(5);
        assertEquals(8.0d, getResult.getValue());
        Rating getResult1 = actualAverageRatings.get(3137);
        assertEquals(8.0d, getResult1.getValue());
        assertEquals("0060176", getResult1.getItem());
        assertEquals("1255953", getResult.getItem());
        Rating getResult2 = actualAverageRatings.get(2);
        assertEquals("2277150", getResult2.getItem());
        Rating getResult3 = actualAverageRatings.get(3141);
        assertEquals("1621039", getResult3.getItem());
        Rating getResult4 = actualAverageRatings.get(3140);
        assertEquals("0043618", getResult4.getItem());
        Rating getResult5 = actualAverageRatings.get(4);
        assertEquals("2820852", getResult5.getItem());
        Rating getResult6 = actualAverageRatings.get(3139);
        assertEquals("3007512", getResult6.getItem());
        Rating getResult7 = actualAverageRatings.get(3138);
        assertEquals("1270262", getResult7.getItem());
        Rating getResult8 = actualAverageRatings.get(3);
        assertEquals("4437212", getResult8.getItem());
        Rating getResult9 = actualAverageRatings.get(1);
        assertEquals("1714915", getResult9.getItem());
        Rating getResult10 = actualAverageRatings.get(3142);
        assertEquals("2713180", getResult10.getItem());
        Rating getResult11 = actualAverageRatings.get(0);
        assertEquals("0055601", getResult11.getItem());
        assertEquals(6.333333333333333d, getResult7.getValue());
        assertEquals(10.0d, getResult8.getValue());
        assertEquals(7.857142857142857d, getResult10.getValue());
        assertEquals(7.0d, getResult11.getValue());
        assertEquals(7.0d, getResult3.getValue());
        assertEquals(9.0d, getResult4.getValue());
        assertEquals(7.875d, getResult6.getValue());
        assertEquals(8.0d, getResult9.getValue());
        assertEquals(7.0d, getResult2.getValue());
        assertEquals(7.48d, getResult5.getValue());
    }

    /**
     * Method under test: {@link FourthRatings#getAverageRatingsByFilter(Integer, es.ull.etsii.Filters.Filter)}
     */
    @Test
    void testGetAverageRatingsByFilter() {
        FourthRatings fourthRatings = new FourthRatings();
        ArrayList<Rating> actualAverageRatingsByFilter = fourthRatings.getAverageRatingsByFilter(1, new DirectorsFilter("Fred Cavayé"));
        assertEquals(1, actualAverageRatingsByFilter.size());
        Rating getResult = actualAverageRatingsByFilter.get(0);
        assertEquals(3.0d, getResult.getValue());
        assertEquals("3112654", getResult.getItem());
    }

    /**
     * Method under test: {@link FourthRatings#dotProduct(es.ull.etsii.Rate.Rater, es.ull.etsii.Rate.Rater)}
     */
    @Test
    void testDotProduct3() {
        FourthRatings fourthRatings = new FourthRatings();
        EfficientRater efficientRater = new EfficientRater("42");
        efficientRater.addRating("Movie ID", 10.0d);
        assertEquals(0.0d, fourthRatings.dotProduct(efficientRater, new EfficientRater("42")));
    }

    /**
     * Method under test: {@link FourthRatings#dotProduct(Rater, Rater)}
     */
    @Test
    void testDotProduct4() {
        FourthRatings fourthRatings = new FourthRatings();
        EfficientRater efficientRater = new EfficientRater("42");
        efficientRater.addRating("Movie ID", 9);
        assertThrows(NullPointerException.class,()->{ fourthRatings.dotProduct(efficientRater, null);});
    }

    /**
     * Method under test: {@link FourthRatings#dotProduct(es.ull.etsii.Rate.Rater, es.ull.etsii.Rate.Rater)}
     */
    @Test
    void testDotProduct5() {
        FourthRatings fourthRatings = new FourthRatings();

        EfficientRater efficientRater = new EfficientRater("42");
        efficientRater.addRating("Movie ID", 10.0d);

        EfficientRater efficientRater1 = new EfficientRater("42");
        efficientRater1.addRating("Movie ID", 5.0d);
        assertEquals(0.0d, fourthRatings.dotProduct(efficientRater, efficientRater1));
    }

    /**
     * Method under test: {@link FourthRatings#getSimilarRatings(String, Integer, Integer)}
     */
    @Test
    void testGetSimilarRatings() {
        ArrayList<Rating> actualSimilarRatings = (new FourthRatings()).getSimilarRatings("42", 10, 1);
        assertEquals(444, actualSimilarRatings.size());
        Rating getResult = actualSimilarRatings.get(5);
        assertEquals(454.5d, getResult.getValue());
        Rating getResult1 = actualSimilarRatings.get(438);
        assertEquals(45.0d, getResult1.getValue());
        assertEquals("1099212", getResult1.getItem());
        assertEquals("0266697", getResult.getItem());
        Rating getResult2 = actualSimilarRatings.get(2);
        assertEquals("0167260", getResult2.getItem());
        Rating getResult3 = actualSimilarRatings.get(442);
        assertEquals("1213644", getResult3.getItem());
        Rating getResult4 = actualSimilarRatings.get(441);
        assertEquals("2071491", getResult4.getItem());
        Rating getResult5 = actualSimilarRatings.get(4);
        assertEquals("0111161", getResult5.getItem());
        Rating getResult6 = actualSimilarRatings.get(440);
        assertEquals("2203939", getResult6.getItem());
        Rating getResult7 = actualSimilarRatings.get(439);
        assertEquals("1673434", getResult7.getItem());
        Rating getResult8 = actualSimilarRatings.get(3);
        assertEquals("0120737", getResult8.getItem());
        Rating getResult9 = actualSimilarRatings.get(1);
        assertEquals("0167261", getResult9.getItem());
        Rating getResult10 = actualSimilarRatings.get(443);
        assertEquals("2310332", getResult10.getItem());
        Rating getResult11 = actualSimilarRatings.get(0);
        assertEquals("0133093", getResult11.getItem());
        assertEquals(45.0d, getResult7.getValue());
        assertEquals(505.0d, getResult8.getValue());
        assertEquals(25.0d, getResult10.getValue());
        assertEquals(560.0d, getResult11.getValue());
        assertEquals(42.0d, getResult3.getValue());
        assertEquals(42.0d, getResult4.getValue());
        assertEquals(45.0d, getResult6.getValue());
        assertEquals(505.0d, getResult9.getValue());
        assertEquals(505.0d, getResult2.getValue());
        assertEquals(476.6666666666667d, getResult5.getValue());
    }

    /**
     * Method under test: {@link FourthRatings#getSimilarRatingsByFilter(String, Integer, Integer, es.ull.etsii.Filters.Filter)}
     */
    @Test
    void testGetSimilarRatingsByFilter() {
        FourthRatings fourthRatings = new FourthRatings();
        ArrayList<Rating> actualSimilarRatingsByFilter = fourthRatings.getSimilarRatingsByFilter("42", 10, 1,
                new AllFilters());
        assertEquals(444, actualSimilarRatingsByFilter.size());
        Rating getResult = actualSimilarRatingsByFilter.get(5);
        assertEquals(454.5d, getResult.getValue());
        Rating getResult1 = actualSimilarRatingsByFilter.get(438);
        assertEquals(45.0d, getResult1.getValue());
        assertEquals("1099212", getResult1.getItem());
        assertEquals("0266697", getResult.getItem());
        Rating getResult2 = actualSimilarRatingsByFilter.get(2);
        assertEquals("0167260", getResult2.getItem());
        Rating getResult3 = actualSimilarRatingsByFilter.get(442);
        assertEquals("1213644", getResult3.getItem());
        Rating getResult4 = actualSimilarRatingsByFilter.get(441);
        assertEquals("2071491", getResult4.getItem());
        Rating getResult5 = actualSimilarRatingsByFilter.get(4);
        assertEquals("0111161", getResult5.getItem());
        Rating getResult6 = actualSimilarRatingsByFilter.get(440);
        assertEquals("2203939", getResult6.getItem());
        Rating getResult7 = actualSimilarRatingsByFilter.get(439);
        assertEquals("1673434", getResult7.getItem());
        Rating getResult8 = actualSimilarRatingsByFilter.get(3);
        assertEquals("0120737", getResult8.getItem());
        Rating getResult9 = actualSimilarRatingsByFilter.get(1);
        assertEquals("0167261", getResult9.getItem());
        Rating getResult10 = actualSimilarRatingsByFilter.get(443);
        assertEquals("2310332", getResult10.getItem());
        Rating getResult11 = actualSimilarRatingsByFilter.get(0);
        assertEquals("0133093", getResult11.getItem());
        assertEquals(45.0d, getResult7.getValue());
        assertEquals(505.0d, getResult8.getValue());
        assertEquals(25.0d, getResult10.getValue());
        assertEquals(560.0d, getResult11.getValue());
        assertEquals(42.0d, getResult3.getValue());
        assertEquals(42.0d, getResult4.getValue());
        assertEquals(45.0d, getResult6.getValue());
        assertEquals(505.0d, getResult9.getValue());
        assertEquals(505.0d, getResult2.getValue());
        assertEquals(476.6666666666667d, getResult5.getValue());
    }

    /**
     * Method under test: {@link FourthRatings#getSimilarRatingsByFilter(String, Integer, Integer, es.ull.etsii.Filters.Filter)}
     */
    @Test
    void testGetSimilarRatingsByFilter2() {
        FourthRatings fourthRatings = new FourthRatings();
        assertThrows(NullPointerException.class,()->{ fourthRatings.getSimilarRatingsByFilter("foo", 1, 1, new AllFilters());});
    }

}