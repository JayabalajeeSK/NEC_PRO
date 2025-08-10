package EV2.Recursion;

import java.util.Scanner;

public class SumUsingIteration 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) 
        {
            sum = sum + i;
        }

        System.out.println("Sum using iteration: " + sum);
        sc.close();
    }
}
// Enter a number: 5
// Sum using iteration: 15