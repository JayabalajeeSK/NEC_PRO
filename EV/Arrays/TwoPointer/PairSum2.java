package EV.Arrays.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

class B3_PairSum 
{
    public int[] twoSum(int[] nums, int target) 
    {
        // Check all pairs
        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = i + 1; j < nums.length; j++) 
            {
                int sum = nums[i] + nums[j];
                if (sum == target) 
                {
                    return new int[]{i, j}; // return indices of the pair
                }
            }
        }
        return new int[]{}; // if no pair found
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Read input array size, elements, and target
        // Example input:
        // 5
        // 2 7 11 15 20
        // 22
        int n = scanner.nextInt(); // size of array
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) 
        {
            nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt(); // target sum

        // Create object and call method
        B3_PairSum b3 = new B3_PairSum();
        int[] result = b3.twoSum(nums, target);

        // Output result
        if (result.length == 2) 
        {
            System.out.println("Indices : " + Arrays.toString(result));
            System.out.println("Values : [" + nums[result[0]] + ", " + nums[result[1]] + "]");
        } 
        else 
        {
            System.out.println("No two numbers found with sum = " + target);
        }
        scanner.close();
    }
}
// 5
// 2 7 11 15 20
// 22
// Indices : [0, 4]
// Values : [2, 20]