package Hexaware.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListInsertRemove 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
        {
            list.add(sc.nextInt());
        }


        System.out.print("Enter position to insert (1 to " + (list.size() + 1) + "): ");
        int insertPos = sc.nextInt();

        System.out.print("Enter new element to insert: ");
        int newElement = sc.nextInt();

        list.add(insertPos - 1, newElement);


        System.out.println("List after insertion:");
        for (int num : list) 
        {
            System.out.print(num + " ");
        }
        System.out.println();


        System.out.print("Enter position to remove (1 to " + list.size() + "): ");
        int removePos = sc.nextInt();
        if (removePos >= 1 && removePos <= list.size()) 
        {
            int removed = list.remove(removePos - 1);
            System.out.println("Removed element: " + removed);
        } 
        else 
        {
            System.out.println("Invalid position! No element removed.");
        }


        System.out.println("List after removal:");
        for (int num : list) 
        {
            System.out.print(num + " ");
        }
        System.out.println();


        System.out.print("Enter the size of the array 1: ");
        int n = sc.nextInt();
        int[] arr = new int[n];


        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }


        List<Integer> list1 = new ArrayList<>();
        for (int num : arr) 
        {
            list1.add(num);
        }

        System.out.println("Array converted to list: " + list);

        sc.close();
    }
}
// Enter number of elements: 5
// Enter 5 elements:
// 1 3 5 6 8
// Enter position to insert (1 to 6): 5
// Enter new element to insert: 5
// List after insertion:
// 1 3 5 6 5 8
// Enter position to remove (1 to 6): 3
// Removed element: 5
// List after removal:
// 1 3 6 5 8
// Enter the size of the array 1: 5
// Enter 5 elements:
// 1 4 6 8 9
// Array converted to list: [1, 3, 6, 5, 8]