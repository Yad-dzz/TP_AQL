package org.example.ConditionCoverageTest;

import org.example.tp1.exo4.QuadraticEquationFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo4Test {

    @Test
    void testCondition_AEqualsZero_True() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquationFixed.solve(0, 5, 1);
        });
    }

    @Test
    void testCondition_AEqualsZero_False() {
        double[] result = QuadraticEquationFixed.solve(1, 5, 1);
        assertNotNull(result);
    }

    @Test
    void testCondition_DeltaLessThanZero_True() {
        double[] result = QuadraticEquationFixed.solve(1, 0, 1); // delta = -4
        assertArrayEquals(new double[0], result);
    }

    @Test
    void testCondition_DeltaLessThanZero_False() {
        double[] result = QuadraticEquationFixed.solve(1, 2, 1); // delta = 0
        assertArrayEquals(new double[]{-1.0}, result);
    }

    @Test
    void testCondition_DeltaEqualsZero_True() {
        double[] result = QuadraticEquationFixed.solve(1, 2, 1); // delta == 0
        assertArrayEquals(new double[]{-1.0}, result);
    }

    @Test
    void testCondition_DeltaEqualsZero_False() {
        double[] result = QuadraticEquationFixed.solve(1, -3, 2); // delta = 1
        assertArrayEquals(new double[]{2.0, 1.0}, result);
    }
}
