package es.ull.etsii.Rate;

import es.ull.etsii.Rate.Rater;
import es.ull.etsii.Ratings.Rating;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The class EfficientRater keeps track of one rater and all their ratings.
 *
 * @author Stanislav Rakitov
 * @version 1.0
 */
public class EfficientRater implements Rater {
  private final String myID;
  private final HashMap<String, Rating> myRatings;

  public EfficientRater(String id) {
    myID = id;
    myRatings = new HashMap<>();
  }

  @Override
  public void addRating(String movieID, double rating) {
    myRatings.put(movieID, new Rating(movieID, rating));
  }

  @Override
  public boolean hasRating(String movieID) {
    return myRatings.containsKey(movieID);
  }

  @Override
  public String getID() {
    return myID;
  }

  @Override
  public double getRating(String movieID) {
    Rating rating = myRatings.get(movieID);
    if (rating != null) {
      return rating.getValue();
    } else {
      return -1;
    }
  }

  @Override
  public int numRatings() {
    return myRatings.size();
  }

  @Override
  public ArrayList<String> getItemsRated() {
    return new ArrayList<>(myRatings.keySet());
  }

  @Override
  public HashMap<String, Rating> getMyRatings() {
    return myRatings;
  }
}
