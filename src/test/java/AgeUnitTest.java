package test.java;

import static org.junit.Assert.*;
import org.junit.Test;

public class AgeUnitTest {
    @Test 
    public void testValidAgeInput() {
        int validAge = 25;
        assertTrue(validAge >= 0 && validAge <= 120);
    }
}
