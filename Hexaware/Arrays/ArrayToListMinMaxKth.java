package Hexaware.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayToListMinMaxKth 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) 
        {
            list.add(num);
        }

        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);

        System.out.print("Enter k (to find kth min and max): ");
        int k = sc.nextInt();

        Collections.sort(list);

        if (k >= 1 && k <= list.size()) 
        {
            int kthMin = list.get(k - 1);          
            int kthMax = list.get(list.size() - k); 

            System.out.println(k + "th minimum value: " + kthMin);
            System.out.println(k + "th maximum value: " + kthMax);
        } 
        else 
        {
            System.out.println("Invalid k! It should be between 1 and " + list.size());
        }

        sc.close();
    }
}
// Enter number of elements: 5
// Enter 5 elements:
// 1 4 7 3 2  
// Minimum value: 1
// Maximum value: 7
// Enter k (to find kth min and max): 2
// 2th minimum value: 2
// 2th maximum value: 4
//