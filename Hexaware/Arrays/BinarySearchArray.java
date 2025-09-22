package Hexaware.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];


        System.out.println("Enter " + n + " elements (unsorted allowed):");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

 
        int low = 0, high = n - 1;
        int index = -1; 
        while (low <= high) 
        {
            int mid = low + (high - low) / 2; 
            if (arr[mid] == key) 
            {
                index = mid;
                break;
            } 
            else if (arr[mid] < key) 
            {
                low = mid + 1;
            } 
            else 
            {
                high = mid - 1;
            }
        }


        if (index != -1) 
        {
            System.out.println("Element found at index: " + index);
        } 
        else 
        {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
// Enter the size of the array: 5
// Enter 5 elements (unsorted allowed):
// 1 3 5 7 4
// Sorted array: 1 3 4 5 7 
// Enter element to search: 5
// Element found at index: 3