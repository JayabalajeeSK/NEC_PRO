package CollectionsTopic.Queue;
import java.util.*;

public class EnergyDrinkBoostDeque 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input size and array
        int n = sc.nextInt();
        int[] energy = new int[n];
        for (int i = 0; i < n; i++) 
        {
            energy[i] = sc.nextInt();
        }

        // Input window size
        int k = sc.nextInt();

        // Use deque to simulate the sliding window
        Deque<Integer> window = new ArrayDeque<>();
        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < n; i++) 
        {
            window.addLast(energy[i]);
            windowSum = windowSum + energy[i];

            // Keep window size to k
            if (window.size() > k) 
            {
                windowSum = windowSum - window.removeFirst();
            }

            // Update maxSum when window is full
            if (window.size() == k) 
            {
                maxSum = Math.max(maxSum, windowSum);
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