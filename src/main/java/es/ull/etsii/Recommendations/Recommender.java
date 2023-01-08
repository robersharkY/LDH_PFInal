package es.ull.etsii.Recommendations;

import java.util.ArrayList;

/**
 * Implemente esta interfaz para permitir que su código se integre con nuestro sitio web.
 *
 * <p>Cuando los usuarios visitan por primera vez el sitio web de recomendación, nuestro código llamará al método <code>
 * getItemsToRate()</code> para obtener una lista de películas para mostrar en la página web para que los usuarios las califiquen.
 *
 * <p>Cuando un usuario envía sus calificaciones, nuestro código llamará al método <code>
 * printRecommendationsFor</code> para obtener recomendaciones basadas en las calificaciones de los usuarios. La identificación
 * dado a este método es para un nuevo evaluador que ya hemos agregado a RaterDatabase con
 * calificaciones de las películas devueltas por el primer método. Lo que sea que se imprima de ese método será
 * mostrado en la página web: HTML, texto sin formato o información de depuración.
 */
public interface Recommender {
  /**
   * Este método devuelve una lista de ID de películas que se usarán para buscar las películas en el
   * MovieDatabase y preséntelos a los usuarios para que los califiquen.
   *
   * <p>Las películas devueltas en la lista se mostrarán en una página web, por lo que el número que elija
   * puede afectar el tiempo de carga de la página y la disposición de los usuarios a calificar las películas. Para
   * ejemplo, 10-20 debería estar bien, 50 o más sería demasiado.
   *
   * <p>No hay restricciones sobre el método que utiliza para generar esta lista de películas: la mayoría
   * películas recientes, películas de un género específico, películas elegidas al azar o simplemente tu favorita
   * películas.
   *
   * <p>Las clasificaciones de estas películas crearán el perfil de un nuevo evaluador que se usará para
   * comparar con para encontrar recomendaciones.
   */
  ArrayList<String> getItemsToRate();

  /**
   * Este método no devuelve nada, pero imprime una tabla HTML de las películas recomendadas para el
   * evaluador dado.
   *
   * <p>El HTML impreso se mostrará en una página web, por lo que el número que elija mostrar puede
   * afecta el tiempo que tarda la página en cargarse. Por ejemplo, es posible que desee limitar el número impreso
   * solo a las 20-50 mejores películas recomendadas o a las películas no calificadas por el calificador dado.
   *
   * <p>También puede incluir estilo CSS para su tabla utilizando el &lt;estilo&gt; etiqueta antes de imprimir
   * la mesa. No hay restricciones sobre qué películas imprime, en qué orden las imprime,
   * o qué información incluyes sobre cada película.
   *
   * @param webRaterID el ID de un nuevo evaluador que ya se ha agregado a RaterDatabase con
   * calificaciones de las películas devueltas por el método getItemsToRate
   */
  void printRecommendationsFor(String webRaterID);
}
