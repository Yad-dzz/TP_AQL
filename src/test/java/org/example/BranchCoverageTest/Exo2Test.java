package org.example.BranchCoverageTest;

import org.example.tp1.exo2.AnagramFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {

    @Test
    public void testNullFirstInput() {
        assertThrows(NullPointerException.class, () -> AnagramFixed.isAnagram(null, "test"));
    }

    @Test
    public void testNullSecondInput() {
        assertThrows(NullPointerException.class, () -> AnagramFixed.isAnagram("test", null));
    }

    @Test
    public void testDifferentLengths() {
        assertFalse(AnagramFixed.isAnagram("abc", "abcd"));
    }

    @Test
    public void testSameLengthDifferentLetters() {
        assertFalse(AnagramFixed.isAnagram("abc", "def"));
    }

    @Test
    public void testValidAnagram() {
        assertTrue(AnagramFixed.isAnagram("chien", "niche"));
    }
}
