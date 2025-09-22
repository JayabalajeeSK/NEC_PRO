package LTI.part5;

import java.util.*;

public class SubarraySumEqualsK 
{
    public static int subarraySum(int[] nums, int k) 
    {
        int count = 0;
        Map<Integer, Integer> prefixSumFreq = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < nums.length; i++) 
        {
            sum = sum + nums[i]; 

            if (sum == k) count++; 

            if (prefixSumFreq.containsKey(sum - k)) 
            {
                count = count + prefixSumFreq.get(sum - k);
            }

            prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = subarraySum(nums, k);
        System.out.println("Number of subarrays with sum " + k + " = " + result);

        sc.close();
    }
}
// Enter number of elements: 3
// Enter array elements:
// 1 1 1
// Enter value of k: 2
// Number of subarrays with sum 2 = 2