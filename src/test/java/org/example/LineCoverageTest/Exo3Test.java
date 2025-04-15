package org.example.LineCoverageTest;

import org.example.tp1.exo3.BinarySearchFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo3Test {

    @Test
    void testNullArray() {
        assertThrows(NullPointerException.class, () -> BinarySearchFixed.binarySearch(null, 5));
    }

    @Test
    void testEmptyArray() {
        assertEquals(-1, BinarySearchFixed.binarySearch(new int[]{}, 10));
    }

    @Test
    void testElementFound() {
        assertEquals(2, BinarySearchFixed.binarySearch(new int[]{1, 3, 5, 7, 9}, 5));
    }

    @Test
    void testElementNotFound() {
        assertEquals(-1, BinarySearchFixed.binarySearch(new int[]{1, 3, 5, 7}, 6));
    }
}
