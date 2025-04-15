package org.example.ConditionCoverageTest;

import org.example.tp1.exo3.BinarySearchFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo3Test {

    @Test
    void testCondition_arrayEqualsElement() {
        assertEquals(0, BinarySearchFixed.binarySearch(new int[]{5}, 5)); // true for array[mid] == element
    }

    @Test
    void testCondition_arrayLessThanElement() {
        assertEquals(1, BinarySearchFixed.binarySearch(new int[]{4, 8}, 8)); // true for array[mid] < element
    }

    @Test
    void testCondition_arrayGreaterThanElement() {
        assertEquals(0, BinarySearchFixed.binarySearch(new int[]{2, 6}, 2)); // false for array[mid] < element
    }
}
