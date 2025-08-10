package EV.Arrays.TwoPointer.SlidingWindow;

import java.util.Scanner;

public class FindDuplicateUsingXOR 
{

    // Function to find the duplicate using XOR
    public static int findDuplicate(int[] arr) 
    {
        int answer = 0;
        int n = arr.length;

        // XOR all array elements
        for (int i = 0; i < n; i++) 
        {
            answer = (answer) ^ arr[i];
        }

        // XOR all values from 1 to n - 1
        for (int i = 1; i < n; i++) 
        {
            answer = (answer) ^ i;
        }

        return answer;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Example Input:
        // 4
        // 1 3 2 1
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements (with one duplicate):");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        int duplicate = findDuplicate(arr);

        System.out.println("Duplicate element is: " + duplicate);

        scanner.close();
    }
}
// Enter number of elements: 4
// Enter 4 elements (with one duplicate):
// 1 3 2 1
// Duplicate element is: 1