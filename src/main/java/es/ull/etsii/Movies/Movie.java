package es.ull.etsii.Movies;

/**
 * Clase 'Movie' para representar el objeto película. Es un objeto pasivo,
 * actúa como contenedor de información.
 */
// An immutable passive data object (PDO) to represent item data
public class Movie {
  private final String id;
  private final String title;
  private final int year;
  private final String genres;
  private String director;
  private String country;
  private String poster;
  private int minutes;

  /**
   * Constructor con los atributos mínimos que debe tener una película
   *
   * @param anID Identificador
   * @param aTitle Título
   * @param aYear Año
   * @param theGenres Género(s)
   */
  public Movie(String anID, String aTitle, String aYear, String theGenres) {
    // just in case data file contains extra whitespace
    id = anID.trim();
    title = aTitle.trim();
    year = Integer.parseInt(aYear.trim());
    genres = theGenres;
  }

  /**
   * Constructor con los todos los atributos que puede tener una película
   *
   * @param anID Identificador
   * @param aTitle Título
   * @param aYear Año
   * @param theGenres Género(s)
   * @param aDirector Director
   * @param aCountry País
   * @param aPoster Póster de la pelicula
   * @param theMinutes Duración en minutos
   */
  public Movie(
          String anID,
          String aTitle,
          String aYear,
          String theGenres,
          String aDirector,
          String aCountry,
          String aPoster,
          int theMinutes) {
    // just in case data file contains extra whitespace
    id = anID.trim();
    title = aTitle.trim();
    year = Integer.parseInt(aYear.trim());
    genres = theGenres;
    director = aDirector;
    country = aCountry;
    poster = aPoster;
    minutes = theMinutes;
  }

  /**
   * Método getter que devuelve el atributo identificador
   *
   * @return String Identificador
   */
  // Returns ID associated with this item
  public String getID() {
    return id;
  }

  /**
   * Método getter que devuelve el atributo título
   *
   * @return String Título
   */
  // Returns title of this item
  public String getTitle() {
    return title;
  }

  /**
   * Método getter que devuelve el atributo año
   *
   * @return Integer Año de lanzamiento
   */
  // Returns year in which this item was published
  public int getYear() {
    return year;
  }

  /**
   * Método getter que devuelve el atributo género
   *
   * @return String Género(s)
   */
  // Returns genres associated with this item
  public String getGenres() {
    return genres;
  }

  /**
   * Método getter que devuelve el atributo país
   *
   * @return String País(es) donde se ha rodado la película
   */
  public String getCountry() {
    return country;
  }

  /**
   * Método getter que devuelve el atributo director
   *
   * @return
   */
  public String getDirector() {
    return director;
  }

  /**
   * Método getter que devuelve el atributo póster
   *
   * @return
   */
  public String getPoster() {
    return poster;
  }

  /**
   * Método getter que devuelve el atributo minutos (de duración)
   *
   * @return
   */
  public int getMinutes() {
    return minutes;
  }

  /**
   * Método getter que devuelve una descripción de la película con sus
   * atributos obligatorios
   *
   * @return Descripción de la película en siguiente formato:
   * <p>
   * "Movie [id=" ", title=" ", year=" ", genres= " "]"
   */
  // Returns a string of the item's information
  public String toString() {
    String result = "Movie [id=" + id + ", title=" + title + ", year=" + year;
    result += ", genres= " + genres + "]";
    return result;
  }
}
