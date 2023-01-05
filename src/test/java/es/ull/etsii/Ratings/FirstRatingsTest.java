package es.ull.etsii.Ratings;

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

/**
 * Unit test for FirstRatings class.
 */
public class FirstRatingsTest {

    /**
     * Method under test: {@link FirstRatings#FirstRatings()}
     */
    @Test
    void testConstructor() {
        // TODO: Complete this test.
        //   Reason: R002 Missing observers.
        //   Diffblue Cover was unable to create an assertion.
        //   Add getters for the following fields or make them package-private:
        //     FirstRatings.movieArrayList
        //     FirstRatings.raterArrayList
        //     FirstRatings.directorsAndItsMovies
        //     FirstRatings.ratersWithIds
        //     FirstRatings.ratersAndCountOfRatings
        //     FirstRatings.moviesAndRatersMap

        new FirstRatings();
    }

    /**
     * Method under test: {@link FirstRatings#FirstRatings(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   es.courserajava.edu.duke.ResourceException: FileResource: cannot access C:\Users\roberto\IdeaProjects\LDH_PFInal\data\foo.txt
        //       at es.courserajava.edu.duke.FileResource.initRead(FileResource.java:370)
        //       at es.courserajava.edu.duke.FileResource.<init>(FileResource.java:95)
        //       at es.ull.etsii.Ratings.FirstRatings.loadMovies(FirstRatings.java:150)
        //       at es.ull.etsii.Ratings.FirstRatings.<init>(FirstRatings.java:32)
        //   In order to prevent <init>(String)
        //   from throwing ResourceException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(String).
        //   See https://diff.blue/R013 to resolve this issue.

        new FirstRatings("foo.txt");
    }

    /**
     * Method under test: {@link FirstRatings#FirstRatings(String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testConstructor3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   es.courserajava.edu.duke.ResourceException: FileResource: cannot access C:\Users\roberto\IdeaProjects\LDH_PFInal\data\foo.txt
        //       at es.courserajava.edu.duke.FileResource.initRead(FileResource.java:370)
        //       at es.courserajava.edu.duke.FileResource.<init>(FileResource.java:95)
        //       at es.ull.etsii.Ratings.FirstRatings.loadMovies(FirstRatings.java:150)
        //       at es.ull.etsii.Ratings.FirstRatings.<init>(FirstRatings.java:32)
        //       at es.ull.etsii.Ratings.FirstRatings.<init>(FirstRatings.java:37)
        //   In order to prevent <init>(String, String)
        //   from throwing ResourceException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   <init>(String, String).
        //   See https://diff.blue/R013 to resolve this issue.

        new FirstRatings("foo.txt", "foo.txt");

    }

    /**
     * Method under test: {@link FirstRatings#loadRaters(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLoadRaters() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   es.courserajava.edu.duke.ResourceException: FileResource: cannot access C:\Users\roberto\IdeaProjects\LDH_PFInal\data\foo.txt
        //       at es.courserajava.edu.duke.FileResource.initRead(FileResource.java:370)
        //       at es.courserajava.edu.duke.FileResource.<init>(FileResource.java:95)
        //       at es.ull.etsii.Ratings.FirstRatings.loadRaters(FirstRatings.java:69)
        //   In order to prevent loadRaters(String)
        //   from throwing ResourceException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   loadRaters(String).
        //   See https://diff.blue/R013 to resolve this issue.

        FirstRatings.loadRaters("foo.txt");
    }

    /**
     * Method under test: {@link FirstRatings#loadMovies(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testLoadMovies() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   es.courserajava.edu.duke.ResourceException: FileResource: cannot access foo.txt
        //       at es.courserajava.edu.duke.FileResource.initRead(FileResource.java:370)
        //       at es.courserajava.edu.duke.FileResource.<init>(FileResource.java:95)
        //       at es.ull.etsii.Ratings.FirstRatings.loadMovies(FirstRatings.java:150)
        //   In order to prevent loadMovies(String)
        //   from throwing ResourceException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   loadMovies(String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new FirstRatings()).loadMovies("foo.txt");
    }

    /**
     * Method under test: {@link FirstRatings#loadMovies(String)}
     */
    @Test
    void testLoadMovies2() {
        assertTrue((new FirstRatings()).loadMovies("").isEmpty());
    }

    /**
     * Method under test: {@link FirstRatings#testLoadMovies()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testTestLoadMovies() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Collection.size()" because "that" is null
        //       at es.ull.etsii.Ratings.FirstRatings.testLoadMovies(FirstRatings.java:193)
        //   In order to prevent testLoadMovies()
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   testLoadMovies().
        //   See https://diff.blue/R013 to resolve this issue.

        (new FirstRatings()).testLoadMovies();
    }

    /**
     * Method under test: {@link FirstRatings#testLoadRaters(String, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testTestLoadRaters() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "java.util.Collection.size()" because "that" is null
        //       at es.ull.etsii.Ratings.FirstRatings.testPrintAllRaterWithRatings(FirstRatings.java:344)
        //       at es.ull.etsii.Ratings.FirstRatings.testLoadRaters(FirstRatings.java:253)
        //   In order to prevent testLoadRaters(String, String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   testLoadRaters(String, String).
        //   See https://diff.blue/R013 to resolve this issue.

        (new FirstRatings()).testLoadRaters("Rater ID", "Movie ID");
    }

}