package es.ull.etsii.Filters;

import es.ull.etsii.Filters.Filter;

public class TrueFilter implements Filter {
  @Override
  public boolean satisfies(String id) {
    return true;
  }
}
