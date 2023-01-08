package es.ull.etsii.Filters;

import es.ull.etsii.Movies.MovieDatabase;

/**
 * Clase GenreFilter que implementa la interfaz 'Filter'
 * Clase que con la que filtrar las peliculas mediante su género cinematográfico.
 *
 */
public class GenreFilter implements Filter {

  private final String genre;

  // The constructor should have one parameter named genre representing one genre,
  // and the satisfies method should return true if a movie has this genre.
  // Note that movies may have several genres.

  /**
   * Constructor de la clase GenreFilter. Se establece el género a
   * partir del cuál se filtrarán las películas.
   * @param genre Género a filtrar
   */
  public GenreFilter(String genre) {
    this.genre = genre.toLowerCase();
  }

  /**
   * Método de la interfaz 'Filter' heredado.
   * Comprueba si el genero seleccionado coincide con el conjunto de metodos
   * que tiene una pelicula
   *
   * @param id Identificador de la película
   * @return Boolean True si se cumple con el filtro.
   */
  @Override
  public boolean satisfies(String id) {
    return MovieDatabase.getGenres(id).toLowerCase().contains(genre);
  }
}