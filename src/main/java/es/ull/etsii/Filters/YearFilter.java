package es.ull.etsii.Filters;

import es.ull.etsii.Movies.MovieDatabase;

/**
 * Clase YearAfterFilter que implementa la interfaz 'Filter'
 * Clase que con la que filtrar las peliculas mediante su año de lanzamiento
 */

public class YearFilter implements Filter {
  private final int lowerBoundYear;
  private int upperBoundYear = -1;

  // Default option value
  private char option = 'd';

  /**
   * Constructor que, por defecto, establece el año del filtro igual al año por parametro
   * @param year Año igual a
   */
  public YearFilter(int year) {
    lowerBoundYear = year;
    option = '1';
  }

  /**
   * Constructor para filtrar a través de año y opción
   *
   * @param year Año limite
   * @param optionParam Opción a ejecutar
   */
  public YearFilter(int year, char optionParam) {
    lowerBoundYear = year;
    option = optionParam;
  }

  /**
   * Constructor que selecciona películas comprendidas entre dos años, estos
   * incluidos.
   *
   * @param year1
   * @param year2
   */
  public YearFilter(int year1, int year2) {
    lowerBoundYear = year1;
    upperBoundYear = year2;
    option = 'r';
  }

  /**
   * Método de la interfaz 'Filter' heredado.
   * Comprueba si un año y opción o un rango de años coinciden con el año de
   * una pelicula.
   *
   * @param id Identificador de la película
   * @return Boolean True si se cumple con el filtro.
   */
  @Override
  public boolean satisfies(String id) {
    switch (option) {
      // Equal
      case 'e':
        return MovieDatabase.getYear(id) == lowerBoundYear;
      case 'b':
        return MovieDatabase.getYear(id) > lowerBoundYear;
      case 'l':
        return MovieDatabase.getYear(id) < lowerBoundYear;
      case 'n':
        return MovieDatabase.getYear(id) != lowerBoundYear;
      case '1':
        return MovieDatabase.getYear(id) >= lowerBoundYear;
      case '2':
        return MovieDatabase.getYear(id) <= lowerBoundYear;
      case 'r':
        return ((MovieDatabase.getYear(id) >= lowerBoundYear) &&
                (MovieDatabase.getYear(id) <= upperBoundYear));
      default:
        return false;
    }
  }
}