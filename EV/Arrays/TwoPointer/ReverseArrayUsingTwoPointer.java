package EV.Arrays.TwoPointer;

import java.util.Scanner;
public class ReverseArrayUsingTwoPointer 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Read size of the array
        // Example input: 5
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Read array elements
        // Example input: 10 20 30 40 50
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        // Initialize two pointers
        int left = 0, right = arr.length - 1;

        // Reverse the array using two pointers
        while (left < right) 
        {
            // Swap elements at left and right
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers
            left++;
            right--;
        }

        // Print reversed array
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
// 10 
// 20 30 40 50 60 70 80 90 100 199 
// 199 100 90 80 70 60 50 40 30 20

// 5
// 10 20 30 40 50
// 50 40 30 20 10 