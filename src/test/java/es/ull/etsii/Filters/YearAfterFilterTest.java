package es.ull.etsii.Filters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 * Unit test for YearAfterFilter class.
 */
public class YearAfterFilterTest {

    /**
     * Method under test: default or parameterless constructor of {@link YearAfterFilter}
     */
    @Test
    void testConstructor() {
        assertThrows(NullPointerException.class,()->{(new YearAfterFilter(2014)).satisfies("42");});
        new YearAfterFilter(1);
    }

    /**
     * Method under test: {@link YearAfterFilter#satisfies(String)}
     */
    @Test
    void testSatisfies() {
        assertEquals(true,new YearAfterFilter(2014).satisfies("3112654"));
        assertEquals(false,new YearAfterFilter(2015).satisfies("3112654"));
        assertEquals(true,new YearAfterFilter(2013).satisfies("3112654"));

        assertEquals(true,new YearAfterFilter(2010).satisfies("1188113"));
        assertEquals(false,new YearAfterFilter(2011).satisfies("1188113"));
        assertEquals(true,new YearAfterFilter(2009).satisfies("1188113"));
    }


}