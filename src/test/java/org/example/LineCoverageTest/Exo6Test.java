package org.example.LineCoverageTest;

import org.example.tp1.exo6.FizzBuzzFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo6Test {

    @Test
    void testNegativeNumberThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            FizzBuzzFixed.fizzBuzz(-1);
        });
    }

    @Test
    void testFizzBuzzDivisibleBy15() {
        assertEquals("FizzBuzz", FizzBuzzFixed.fizzBuzz(30));
    }

    @Test
    void testFizzOnlyDivisibleBy3() {
        assertEquals("Fizz", FizzBuzzFixed.fizzBuzz(9));
    }

    @Test
    void testBuzzOnlyDivisibleBy5() {
        assertEquals("Buzz", FizzBuzzFixed.fizzBuzz(10));
    }

    @Test
    void testNotDivisibleBy3Or5() {
        assertEquals("7", FizzBuzzFixed.fizzBuzz(7));
    }
}
