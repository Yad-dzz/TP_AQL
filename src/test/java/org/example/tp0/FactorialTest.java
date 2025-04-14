package org.example.tp0;

import org.example.Factorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    // --- Edge Cases ---
    @Test
    public void testFactorial_Zero_ReturnsOne() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorial_One_ReturnsOne() {
        assertEquals(1, Factorial.factorial(1));
    }

    // --- Small Values ---
    @Test
    public void testFactorial_SmallNumbers_CorrectResult() {
        assertEquals(2, Factorial.factorial(2));   // 2! = 2
        assertEquals(6, Factorial.factorial(3));   // 3! = 6
        assertEquals(24, Factorial.factorial(4)); // 4! = 24
    }

    // --- Negative Input ---
    @Test
    public void testFactorial_NegativeInput_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-10));
    }

    // --- Larger Values ---
    @Test
    public void testFactorial_MediumNumbers_CorrectResult() {
        assertEquals(120, Factorial.factorial(5));    // 5! = 120
        assertEquals(720, Factorial.factorial(6));    // 6! = 720
    }

    // --- Boundary Case ---
    @Test
    public void testFactorial_MaxInputBeforeOverflow() {
        assertEquals(479001600, Factorial.factorial(12)); // 12! is within int range
    }
    @Test
    public void testFactorial_OverflowCase_ThrowsException() {
        // 13! > Integer.MAX_VALUE
        assertThrows(ArithmeticException.class, () -> Factorial.factorial(13));
    }
}