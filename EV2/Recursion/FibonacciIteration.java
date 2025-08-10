package EV2.Recursion;

import java.util.Scanner;

public class FibonacciIteration 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0; 
        int second = 1; 

        int next = 0;

        int sum = 0;

        System.out.print("Fibonacci Series: ");

        if (n >= 1) 
        {
            System.out.print(first + " ");
            sum = sum + first;
        }

        if (n >= 2) 
        {
            System.out.print(second + " ");
            sum += second; //sum = sum + secodnd;
        }

        for (int i = 2; i < n; i++) 
        {  
            next = first + second;
            System.out.print(next + " ");

            sum = sum + next;

            first = second;
            second = next;
        }

        System.out.println("\nSum of Fibonacci numbers: " + sum);
        System.out.println(n+"th Fibonacci number: " + next);

        sc.close();
    }
}
// Enter number of terms: 5
// Fibonacci Series: 0 1 1 2 3
// Sum of Fibonacci numbers: 7
// 5th Fibonacci number: 3