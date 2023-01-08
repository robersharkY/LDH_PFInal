package es.ull.etsii.Rate;

import es.courserajava.edu.duke.FileResource;
import es.apachecsv.org.apache.commons.csv.CSVParser;
import es.apachecsv.org.apache.commons.csv.CSVRecord;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase 'RaterDatabase' que funciona como una base de datos de los objetos
 * 'Movies' con su valoración
 */
public class RaterDatabase {
  private static HashMap<String, Rater> ourRaters;

  /**
   * Este método solo es llamado por:
   * @see public static void addRatings(String filename)
   */
  private static void initialize() {
    // this method is only called from addRatings
    if (ourRaters == null) {
      ourRaters = new HashMap<String, Rater>();
    }
  }

  /**
   * Método que inicializa las valoraciones a través de un archivo CSV pasado
   * por parámetro
   *
   * @param filename Nombre fichero CSV
   */
  public static void initialize(String filename) {
    if (ourRaters == null) {
      ourRaters = new HashMap<String, Rater>();
      addRatings("src/main/resources/" + filename);
    }
  }

  /**
   * Método que, a partir de un archivo CSV pasado por parámetro, lee cada una
   * de sus líneas y llama al método 'addRaterRating' pasándole cada uno de sus
   * parámetros obtenidos de cada línea del fichero.
   *
   * @param filename Nombre de archivo CSV
   */
  public static void addRatings(String filename) {
    initialize();
    FileResource fr = new FileResource(filename);
    CSVParser csvp = fr.getCSVParser();
    for (CSVRecord rec : csvp) {
      String id = rec.get("rater_id");
      String item = rec.get("movie_id");
      String rating = rec.get("rating");
      addRaterRating(id, item, Double.parseDouble(rating));
    }
  }

  /**
   * Método que añde una valoración de una película a la tabla Hash 'ourRaters'
   * y recibe como parámetros:
   *
   * @param raterID Identificador del valorador
   * @param movieID Identificador de la película
   * @param rating Nota de la valoración
   */
  public static void addRaterRating(String raterID, String movieID, double rating) {
    initialize();
    Rater rater = null;
    if (ourRaters.containsKey(raterID)) {
      rater = ourRaters.get(raterID);
    } else {
      rater = new EfficientRater(raterID);
      ourRaters.put(raterID, rater);
    }
    rater.addRating(movieID, rating);
  }

  /**
   * Método que devuelve un objeto valorador a través de su identificador
   *
   * @param id Identificador del valorador
   * @return Objeto valorador
   */
  public static Rater getRater(String id) {
    initialize();

    return ourRaters.get(id);
  }

  /**
   * @return Lista de objetos calificadores
   */
  public static ArrayList<Rater> getRaters() {
    initialize();
    ArrayList<Rater> list = new ArrayList<Rater>(ourRaters.values());

    return list;
  }

  /**
   * @return Número de películas valoradas
   */
  public static int size() {
    return ourRaters.size();
  }
}
