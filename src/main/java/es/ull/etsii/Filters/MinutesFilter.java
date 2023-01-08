package es.ull.etsii.Filters;
import es.ull.etsii.Movies.MovieDatabase;

/**
 * Clase MinutesFilter que implementa la interfaz 'Filter'
 * Clase que con la que filtrar las peliculas mediante su duración mínima y
 * máxima en minutos.
 */
public class MinutesFilter implements Filter {
  private /*final*/ int minMinutes;
  private /*final*/ int maxMinutes;

  private /*final*/ char option;

  /**
   * Constructor de la clase MinutesFilter. Se establece como opcion del filtro
   * la duracion que se encuentra entre dos tiempos en minutos.
   *
   * @param minMinutes Mínimo de minutos de duración
   * @param maxMinutes Máximo de minutos de duración
   */
  public MinutesFilter(int minMinutes, int maxMinutes) {
    this.minMinutes = minMinutes;
    this.maxMinutes = maxMinutes;
    option = 'r';
  }

  /**
   * Constructor de la clase MinutesFilter. Se establece como opcion del filtro
   * la duracion superior al tiempo en minutos pasado por parametro.
   *
   * @param minMinutes Mínimo de minutos de duración
   */
  // No max minutes given
  public MinutesFilter(int minMinutes) {
    this.minMinutes = minMinutes;
    this.maxMinutes = Integer.MAX_VALUE;
    option = 'b';
  }

  /**
   * Constructor de la clase MinutesFilter. Se establece como opcion del filtro
   * la duracion superior o inferior al tiempo en minutos pasado por parametro.
   *
   * @param minutes Mínimo de minutos de duración
   * @param paramOption Opcion elegida. Puede ser maximo de minutos o minimo de minutos
   */
  public MinutesFilter(int minutes, char paramOption) {
    option = paramOption;
    if (option == 'b') {
      this.minMinutes = minutes;
    }
    if (option == 'l') {
      this.maxMinutes = minutes;
    }
  }

  public int getMinMinutes(){
    return minMinutes;
  }

  public int getMaxMinutes(){
    return maxMinutes;
  }

  /**
   * Método de la interfaz 'Filter' heredado.
   * Comprueba si la(s) duración(es) seleccionada(s) coincide(n) y/u opción
   * seleccionada coincide con el año de cierta película
   *
   * @param id Identificador de la película
   * @return Boolean True si se cumple con el filtro.
   */
  @Override
  public boolean satisfies(String id) {
    switch (option) {
      // Equal
      case 'r':
        return ((MovieDatabase.getMinutes(id) >= minMinutes) && (MovieDatabase.getMinutes(id) <= maxMinutes));
      case 'b':
        return MovieDatabase.getMinutes(id) >= minMinutes;
      case 'l':
        return MovieDatabase.getMinutes(id) <= maxMinutes;
      default:
        return false; // Default return
    }
  }
}
