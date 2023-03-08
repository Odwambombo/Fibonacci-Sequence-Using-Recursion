
import org.junit.Test;
import fibonacci.Fibonacci;
import static org.junit.Assert.assertEquals;

public class FibonacciUnitTest {

    @Test(expected = IllegalStateException.class)
    public void testForNegativeFibonacciIndex() {
        int input = -1;
        assertEquals(Fibonacci.getFibonacciNumber(input), IllegalStateException.class);
    }

    @Test
    public void testForPositiveFibonacciIndex(){
        int input = 10;
        int expectedValue = 55;
        String expectedFibonacciList = "0 1 1 2 3 5 8 13 21 34 55 ";
        assertEquals(Fibonacci.getFibonacciNumber(input), expectedValue);
        assertEquals(Fibonacci.getFibonacciList(input), expectedFibonacciList);
    }

    @Test
    public void testForZeroFibonacciIndex(){
        int input = 0;
        int ExpectedValue = 0;
        String expectedFibonacciList = "0 ";
        assertEquals(Fibonacci.getFibonacciNumber(input), ExpectedValue);
        assertEquals(Fibonacci.getFibonacciList(input), expectedFibonacciList);
    }

}
