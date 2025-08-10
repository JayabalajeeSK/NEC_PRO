package EV.Arrays.TwoPointer.SlidingWindow;

import java.util.*;

public class EnergyDrinkBoost 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] energy = new int[n];
        for (int i = 0; i < n; i++) 
        {
            energy[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int windowSum = 0;
        int maxSum;
        for (int i = 0; i < k; i++) 
        {
            windowSum = windowSum + energy[i];

        }
        maxSum = windowSum;

        for (int i = k; i < n; i++) 
        {
            windowSum = windowSum + energy[i] - energy[i - k];
            if (windowSum > maxSum) 
            {
                maxSum = windowSum;
            }
        }

        System.out.println("Maximum energy in " + k + " days: " + maxSum);
        sc.close();
    }
}
// 7
// 2 1 5 1 3 2 6
// 3
// Maximum energy in 3 days: 11
