package org.example.BranchCoverageTest;

import org.example.tp1.exo5.RomanNumeralFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo5Test {

    @Test
    void testBranch_ExceptionThrownBelowRange() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralFixed.toRoman(0));
    }

    @Test
    void testBranch_ExceptionThrownAboveRange() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralFixed.toRoman(5000));
    }

    @Test
    void testBranch_NoLoopIteration() {
        assertEquals("I", RomanNumeralFixed.toRoman(1)); // entre dans la boucle while juste pour le dernier symbole
    }

    @Test
    void testBranch_LoopIterationOncePerSymbol() {
        assertEquals("IV", RomanNumeralFixed.toRoman(4)); // entre dans boucle while pour un symbole
    }

    @Test
    void testBranch_LoopMultipleIterations() {
        assertEquals("XXX", RomanNumeralFixed.toRoman(30)); // itère plusieurs fois sur "X"
    }

    @Test
    void testBranch_CompleteSymbolSet() {
        assertEquals("MMMCMXCIX", RomanNumeralFixed.toRoman(3999)); // utilise tous les types de symboles (M à I)
    }
}
