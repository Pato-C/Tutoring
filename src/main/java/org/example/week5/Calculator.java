package org.example.week5;

public class Calculator {
    public static void main(String[] args) {
        try {
            int result1 = divideNumbers(10, 2);
            System.out.println("Result 1: " + result1);

            int result2 = divideNumbers(8, 0);
            System.out.println("Result 2: " + result2);
        } catch (DivideByZeroException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static int divideNumbers(int dividend, int divisor) throws DivideByZeroException {
        if (divisor == 0) {
            throw new DivideByZeroException("Cannot divide by zero.");
        }

        return dividend / divisor;
    }
}
