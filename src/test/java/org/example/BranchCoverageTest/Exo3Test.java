package org.example.BranchCoverageTest;

import org.example.tp1.exo3.BinarySearchFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo3Test {

    @Test
    void testBranch_ElementAtStart() {
        assertEquals(0, BinarySearchFixed.binarySearch(new int[]{2, 4, 6}, 2)); // Hit return in first if
    }

    @Test
    void testBranch_ElementAtEnd() {
        assertEquals(2, BinarySearchFixed.binarySearch(new int[]{2, 4, 6}, 6)); // Go through else if
    }

    @Test
    void testBranch_ElementInMiddle() {
        assertEquals(1, BinarySearchFixed.binarySearch(new int[]{2, 4, 6}, 4)); // Hit return in mid
    }

    @Test
    void testBranch_ElementAbsentHigh() {
        assertEquals(-1, BinarySearchFixed.binarySearch(new int[]{1, 2, 3}, 9)); // Loop exits
    }

    @Test
    void testBranch_ElementAbsentLow() {
        assertEquals(-1, BinarySearchFixed.binarySearch(new int[]{4, 5, 6}, 2)); // Loop exits
    }

    @Test
    void testSingleElementAbsent() {
        assertEquals(-1, BinarySearchFixed.binarySearch(new int[]{8}, 4));
    }

    @Test
    void testSingleElementPresent() {
        assertEquals(0, BinarySearchFixed.binarySearch(new int[]{4}, 4));
    }
}
