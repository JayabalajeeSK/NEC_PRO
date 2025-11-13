package vsb.b.Arrays1;

import java.util.*;

public class A11_ArrayProblemsFunRunner extends A11_ArrayProblemsFun
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        // Enter array size: 5
        // Enter 5 elements:
        // 30 10 20 02 4

        System.out.print("Enter target for Linear Search: ");
        int target = sc.nextInt();
        System.out.println("Index: " + linearSearch(arr, target));
        // Enter target for Linear Search: 02
        // Index: 3

        System.out.print("Enter target for Binary Search: ");
        int target1 = sc.nextInt();
        System.out.println("Index: " + binarySearch(arr, target1));
        // Enter target for Binary Search: 4
        // Array elements are:
        // 2 4 10 20 30
        // Index: 1

        System.out.println("Enter Target sum value: ");
        int targetSum = sc.nextInt();
        System.out.println("Pair Sum of target: " + targetSum);
        findPairs(arr, targetSum);
        // Enter array size: 5
        // Enter 5 elements:
        // 30 10 20 02 4
        // Enter Target sum value:
        // 22
        // Pair Sum of target: 22
        // Pairs with sum 22:
        // (20, 2)

        System.out.println("Second Max: " + secondMax(arr));

        System.out.println("Enter nth value");
        int n = sc.nextInt();
        System.out.println(n+"th max: " + nthMax(arr, n));
        System.out.println(n+"th min: " + nthMin(arr, n));  
        // Second Max: 20
        // Enter nth value
        // 2
        // 2th max: 20
        // 2th min: 4

        System.out.println("Reversed Array:");
        reverseArray(arr);
        // Reversed Array:
        // Array elements are:
        // 4 2 20 10 30

        System.out.println("Zero's Moved to last:");
        moveZeros(arr);
        // Enter array size: 5
        // Enter 5 elements:
        // 3 0 1 0 2
        // Zero's Moved to last:
        // Array elements are:
        // 3 1 2 0 0
        // System.out.println("Is Sorted: " + isSortedAsc(arr));


        // ////////////////////////////////////////////
        // int arr1[] = get_1DArrayValues(5);
        // displayArrayEnhanced(arr1);

        sc.close();
    }

}
