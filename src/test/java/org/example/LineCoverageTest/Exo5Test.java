package org.example.LineCoverageTest;

import org.example.tp1.exo5.RomanNumeralFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo5Test {

    @Test
    void testMinBoundary() {
        assertEquals("I", RomanNumeralFixed.toRoman(1)); // active les lignes avec I
    }

    @Test
    void testMaxBoundary() {
        assertEquals("MMMCMXCIX", RomanNumeralFixed.toRoman(3999)); // active toutes les combinaisons
    }

    @Test
    void testValidMiddleValue() {
        assertEquals("MCMXCIV", RomanNumeralFixed.toRoman(1994)); // vérifie plusieurs cas
    }

    @Test
    void testInvalidLow() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralFixed.toRoman(0));
    }

    @Test
    void testInvalidHigh() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralFixed.toRoman(4000));
    }
}

