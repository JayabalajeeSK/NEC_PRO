package LTI.part4;

import java.util.Arrays;
import java.util.Scanner;

public class StudentsCandies 
{
    public static int candies(int n, int[] ratings) 
    {
        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        for (int i = 1; i < n; i++) 
        {
            if (ratings[i] > ratings[i - 1]) 
            {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) 
        {
            if (ratings[i] > ratings[i + 1]) 
            {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int total = 0;
        for (int c : candies) 
        {
            total = total + c;
        }
        return total;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ratings = new int[n];
        for (int i = 0; i < n; i++) 
        {
            ratings[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(candies(n, ratings));
    }
}
// 4  
// 1 2 2 4
// 6