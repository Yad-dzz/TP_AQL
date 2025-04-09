package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FibonacciTest {
    @Test
    public void testFibonacci_NegativeInput_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }
    @Test
    void testFibonacciBaseCases() {
        assertEquals(0, Fibonacci.fibonacci(0), "Fibonacci(0) should return 0");
        assertEquals(1, Fibonacci.fibonacci(1), "Fibonacci(1) should return 1");
    }

    @Test
    void testFibonnaciSmallValues(){
        assertEquals(1,Fibonacci.fibonacci(2));
        assertEquals(2,Fibonacci.fibonacci(3));
        assertEquals(3,Fibonacci.fibonacci(4));
        assertEquals(5,Fibonacci.fibonacci(2));
    }
}
