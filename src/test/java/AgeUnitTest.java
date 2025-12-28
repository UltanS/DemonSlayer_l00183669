import static org.junit.Assert.*;
import org.junit.Test;

/*
 * Name: Ultan Sweeney
 * Student ID: l00183669
 */

public class AgeUnitTest {

    @Test 
    public void testChildAgeCategory() {
        assertEquals("Child", new Age(10).getAgeCategory());
    }

    @Test
    public void testTeenAgeCategory() {
        assertEquals("Teen", new Age(15).getAgeCategory());
    }

    @Test
    public void testAdultAgeCategory() {
        assertEquals("Adult", new Age(30).getAgeCategory());
    }

    @Test
    public void testSeniorAgeCategory() {
        assertEquals("Senior", new Age(70).getAgeCategory());
    }

    @Test
    public void testNegativeAgeThrowsException() {
        try {
            new Age(-5);
            fail("Expected IllegalArgumentException for negative age");
        } catch (IllegalArgumentException e) {
            assertEquals("ERROR - Age cannot be negative.", e.getMessage());
        }
    }

    @Test
    public void testUnrealisticAgeThrowsException() {
        try {
            new Age(150);
            fail("Expected IllegalArgumentException for unrealistic age");
        } catch (IllegalArgumentException e) {
            assertEquals("ERROR - age seems unrealistic (greater than 130).", e.getMessage());
        }
    }
}
