package EV.Arrays.TwoPointer.SlidingWindow;

import java.util.*;

public class WaterTankLeak 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] loss = new int[n];
        for (int i = 0; i < n; i++) 
        {
            loss[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int minLoss = Integer.MAX_VALUE;
        for (int i = 0; i <= n - k; i++) 
        {
            int sum = 0;
            for (int j = i; j < i + k; j++) 
            {
                sum = sum + loss[j];
            }
            
            if (sum < minLoss) 
            {
                minLoss = sum;
            }
        }

        System.out.println("Minimum water loss in " + k + " hours: " + minLoss);
        sc.close();
    }
}

// 6
// 4 2 12 1 7 8
// 2
// Minimum water loss in 2 hours: 6