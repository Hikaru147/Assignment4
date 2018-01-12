package edu.ldsbc.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void subtract() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(4,2) );
    }

    @Test
    public void divide() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(2,1) );

    }

    @Test
    public void multiply() throws Exception {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiply(2,1) );
    }

    @Test
    public void add() throws Exception {
        Calculator calculator = new Calculator();

        assertEquals(2,calculator.add(1,1));
        assertEquals(0,calculator.add(-1,1));
        assertNotEquals(5,calculator.add(-1,1));

        assertEquals(2,calculator.subtract(3,1));

        assertEquals(2,calculator.divide(4,2));


    }

}