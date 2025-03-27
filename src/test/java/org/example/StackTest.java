package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    void testPushAndPeek() {
        Stack stack = new Stack();
        stack.push(10);
        assertEquals(10, stack.peek());
    }

    @Test
    void testPop() {
        Stack stack = new Stack();
        stack.push(20);
        assertEquals(20, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        stack.push(30);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testSize() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(15);
        assertEquals(2, stack.size());
    }

    @Test
    void testPopThrowsExceptionWhenEmpty() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::pop);
    }
}