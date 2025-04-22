package org.example.ConditionCoverageTest;

import org.example.tp1.exo5.RomanNumeralFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo5Test {

    @Test
    void testConditionLowerThanOne() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralFixed.toRoman(0)); // n < 1 == true
    }

    @Test
    void testConditionGreaterThan3999() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralFixed.toRoman(4001)); // n > 3999 == true
    }

    @Test
    void testConditionWithinValidRange() {
        assertDoesNotThrow(() -> RomanNumeralFixed.toRoman(2023)); // n < 1 == false && n > 3999 == false
    }

    @Test
    void testWhileConditionTrueOnce() {
        assertEquals("V", RomanNumeralFixed.toRoman(5)); // n >= values[i] == true once
    }

    @Test
    void testWhileConditionTrueMultipleTimes() {
        assertEquals("III", RomanNumeralFixed.toRoman(3)); // n >= 1 true 3 times
    }

    @Test
    void testWhileConditionFalseInitially() {
        assertEquals("IV", RomanNumeralFixed.toRoman(4)); // n >= 5 false, then true for 4
    }
}
