package org.example.BranchCoverageTest;

import org.example.tp1.exo4.QuadraticEquationFixed;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Exo4Test {

    @Test
    void testBranch_AIsZero_TrueBranch() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquationFixed.solve(0, 1, 1); // a == 0: true
        });
    }

    @Test
    void testBranch_AIsZero_FalseBranch() {
        double[] result = QuadraticEquationFixed.solve(1, 1, 1); // a == 0: false
        assertNotNull(result);
    }

    @Test
    void testBranch_DeltaLessThanZero_TrueBranch() {
        double[] result = QuadraticEquationFixed.solve(1, 0, 1); // delta < 0: true
        assertArrayEquals(new double[0], result);
    }

    @Test
    void testBranch_DeltaLessThanZero_FalseBranch() {
        double[] result = QuadraticEquationFixed.solve(1, 2, 1); // delta < 0: false
        assertArrayEquals(new double[]{-1.0}, result);
    }

    @Test
    void testBranch_DeltaEqualsZero_TrueBranch() {
        double[] result = QuadraticEquationFixed.solve(1, 2, 1); // delta == 0: true
        assertArrayEquals(new double[]{-1.0}, result);
    }

    @Test
    void testBranch_DeltaEqualsZero_FalseBranch() {
        double[] result = QuadraticEquationFixed.solve(1, -3, 2); // delta == 0: false
        assertArrayEquals(new double[]{2.0, 1.0}, result);
    }
}

