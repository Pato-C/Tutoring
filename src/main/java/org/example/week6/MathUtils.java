package org.example.week6;

public class MathUtils {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero error!");
        }
        return a / b;
    }
}

