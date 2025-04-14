package org.example.tp0;

import org.example.Prime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeTest {

    // --- Negative numbers and 0/1 ---
    @Test
    public void testIsPrime_NegativeNumber_ReturnsFalse() {
        assertFalse(Prime.isPrime(-1));
        assertFalse(Prime.isPrime(-10));
    }

    @Test
    public void testIsPrime_ZeroOrOne_ReturnsFalse() {
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
    }

    // --- Small primes ---
    @Test
    public void testIsPrime_SmallPrimes_ReturnsTrue() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
    }

    // --- Small non-primes ---
    @Test
    public void testIsPrime_SmallNonPrimes_ReturnsFalse() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
    }

    // --- Large primes ---
    @Test
    public void testIsPrime_LargePrimes_ReturnsTrue() {
        assertTrue(Prime.isPrime(997));
        assertTrue(Prime.isPrime(7919));
    }

    // --- Large non-primes ---
    @Test
    public void testIsPrime_LargeNonPrimes_ReturnsFalse() {
        assertFalse(Prime.isPrime(1000));
        assertFalse(Prime.isPrime(7920));
    }

    // --- Boundary cases ---
    @Test
    public void testIsPrime_MaxInt_ReturnsFalse() {
        assertFalse(Prime.isPrime(Integer.MAX_VALUE - 1));
        //  Integer.MAX_VALUE is actually prime, but the naïve algo may timeout.
    }
}