package org.example.ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.tp1.exo2.AnagramFixed;

public class Exo2Test {

    @Test
    public void testFirstInputNull() {
        assertThrows(NullPointerException.class, () -> AnagramFixed.isAnagram(null, "abc"));
    }

    @Test
    public void testSecondInputNull() {
        assertThrows(NullPointerException.class, () -> AnagramFixed.isAnagram("abc", null));
    }

    @Test
    public void testSameLengthConditionTrue() {
        assertTrue(AnagramFixed.isAnagram("evil", "vile")); // equal length, valid
    }

    @Test
    public void testSameLengthConditionFalse() {
        assertFalse(AnagramFixed.isAnagram("abc", "abcd")); // triggers length mismatch
    }

    @Test
    public void testWhitespaceIgnored() {
        assertTrue(AnagramFixed.isAnagram("a bc", "cab")); // space ignored
    }

    @Test
    public void testCaseInsensitive() {
        assertTrue(AnagramFixed.isAnagram("Listen", "SILENT")); // case ignored
    }
}
