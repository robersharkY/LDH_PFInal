package es.ull.etsii.Filters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


/**
 * Unit test for YearAfterFilter class.
 */
 public class YearFilterTest {

    /**
     * Method under test: default or parameterless constructor of {@link YearFilter}
     */
    @Test
    void testConstructor() {
        assertThrows(NullPointerException.class,()->{(new YearFilter(2014)).satisfies("42");});
        new YearFilter(1);
    }

    /**
     * Method under test: {@link YearFilter#satisfies(String)}
     */
    @Test
    void testSatisfies() {
        assertEquals(true,new YearFilter(2014).satisfies("3112654"));
        assertEquals(false,new YearFilter(2015).satisfies("3112654"));
        assertEquals(true,new YearFilter(2013).satisfies("3112654"));

        assertEquals(true,new YearFilter(2010).satisfies("1188113"));
        assertEquals(false,new YearFilter(2011).satisfies("1188113"));
        assertEquals(true,new YearFilter(2009).satisfies("1188113"));

        assertEquals(true,new YearFilter(2014,'e').satisfies("3112654"));
        assertEquals(false,new YearFilter(2014,'b').satisfies("3112654"));
        assertEquals(true,new YearFilter(2013,'b').satisfies("3112654"));
        assertEquals(true,new YearFilter(2015,'l').satisfies("3112654"));
        assertEquals(true,new YearFilter(2013,'n').satisfies("3112654"));
        assertEquals(true,new YearFilter(2014,'1').satisfies("3112654"));
        assertEquals(true,new YearFilter(2014,'2').satisfies("3112654"));
        assertEquals(true,new YearFilter(2010,2020).satisfies("3112654"));
    }


}