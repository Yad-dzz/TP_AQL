package org.example.BranchCoverageTest;

import org.example.tp1.exo6.FizzBuzzFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo6Test {

    @Test
    void testBranch_Negative_True() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzFixed.fizzBuzz(0));
    }

    @Test
    void testBranch_Negative_False() {
        assertDoesNotThrow(() -> FizzBuzzFixed.fizzBuzz(1));
    }

    @Test
    void testBranch_DivisibleBy15_True() {
        assertEquals("FizzBuzz", FizzBuzzFixed.fizzBuzz(45));
    }

    @Test
    void testBranch_DivisibleBy15_False() {
        assertNotEquals("FizzBuzz", FizzBuzzFixed.fizzBuzz(9));
    }

    @Test
    void testBranch_DivisibleBy3_True() {
        assertEquals("Fizz", FizzBuzzFixed.fizzBuzz(6));
    }

    @Test
    void testBranch_DivisibleBy3_False() {
        assertNotEquals("Fizz", FizzBuzzFixed.fizzBuzz(10));
    }

    @Test
    void testBranch_DivisibleBy5_True() {
        assertEquals("Buzz", FizzBuzzFixed.fizzBuzz(10));
    }

    @Test
    void testBranch_DivisibleBy5_False() {
        assertNotEquals("Buzz", FizzBuzzFixed.fizzBuzz(7));
    }
}
