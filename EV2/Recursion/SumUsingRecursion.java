package EV2.Recursion;

import java.util.Scanner;

public class SumUsingRecursion 
{
    public static int recursiveSum(int n) 
    {
        if (n == 1) 
        {
            return 1; // base case
        }
        return n + recursiveSum(n - 1); // recursive call
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = recursiveSum(n);
        System.out.println("Sum using recursion: " + sum);
        sc.close();
    }
}
// Enter a number: 6
// Sum using recursion: 21