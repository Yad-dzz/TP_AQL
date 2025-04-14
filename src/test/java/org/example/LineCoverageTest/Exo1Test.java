package org.example.LineCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.tp1.exo1.PalindromeFixed;

public class Exo1Test {

    @Test
    void testPalindromeBasic() {
        assertTrue(PalindromeFixed.isPalindrome("madam")); // covers normal path
    }

    @Test
    void testPalindromeWithSpacesAndCases() {
        assertTrue(PalindromeFixed.isPalindrome("A man a plan a canal Panama")); // covers normalization
    }

    @Test
    void testNonPalindrome() {
        assertFalse(PalindromeFixed.isPalindrome("hello")); // covers false return
    }

    @Test
    void testEmptyString() {
        assertTrue(PalindromeFixed.isPalindrome("")); // covers edge case: empty
    }

    @Test
    void testNullInput() {
        assertThrows(NullPointerException.class, () -> PalindromeFixed.isPalindrome(null)); // covers null branch
    }
}
