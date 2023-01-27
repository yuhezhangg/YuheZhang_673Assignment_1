import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {
    private FibonacciNumber fibonacciNumber = new FibonacciNumber();
    private int input;
    private int output;

    @Test
    void fibonacciTest() {
        input = 6;
        output = fibonacciNumber.fibonacci(input);
        assertEquals(8, output);
    }

    @Test
    void outOfBoundary() {
        input = 100;
        output = fibonacciNumber.fibonacci(input);
        assertEquals(0, output);
    }
}