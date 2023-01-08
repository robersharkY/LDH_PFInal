package es.ull.etsii.Filters;


public class TrueFilter implements Filter {

  /**
   * Clase TrueFilter que implementa la interfaz 'Filter'
   * Clase que con la que filtrar las peliculas...
   *
   * @param id Identificador de la película a filtrar
   */
  @Override
  public boolean satisfies(String id) {
    return true;
  }
}
