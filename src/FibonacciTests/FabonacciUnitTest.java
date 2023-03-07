package FibonacciTests;

import Main.Fibonacci.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FabonacciUnitTest {

    @Test(expected = IllegalStateException.class)
    public void testForNegativeFibonacciIndex() {
        int input = -1;
        assertEquals(Fibonacci.fibonacci(input), IllegalStateException.class);
    }

    @Test
    public void testForPositiveFibonacciIndex(){
        int input = 10;
        int expectedValue = 55;
        String expectedFibonacciList = "0 1 1 2 3 5 8 13 21 34 55 ";
        assertEquals(Fibonacci.fibonacci(input), expectedValue);
        assertEquals(Fibonacci.fibonacciList(input), expectedFibonacciList);
    }

    @Test
    public void testForZeroFibonacciIndex(){
        int input = 0;
        int ExpectedValue = 0;
        String expectedFibonacciList = "0 ";
        assertEquals(Fibonacci.fibonacci(input), ExpectedValue);
        assertEquals(Fibonacci.fibonacciList(input), expectedFibonacciList);
    }

}
