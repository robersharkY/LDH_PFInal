package es.ull.etsii.Filters;

import java.util.ArrayList;

/**
 * Clase AllFilters que implementa la interfaz 'Filter'
 * Clase que almacena todos los tipos de filtro aplicables a una pelicula
 */
public class AllFilters implements Filter {
  ArrayList<Filter> filters;

  /**
   * Constructor de la clase AllFilters
   */
  public AllFilters() {
    filters = new ArrayList<>();
  }

  /**
   * Método que añade un filtro al vector de interfaz 'Filter'
   * @param f Filtro a añadir
   */
  public void addFilter(Filter f) {
    filters.add(f);
  }

  /**
   * Método de la interfaz 'Filter' heredado.
   * Recorre el array de 'Filter' y comprueba que para el identificador que se
   * le pasa por parametro, el elemento del array devuelve true. Si cualquiera
   * de los filtros retorna false, el método devuelve false.
   *
   * @param id Identificador de la película
   * @return Boolean True si se cumple con el filtro.
   */
  @Override
  public boolean satisfies(String id) {
    for (Filter f : filters) {
      if (!f.satisfies(id)) {
        return false;
      }
    }
    return true;
  }
}
