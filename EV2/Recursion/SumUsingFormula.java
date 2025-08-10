package EV2.Recursion;

import java.util.Scanner;

public class SumUsingFormula
{
    public static int sumUsingFormula(int n) 
    {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (n): ");
        int n = sc.nextInt();

        if (n <= 0) 
        {
            System.out.println("Please enter a positive number.");
        } 
        else 
        {
            System.out.println("Using Formula   : " + sumUsingFormula(n));
        }

        sc.close();
    }
}
