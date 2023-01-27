//This is the Problem 6 of CS673 Assignment 1
//Name: Yuhe Zhang

public class FibonacciNumber {
    public int fibonacci(int n) {
        if (n >= 100) return 0;

        if (n <= 1) {
            return n;
        } else {
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }
}
