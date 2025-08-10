package EV.Arrays.TwoPointer;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Read number of elements and array values + target
        // Example input:
        // 5
        // 2 7 11 15 20
        // 22
        int n = scanner.nextInt(); // number of elements
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        // Read target value
        int target = scanner.nextInt();

        // Sort the array to apply two-pointer method
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        // Two-pointer approach
        while (left < right) 
        {
            int sum = arr[left] + arr[right];

            if (sum == target) 
            {
                System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
                found = true;
                break;
            } 
            else if (sum < target) 
            {
                left++;  // Move right to increase sum
            } 
            else 
            {
                right--; // Move left to decrease sum
            }
        }

        // If no such pair is found
        if (!found) 
        {
            System.out.println("No such pair found.");
        }

        scanner.close();
    }
}
// 5 
// 2 7 11 15 20
// 22
// Pair found: 2 + 20 = 22