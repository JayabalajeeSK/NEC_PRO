package LTI.part4;

import java.util.*;

public class LongestDecreasingSubsequence 
{

    public static int longestDecreasingSubsequence(int[] A) 
    {
        List<Integer> tails = new ArrayList<>();
        for (int num : A) 
        {
            int left = 0, right = tails.size();

            while (left < right) 
            {
                int mid = (left + right) / 2;
                if (tails.get(mid) <= num) 
                {
                    right = mid;
                } 
                else 
                {
                    left = mid + 1;
                }
            }

            if (left < tails.size()) 
            {
                tails.set(left, num);
            } 
            else 
            {
                tails.add(num);
            }
        }
        return tails.size();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of tokens: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int result = longestDecreasingSubsequence(arr);
        System.out.println("Length of longest decreasing subsequence: " + result);

        sc.close();
    }
}
// Enter number of tokens: 5
// Enter 5 numbers: 
// 5 0 3 2 9
// Length of longest decreasing subsequence: 3