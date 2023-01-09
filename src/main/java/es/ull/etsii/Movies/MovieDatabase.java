package es.ull.etsii.Movies;

import es.ull.etsii.Filters.Filter;
import es.ull.etsii.Movies.Movie;
import es.ull.etsii.Ratings.FirstRatings;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Clase 'MovieDatabase' que funciona base de datos de objetos 'Movie'
 * almacenados en fichero CSV
 */
public class MovieDatabase {
  private static HashMap<String, Movie> ourMovies;

  /**
   * Método estático para inicializar una base da datos a partir de un fichero que almacena películas.
   * En este caso se cuenta con varias ficheros básicos o de ejemplo.
   *
   * @param moviefile Fichero donde se almacenan x películas
   */
  public static void initialize(String moviefile) {
    if (ourMovies == null) {
      ourMovies = new HashMap<>();
      loadMovies("src/main/resources/" + moviefile);
    }
  }

  /**
   * Método privado estático que funciona igual que
   * pero escoge un fichero por defecto
   *
   */
  public static void initialize() {
    if (ourMovies == null) {
      ourMovies = new HashMap<>();
      loadMovies("src/main/resources/ratedmoviesfull.csv");
    }
  }

  /**
   * Método estático que dado un fichero con películas, las evalúa con el
   * objeto FirstRating e inserta su valoración en el atributo privado
   *
   * @param filename Nombre fichero con películas.
   */
  public static void loadMovies(String filename) {
    FirstRatings fr = new FirstRatings();
    ArrayList<Movie> list = fr.loadMovies(filename);
    for (Movie m : list) {
      ourMovies.put(m.getID(), m);
    }
  }

  /**
   * Método que indica si una película se encuentra en la base de datos
   *
   * @param id Identificador de la película
   * @return Indica si se encuentra o no se encuentra
   */
  public static boolean containsID(String id) {
    initialize();
    return ourMovies.containsKey(id);
  }

  /**
   * Método que devuelve el año de una película a través de su identificador
   *
   * @param id Identificador de una película
   * @return Año de la película
   */
  public static int getYear(String id) {
    initialize();
    return ourMovies.get(id).getYear();
  }

  /**
   * Método que devuelve los género de una película a través de su identificador
   * @param id Identificador de una película
   * @return Género(s) de la película
   */
  public static String getGenres(String id) {
    initialize();
    return ourMovies.get(id).getGenres();
  }

  /**
   * Método que devuelve el título de una película a través de su identificador
   * @param id Identificador de una película
   * @return Título de la película
   */
  public static String getTitle(String id) {
    initialize();
    return ourMovies.get(id).getTitle();
  }

  /**
   * Método que devuelve el objeto 'Movie' a través de su identificador
   *
   * @param id Identificador de una película
   * @return Movie Objeto 'Movie'
   */
  public static Movie getMovie(String id) {
    initialize();
    return ourMovies.get(id);
  }

  /**
   * Método que devuelve la URL que muestra el cartel de una película a través
   * de su identificador
   * @param id Identificador de una película
   * @return URL que guarda el cartel de la película
   */
  public static String getPoster(String id) {
    initialize();
    return ourMovies.get(id).getPoster();
  }

  /**
   * Método que devuelve la duración en minutos de una película a través de su
   * identificador
   * @param id Identificador de una película
   * @return Duración en minutos
   */
  public static int getMinutes(String id) {
    initialize();
    return ourMovies.get(id).getMinutes();
  }

  /**
   * Método que devuelve el país de rodaje de una película a través de su
   * identificador
   * @param id Identificador de una película
   * @return País(es) de la película
   */
  public static String getCountry(String id) {
    initialize();
    return ourMovies.get(id).getCountry();
  }

  /**
   * Método que devuelve el director de una película a través de su
   * identificador
   * @param id Identificador de una película
   * @return Director de la película
   */
  public static String getDirector(String id) {
    initialize();
    return ourMovies.get(id).getDirector();
  }

  /**
   * Método que devuelve el número de películas del atributo
   * @return Director de la película
   */
  public static int size() {
    return ourMovies.size();
  }

  /**
   * Método que filtra péliculas a través de un objeto 'Filter' pasado por parámetro
   * @param f Filtro a emplear
   * @return Vector de películas que cumplen la condición de filtrado
   */
  public static ArrayList<String> filterBy(Filter f) {
    initialize();
    ArrayList<String> list = new ArrayList<>();
    for (String id : ourMovies.keySet()) {
      if (f.satisfies(id)) {
        list.add(id);
      }
    }

    return list;
  }

  public static ArrayList<Movie> getMoviesByTitle(String paramTitle) {
    initialize();
    ArrayList<Movie> moviesFounded = new ArrayList<>();
    for (Movie m : ourMovies.values()) {
      if (m.getTitle().toLowerCase().contains(paramTitle)) {
        moviesFounded.add(m);
      }
    }
    return moviesFounded;
  }
}
