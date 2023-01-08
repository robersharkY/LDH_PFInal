package es.ull.etsii.Filters;

import es.ull.etsii.Movies.MovieDatabase;

/**
 * Clase DirectorsFilter que implementa la interfaz 'Filter'
 * Clase que con la que filtrar las peliculas mediante su director.
 */
public class DirectorsFilter implements Filter {
  String directors;

  /**
   * Constructor de la clase DirectorsFilter al que se le pasa una string que
   * contiene el nombre o el apellido de un director
   * @param directors Nombre del director a filtrar
   */
  public DirectorsFilter(String directors) {
    this.directors = directors;
  }

  /**
   * Método de la interfaz 'Filter' heredado.
   * Recorre el array de 'Filter' y comprueba que para el identificador que se
   * le pasa por parametro, el director de esa pelicula es igual al director
   * del filtro
   *
   * @param id Identificador de la película
   * @return Boolean True si se cumple con el filtro.
   */
  @Override
  public boolean satisfies(String id) {
    String movieDirectors = MovieDatabase.getDirector(id);
    String[] filterDirectors = directors.split(",");
    for (String director : filterDirectors) {
      if (movieDirectors.contains(director)) {
        return true;
      }
    }
    return false;
  }
}
