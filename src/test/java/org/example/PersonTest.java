package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testGetFullName() {
        Person person = new Person("Merabet", "Yadine", 25);
        assertEquals("Merabet Yadine", person.getFullName());
    }

    @Test
    void testIsAdult_True() {
        Person person = new Person("Merabet", "Yadine", 18);
        assertTrue(person.isAdult());
    }

    @Test
    void testIsAdult_False() {
        Person person = new Person("Merabet", "Yadine", 17);
        assertFalse(person.isAdult());
    }
    @Test
    void testIsNegativeAge() {
        //Person person = new Person("Merabet", "Yadine", 18);
        assertThrows(IllegalArgumentException.class, () -> new Person("Merabet", "Yadine", -5));
    }
    @Test
    void testIsEmptyName() {
        //Person person = new Person("Merabet", "", 18);
        assertThrows(IllegalArgumentException.class, () -> new Person("Merabet", "", 18) );
    }
}
