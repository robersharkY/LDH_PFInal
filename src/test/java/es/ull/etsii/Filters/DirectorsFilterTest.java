package es.ull.etsii.Filters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Unit test for DirectorsFilter class.
 */
public class DirectorsFilterTest {

    /**
     * Method under test: default or parameterless constructor of {@link DirectorsFilter}
     */
    @Test
    void testConstructor() {
        assertEquals("Directors", (new DirectorsFilter("Directors")).directors);
    }

    /**
     * Method under test: {@link DirectorsFilter#satisfies(String)}
     */
    @Test
    void testSatisfies() {

        assertEquals(true,new DirectorsFilter("Fred Cavayé").satisfies("3112654"));
        assertEquals(false,new DirectorsFilter("Fred pepe").satisfies("3112654"));

        assertEquals(true,new DirectorsFilter("Michael Lander").satisfies("1188113"));
        assertEquals(false,new DirectorsFilter("Jose").satisfies("1188113"));
    }

}