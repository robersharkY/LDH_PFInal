package es.ull.etsii;

import es.ull.etsii.Rate.EfficientRater;
import es.ull.etsii.Rate.Rater;
import es.ull.etsii.Ratings.FourthRatings;
import es.ull.etsii.Ratings.MovieRunnerSimilarRatings;
import es.ull.etsii.Ratings.PersonalRatingOption;
import es.ull.etsii.Recommendations.RecommendationRunner;

import java.util.ArrayList;

/** @author Stanislav Rakitov */
public class Main {
    public static void main(String[] args) {
        FourthRatings fourthRatings = new FourthRatings();
        Rater meRater = new EfficientRater("15");
        Rater otherRater = new EfficientRater("20");

        meRater.addRating("2354", 10.0);
        meRater.addRating("3285", 6.0);
        meRater.addRating("1297", 2.0);
        meRater.addRating("5804", 8.0);

        otherRater.addRating("3285", 4.0);
        otherRater.addRating("1297", 7.0);
        otherRater.addRating("6574", 10.0);
        otherRater.addRating("2354", 9.0);

        System.out.print(
                "Consider the method dotProduct in the FourthRatings class. What should the call "
                        + "dotProduct(“15”, “20”)  return? ");
        System.out.println(fourthRatings.dotProduct(meRater, otherRater));
        MovieRunnerSimilarRatings quiz = new MovieRunnerSimilarRatings();
        quiz.printSimilarRatings();
        System.out.println("---");
        quiz.printSimilarRatingsByGenre();
        System.out.println("---");
        quiz.printSimilarRatings();
        System.out.println("---");
        quiz.printSimilarRatingsByDirector();
        System.out.println("---");
        quiz.printSimilarRatingsByGenreAndMinutes();
        System.out.println("---");
        quiz.printSimilarRatingsByYearAfterAndMinutes();
        
        /*
        RecommendationRunner recomendation = new RecommendationRunner();
        ArrayList<String> lista = recomendation.getItemsToRate();
        System.out.println(lista.toString());
        recomendation.printRecommendationsFor("32");
        */

    }
}