package es.ull.etsii.Filters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 * Unit test for GenreFilter class.
 */
public class GenreFilterTest {

    /**
     * Methods under test:
     *
     * <ul>
     *   <li>{@link GenreFilter#GenreFilter(String)}
     *   <li>{@link GenreFilter#satisfies(String)}
     * </ul>
     */
    @Test
    void testConstructor() {
        assertThrows(NullPointerException.class,()->{(new GenreFilter("Genre")).satisfies("42");});
    }

    /**
     * Method under test: {@link GenreFilter#satisfies(String)}
     */
    @Test
    void testSatisfies() {

        assertEquals(true,new GenreFilter("Action, Thriller").satisfies("3112654"));
        assertEquals(false,new GenreFilter("Romance").satisfies("3112654"));

        assertEquals(true,new GenreFilter("Drama, Thriller").satisfies("1188113"));
        assertEquals(false,new GenreFilter("Terror").satisfies("1188113"));

    }

}