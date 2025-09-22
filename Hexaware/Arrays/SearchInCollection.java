package Hexaware.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInCollection 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            list.add(sc.nextInt());
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        if (list.contains(key)) 
        {
            System.out.println("Element found in the list.");
        } 
        else 
        {
            System.out.println("Element not found in the list.");
        }

        int index = list.indexOf(key);
        if (index != -1) 
        {
            System.out.println("Element found at position: " + (index + 1));
        } 
        else 
        {
            System.out.println("Element not found in the list.");
        }

        sc.close();
    }
}
// Enter number of elements: 5
// Enter 5 elements:
// 1 5 8 3 6
// Enter element to search: 5
// Element found in the list.
// Element found at position: 2