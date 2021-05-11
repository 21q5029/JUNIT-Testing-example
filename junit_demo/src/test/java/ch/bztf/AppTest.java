package ch.bztf;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AppTest 
{

    @Test
    public void testAdd()
    {
        Calculate calculate = new Calculate();
        double expected = 6.0;
        double actual = calculate.add(1.0, 6.0);
        assertEquals(expected, actual, "Add two numbers");
        //Diesen Test habe ich extra falsch gemacht, 1+6 gibt natürlich nicht 6, ist einfach falsch für testzwecke
    }

    @Test
    public void testSubtract()
    {
        Calculate calculate = new Calculate();
        double expected = 4;
        double actual = calculate.subtract(5.0, 1.0);
        assertEquals(expected, actual, "Subtract two numbers");
    }

    @Test
    public void testMultiply()
    {
        Calculate calculate = new Calculate();
        double expected = 10.0;
        double actual = calculate.multiply(2.0, 5.0);
        assertEquals(expected, actual, "Multiply two numbers");
    }

    @Test
    public void testDivide()
    {
        Calculate calculate = new Calculate();
        double expected = 2.0;
        double actual = calculate.divide(10, 5.0);
        assertEquals(expected, actual, "Divide two numbers");
    }
}
