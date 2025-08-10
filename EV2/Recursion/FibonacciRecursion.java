package EV2.Recursion;

import java.util.Scanner;

public class FibonacciRecursion 
{

    // Recursive function to get nth Fibonacci number
    public static int fibonacci(int n) 
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) 
        {
            int fib = fibonacci(i);
            System.out.print(fib + " ");
            sum = sum + fib;
        }

        System.out.println("\nSum of Fibonacci numbers: " + sum);
        System.out.println("Nth Fibonacci term: " + fibonacci(n - 1));

        sc.close();
    }
}
// Enter number of terms: 5
// Fibonacci Series: 0 1 1 2 3 
// Sum of Fibonacci numbers: 7
// Nth Fibonacci term: 3
