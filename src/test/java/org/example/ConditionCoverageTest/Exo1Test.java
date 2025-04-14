package org.example.ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.tp1.exo1.PalindromeFixed;

public class Exo1Test {

    // === Condition: input == null → false ===
    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> PalindromeFixed.isPalindrome(null));
    }

    // === Conditions: normalized string has multiple chars and is palindrome ===
    @Test
    void testBasicPalindrome() {
        assertTrue(PalindromeFixed.isPalindrome("madam")); // Normal true case
    }

    // === Conditions: normalized string has multiple chars and is NOT palindrome ===
    @Test
    void testNonPalindrome() {
        assertFalse(PalindromeFixed.isPalindrome("hello")); // Comparison fails
    }

    // === Condition: input requires normalization (spaces and case) ===
    @Test
    void testPalindromeWithSpacesAndCases() {
        assertTrue(PalindromeFixed.isPalindrome("A man a plan a canal Panama")); // Checks preprocessing
    }

    // === Condition: input has only one character (minimal valid input) ===
    @Test
    void testSingleCharacter() {
        assertTrue(PalindromeFixed.isPalindrome("a"));
    }

    // === Condition: input has even number of different characters ===
    @Test
    void testTwoDifferentChars() {
        assertFalse(PalindromeFixed.isPalindrome("ab"));
    }

    // === Condition: input is empty (edge case) ===
    @Test
    void testEmptyString() {
        assertTrue(PalindromeFixed.isPalindrome(""));
    }

    // === Extra: test identical two-char palindrome → check middle-end condition ===
    @Test
    void testTwoIdenticalChars() {
        assertTrue(PalindromeFixed.isPalindrome("aa"));
    }
}
