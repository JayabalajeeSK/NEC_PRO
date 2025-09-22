package Hexaware.Arrays;

import java.util.Scanner;

public class ArrayTraversal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }


        System.out.print("Traversal using for loop: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        System.out.print("Traversal using for-each loop: ");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        System.out.println();


  
        System.out.print("Conditional traversal: ");
        for (int num : arr) 
        {
            if ((num & 1) == 0) 
            {  
                System.out.print(num + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}
// Enter the size of the array: 5
// Enter 5 elements:
// 1 2 3 4 5
// Traversal using for loop: 1 2 3 4 5
// Traversal using for-each loop: 1 2 3 4 5
// Conditional traversal: 2 4