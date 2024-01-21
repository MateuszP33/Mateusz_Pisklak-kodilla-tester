package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    Calculator calculator = new Calculator();
    int a = 5;
    int b = 8;

    @Test
    public void testSum() {

        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testPower() {
        double powerResult = calculator.power(a);
        assertEquals(25, powerResult, 0.1);
        double c = -5.4;
        double powerResultminus = calculator.power(c);
        assertEquals(29.16, powerResultminus, 0.1);
        int d = 0;
        double powerResultzero = calculator.power(d);
        assertEquals(0, powerResultzero, 0.1);
    }

}

