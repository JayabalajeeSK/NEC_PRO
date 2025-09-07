package LTI.part1;

import java.util.*;

public class MaximumDifference 
{

    int maxDiff(int arr[], int n) 
    {
        int minElement = arr[0];
        int maxDiff = arr[1] - arr[0];

        for (int i = 1; i < n; i++) 
        {
            maxDiff = Math.max(maxDiff, arr[i] - minElement);

            minElement = Math.min(minElement, arr[i]);
        }
        return maxDiff;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        MaximumDifference obj = new MaximumDifference();
        System.out.println(obj.maxDiff(arr, n));
        sc.close();
    }
}
// 7
// 2 3 10 6 4 8 1
// 8

// 6
// 7 9 5 6 3 2
// 2