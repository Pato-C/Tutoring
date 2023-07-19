package org.example.week6;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testAddition() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtraction() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testMultiplication() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.multiply(4, 3);
        assertEquals(12, result);
    }

    @Test
    public void testModulo() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.modulo(10, 3);
        assertEquals(1, result);
    }

    @Test
    public void testDivideByZero() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0));
    }
}
