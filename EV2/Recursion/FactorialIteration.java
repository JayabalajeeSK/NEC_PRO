package EV2.Recursion;

import java.util.Scanner;

public class FactorialIteration 
{
    public static int factorial(int n) 
    {
        int result = 1;
        for (int i = 2; i <= n; i++) 
        {
            result = result * i; // multiply step-by-step
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();

        if (num <= 0) 
        {
            System.out.println("Please enter a positive number.");
        } 
        else 
        {
            int result = factorial(num);
            
            System.out.println("Factorial of " + num + " is: " + result);
        }

        sc.close();
    }
}
// Enter a number to find its factorial: 5
// Factorial of 5 is: 120