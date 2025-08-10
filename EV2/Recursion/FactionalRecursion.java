package EV2.Recursion;

import java.util.Scanner;

public class FactionalRecursion 
{
    public static int factorial(int n) 
    {
        if (n == 1) 
        {
            return 1; // base case
        } 
        else 
        {
            return n * factorial(n - 1); // recursive call
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); // create Scanner object

        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt(); // read user input

        if (num <= 0) 
        {
            System.out.println("Please enter a positive number.");
        } 
        else 
        {
            int result = factorial(num); // call recursive method
            System.out.println("Factorial of " + num + " is: " + result);
        }

        sc.close(); // close scanner
    }
}
// Enter a number to find its factorial: 5
// Factorial of 5 is: 120