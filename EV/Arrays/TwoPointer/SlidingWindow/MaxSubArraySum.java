package EV.Arrays.TwoPointer.SlidingWindow;

import java.util.Scanner;

public class MaxSubArraySum
{
    public int maxSubArray(int[] nums) 
    {
        int maximum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i <= nums.length - 1; i++) 
        {
            sum = sum + nums[i];

            if (sum > maximum) 
            {
                maximum = sum;
            }

            if (sum < 0) 
            {
                sum = 0;
            }
        }

        return maximum; // outside for loop
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Read size and elements of the array
        // Example input:
        // 5
        // 5 4 -1 7 8
        int n = scanner.nextInt(); // array size
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) 
        {
            nums[i] = scanner.nextInt();
        }

        MaxSubArraySum obj = new MaxSubArraySum();
        int result = obj.maxSubArray(nums);

        // Print result
        System.out.println("Maximum subarray sum is: " + result);

        scanner.close();
    }
}
// 5
// 5 4 -1 7 8
// Maximum subarray sum is: 23
