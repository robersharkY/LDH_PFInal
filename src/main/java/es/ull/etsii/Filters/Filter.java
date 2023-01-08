package es.ull.etsii.Filters;

/**
 * Interfaz filtro
 */
public interface Filter {

  /**
   * Interfaz filtro
   * @param id Identificador de una película
   */
  boolean satisfies(String id);
}