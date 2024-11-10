package org.example;// org.example.CalculatorTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(4, 2));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(4, 0));
    }

    // Additional tests (10 in total)
    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testSubtractNegativeNumbers() {
        assertEquals(-1, calculator.subtract(-3, -2));
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0, calculator.multiply(2, 0));
    }

    @Test
    public void testDivideNegativeNumbers() {
        assertEquals(-2.0, calculator.divide(-4, 2));
    }

    @Test
    public void testDivideResultDecimal() {
        assertEquals(1.5, calculator.divide(3, 2), 0.01);
    }
}
