package EV.Arrays.TwoPointer.SlidingWindow;

import java.util.*;

public class WaterTankLeakCons 
{
    public static void main(String[] args) 
    {
        int[] losses = {4, 2, 12, 1, 7, 8};
        int k = 2;

        Arrays.sort(losses);  // Sort in ascending order

        int minLoss = 0;
        for (int i = 0; i < k; i++) 
        {
            minLoss =  minLoss + losses[i];
        }

        System.out.println("Minimum water loss in " + k + " hours: " + minLoss);
    }
}
// Minimum water loss in 2 hours: 3
