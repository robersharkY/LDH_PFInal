package es.ull.etsii.Rate;

import org.junit.jupiter.api.Assertions.*;
import org.junit.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class RaterDatabaseTest {

    /**
     * Method under test: {@link RaterDatabase#initialize(String)}
     */
    @Test
    void testInitialize() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by initialize(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        RaterDatabase.initialize("foo.txt");
    }

    /**
     * Method under test: {@link RaterDatabase#addRatings(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddRatings() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   es.courserajava.edu.duke.ResourceException: FileResource: cannot access foo.txt
        //       at es.courserajava.edu.duke.FileResource.initRead(FileResource.java:370)
        //       at es.courserajava.edu.duke.FileResource.<init>(FileResource.java:95)
        //       at es.ull.etsii.Rate.RaterDatabase.addRatings(RaterDatabase.java:34)
        //   In order to prevent addRatings(String)
        //   from throwing ResourceException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addRatings(String).
        //   See https://diff.blue/R013 to resolve this issue.

        RaterDatabase.addRatings("foo.txt");
    }

    /**
     * Method under test: {@link RaterDatabase#addRatings(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAddRatings2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   es.courserajava.edu.duke.ResourceException: FileResource: cannot access null
        //       at es.courserajava.edu.duke.FileResource.initRead(FileResource.java:370)
        //       at es.courserajava.edu.duke.FileResource.<init>(FileResource.java:95)
        //       at es.ull.etsii.Rate.RaterDatabase.addRatings(RaterDatabase.java:34)
        //   In order to prevent addRatings(String)
        //   from throwing ResourceException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   addRatings(String).
        //   See https://diff.blue/R013 to resolve this issue.

        RaterDatabase.addRatings(null);
    }

    /**
     * Method under test: {@link RaterDatabase#addRatings(String)}
     */
    @Test
    void testAddRatings3() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by addRatings(String)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        RaterDatabase.addRatings("");
    }

    /**
     * Method under test: {@link RaterDatabase#addRaterRating(String, String, double)}
     */
    @Test
    void testAddRaterRating() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by addRaterRating(String, String, double)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        RaterDatabase.addRaterRating("Rater ID", "Movie ID", 10.0d);
    }

    /**
     * Method under test: {@link RaterDatabase#addRaterRating(String, String, double)}
     */
    @Test
    void testAddRaterRating2() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by addRaterRating(String, String, double)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        RaterDatabase.addRaterRating("foo", "foo", 10.0d);
    }

    /**
     * Method under test: {@link RaterDatabase#addRaterRating(String, String, double)}
     */
    @Test
    void testAddRaterRating3() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by addRaterRating(String, String, double)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        RaterDatabase.addRaterRating("Rater ID", null, 10.0d);
    }

    /**
     * Method under test: {@link RaterDatabase#addRaterRating(String, String, double)}
     */
    @Test
    void testAddRaterRating4() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by addRaterRating(String, String, double)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        RaterDatabase.addRaterRating("Rater ID", "Movie ID", 10.0d);
    }

    /**
     * Method under test: {@link RaterDatabase#addRaterRating(String, String, double)}
     */
    @Test
    void testAddRaterRating5() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by addRaterRating(String, String, double)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        RaterDatabase.addRaterRating("foo", "foo", 10.0d);
    }

    /**
     * Method under test: {@link RaterDatabase#addRaterRating(String, String, double)}
     */
    @Test
    void testAddRaterRating6() {
        // TODO: Complete this test.
        //   Reason: R004 No meaningful assertions found.
        //   Diffblue Cover was unable to create an assertion.
        //   Make sure that fields modified by addRaterRating(String, String, double)
        //   have package-private, protected, or public getters.
        //   See https://diff.blue/R004 to resolve this issue.

        RaterDatabase.addRaterRating("Rater ID", null, 10.0d);
    }

    /**
     * Method under test: {@link RaterDatabase#getRater(String)}
     */
    @Test
    void testGetRater() {
        assertFalse(RaterDatabase.getRater("42") instanceof EfficientRater);
    }

    /**
     * Method under test: {@link RaterDatabase#getRaters()}
     */
    @Test
    void testGetRaters() {
        assertEquals(1, RaterDatabase.getRaters().size());
    }

    /**
     * Method under test: {@link RaterDatabase#size()}
     */
    @Test
    void testSize() {
        assertEquals(0, RaterDatabase.size());
    }

}