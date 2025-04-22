package org.example.LineCoverageTest;

import org.example.tp1.exo4.QuadraticEquationFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo4Test {

    @Test
    void testLine_ThrowsExceptionWhenAIsZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquationFixed.solve(0, 2, 1); // covers line: if (a == 0)
        });
    }

    @Test
    void testLine_DeltaLessThanZero() {
        double[] result = QuadraticEquationFixed.solve(1, 0, 1); // covers line: delta < 0
        assertArrayEquals(new double[0], result);
    }

    @Test
    void testLine_DeltaEqualsZero() {
        double[] result = QuadraticEquationFixed.solve(1, 2, 1); // covers line: delta == 0
        assertArrayEquals(new double[]{-1.0}, result);
    }

    @Test
    void testLine_DeltaGreaterThanZero() {
        double[] result = QuadraticEquationFixed.solve(1, -3, 2); // covers the last return line
        assertArrayEquals(new double[]{2.0, 1.0}, result);
    }
}
