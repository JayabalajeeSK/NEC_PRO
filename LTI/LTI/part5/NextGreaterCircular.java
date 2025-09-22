package LTI.part5;

import java.util.*;

public class NextGreaterCircular 
{
    public static int[] findNextGreater(int[] nums) 
    {
        int n = nums.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) 
        {
            ans[i] = -1;
            for (int j = 1; j < n; j++) 
            {
                int next = nums[(i + j) % n]; 
                if (next > nums[i]) 
                {
                    ans[i] = next;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }

        int[] result = findNextGreater(nums);

        System.out.println("Next Greater Elements (Circular):");
        for (int val : result) 
        {
            System.out.print(val + " ");
        }
        sc.close();
    }
}
// Enter number of elements: 3
// Enter elements:
// 1 2 1
// Next Greater Elements (Circular):
// 2 -1 2 