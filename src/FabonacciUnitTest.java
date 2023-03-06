import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class FabonacciUnitTest {

    @org.junit.Test(expected = IllegalStateException.class)
    public void testForNegativeFibonacciIndex() {
        int input = -1;
        String ExpectedResult = "Please enter a positive number there is no negative number in fibonacci Sequence!";
        assertEquals(Fibonacci.fibonacci(input), ExpectedResult);
    }

    @org.junit.Test(expected = InputMismatchException.class)
    public void testForForeignCharactersFibonacciIndex() {
        Scanner scanner = new Scanner("5bx");
        int input = scanner.nextInt();
        String ExpectedResult = "Please enter a integer value only which is your Fibonacci Index";
        assertEquals(Fibonacci.fibonacci(input), ExpectedResult);
    }

    @org.junit.Test
    public void testForPositiveFibonacciIndex(){
        int input = 10;
        int expectedValue = 55;
        String expectedFibonacciList = "0 1 1 2 3 5 8 13 21 34 55 ";
        assertEquals(Fibonacci.fibonacci(input), expectedValue);
        assertEquals(Fibonacci.fibonacciList(input), expectedFibonacciList);
    }

    @org.junit.Test
    public void testForZeroFibonacciIndex(){
        int input = 0;
        int ExpectedValue = 0;
        String expectedFibonacciList = "0 ";
        assertEquals(Fibonacci.fibonacci(input), ExpectedValue);
        assertEquals(Fibonacci.fibonacciList(input), expectedFibonacciList);
    }

}
