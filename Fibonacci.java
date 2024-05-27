/**
 * Fibonacci class is a method used to calculate nth term 
 * in fibonacci sequence
 */

public class Fibonacci {
/**
 * Returns nth term in sequence
 * @param n position of term to return
 * @return nth term in sequence
 */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
/**
 * Main calls Fibonacci method which 
 * prints the 10th term of the sequence
 * @param args are n/a
 */
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result);
    }
}
