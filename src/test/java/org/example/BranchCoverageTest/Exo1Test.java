package org.example.BranchCoverageTest;

import org.example.tp1.exo1.PalindromeFixed;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    // === Covers: normal palindrome (true path) ===
    @Test
    void testBasicPalindrome() {
        assertTrue(PalindromeFixed.isPalindrome("madam"));
    }

    // === Covers: non-palindrome (false path) ===
    @Test
    void testNonPalindrome() {
        assertFalse(PalindromeFixed.isPalindrome("hello"));
    }

    // === Covers: normalization of case and space ===
    @Test
    void testPalindromeWithSpacesAndCases() {
        assertTrue(PalindromeFixed.isPalindrome("A man a plan a canal Panama"));
    }

    // === Covers: edge case - empty string ===
    @Test
    void testEmptyString() {
        assertTrue(PalindromeFixed.isPalindrome(""));
    }

    // === Covers: input with two different characters ===
    @Test
    void testTwoDifferentChars() {
        assertFalse(PalindromeFixed.isPalindrome("ab"));
    }

    // === Covers: null input - should throw ===
    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> PalindromeFixed.isPalindrome(null));
    }

    // === Covers: single character (minimal valid palindrome) ===
    @Test
    void testSingleCharacter() {
        assertTrue(PalindromeFixed.isPalindrome("a"));
    }
}
