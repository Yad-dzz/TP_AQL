package org.example.tp1.exo4;

public class QuadraticEquationFixed {
    public static double[] solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("a must not be zero");
        }

        double delta = (b * b) - (4 * a * c);
        if (delta < 0) {
            return new double[0]; // au lieu de null
        }

        if (delta == 0) {
            return new double[]{-b / (2 * a)};
        }

        return new double[]{
                (-b + Math.sqrt(delta)) / (2 * a),
                (-b - Math.sqrt(delta)) / (2 * a)
        };
    }
}