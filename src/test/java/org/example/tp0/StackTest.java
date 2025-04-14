package org.example.tp0;

import org.example.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack stack;
    @BeforeEach
    void intialize(){
         this.stack = new Stack();
    }
    @Test
    void testPushAndPeek() {
        stack.push(10);
        assertEquals(10, stack.peek());
    }

    @Test
    void testPop() {
        stack.push(20);
        assertEquals(20, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(30);
        assertFalse(stack.isEmpty());
    }

    @Test
    void testSize() {
        stack.push(5);
        stack.push(15);
        assertEquals(2, stack.size());
    }

    @Test
    void testPopThrowsExceptionWhenEmpty() {
        assertThrows(IllegalStateException.class, ()-> stack.pop());
    }
    @Test
    void testPeekThrowsExceptionWhenEmpty() {
        assertThrows(IllegalStateException.class, () -> stack.peek());
    }
    @Test
    void testPushMultipleElements() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, stack.peek());
    }

    @Test
    void testPopMultipleElements() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertAll(() -> assertEquals(3, stack.pop()),
                () -> assertEquals(2, stack.pop()),
                () -> assertEquals(1, stack.pop()),
                () -> assertTrue(stack.isEmpty())
        );
    }

    @Test
    void testSizeAfterOperations() {
        stack.push(10);
        stack.push(20);
        stack.pop();
        assertEquals(1, stack.size());
        stack.pop();
        assertEquals(0, stack.size());
    }

}