package org.example.LineCoverageTest;


import org.example.tp1.exo2.AnagramFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    @Test
    public void testEmptyStrings() {
        assertTrue(AnagramFixed.isAnagram("", "")); // runs all logic on length 0
    }

    @Test
    public void testValidAnagramSimple() {
        assertTrue(AnagramFixed.isAnagram("race", "care"));
    }

    @Test
    public void testInvalidAnagramWrongFrequency() {
        assertFalse(AnagramFixed.isAnagram("aabb", "abbb")); // one 'a' is missing
    }

    @Test
    public void testValidWithSpacesAndCases() {
        assertTrue(AnagramFixed.isAnagram("A gentleman", "Elegant man")); // ignores spaces and cases
    }

    @Test
    public void testLetterDistributionMismatch() {
        assertFalse(AnagramFixed.isAnagram("hello", "world")); // same length, wrong letters
    }
}
