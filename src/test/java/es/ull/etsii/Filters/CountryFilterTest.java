package es.ull.etsii.Filters;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountryFilterTest {

    /**
     * Method under test: {@link CountryFilter#satisfies(String)}
     */
    @Test
    void testSatisfies() {

        assertEquals(true,new CountryFilter("France").satisfies("3112654"));
        assertEquals(false,new CountryFilter("Germany").satisfies("3112654"));

        assertEquals(true,new CountryFilter("USA").satisfies("1188113"));
        assertEquals(false,new CountryFilter("China").satisfies("1188113"));
    }
}

