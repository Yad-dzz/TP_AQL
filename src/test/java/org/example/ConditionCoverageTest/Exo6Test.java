package org.example.ConditionCoverageTest;

import org.example.tp1.exo6.FizzBuzzFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo6Test {

    @Test
    void testCondition_NLessThanOrEqualToZero_True() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzFixed.fizzBuzz(-5));
    }

    @Test
    void testCondition_NLessThanOrEqualToZero_False() {
        assertEquals("1", FizzBuzzFixed.fizzBuzz(1));
    }

    @Test
    void testCondition_NMod15EqualsZero_True() {
        assertEquals("FizzBuzz", FizzBuzzFixed.fizzBuzz(60));
    }

    @Test
    void testCondition_NMod15EqualsZero_False() {
        assertNotEquals("FizzBuzz", FizzBuzzFixed.fizzBuzz(5));
    }

    @Test
    void testCondition_NMod3EqualsZero_True() {
        assertEquals("Fizz", FizzBuzzFixed.fizzBuzz(6));
    }

    @Test
    void testCondition_NMod3EqualsZero_False() {
        assertNotEquals("Fizz", FizzBuzzFixed.fizzBuzz(10));
    }

    @Test
    void testCondition_NMod5EqualsZero_True() {
        assertEquals("Buzz", FizzBuzzFixed.fizzBuzz(10));
    }

    @Test
    void testCondition_NMod5EqualsZero_False() {
        assertNotEquals("Buzz", FizzBuzzFixed.fizzBuzz(11));
    }
}
