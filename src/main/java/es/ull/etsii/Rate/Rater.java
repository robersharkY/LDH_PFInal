package es.ull.etsii.Rate;

import es.ull.etsii.Ratings.Rating;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Interfaz 'Rater'
 */
public interface Rater {
  /**
   * Método que añade la valoración de una película
   *
   * @param movieID Identificador de una película
   * @param rating Valoración de la película
   */
  void addRating(String movieID, double rating);

  /**
   * Método que compueba si una película tiene valoración
   *
   * @param movieID Identificador de la película
   * @return True si la película tiene valoración, false si no se ha encontrado
   * la valoración
   */
  boolean hasRating(String movieID);

  /**
   * @return myID Identificador del valorador
   */
  String getID();

  /**
   * Método que devuelve la valoración de una película a través de su
   * identificador
   *
   * @param movieID Identificador de la película
   * @return Valoración númerica de la película
   */
  double getRating(String movieID);

  /**
   * @return Integer Número de valoraciones que tiene un valorador
   */
  int numRatings();

  /**
   * @return Lista de películas que han sido valoradas
   */
  ArrayList<String> getItemsRated();

  /**
   *
   * @return Lista de películas con su título y valoración
   */
  HashMap<String, Rating> getMyRatings();
}