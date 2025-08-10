package EV.Arrays.Basic;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertElementArrayList 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Step 1: Create ArrayList and get elements
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
        {
            list.add(sc.nextInt());
        }

        // Step 2: Get position & new element
        System.out.print("Enter position to insert (1 to " + (size + 1) + "): ");
        int pos = sc.nextInt();

        System.out.print("Enter new element: ");
        int newElement = sc.nextInt();

        // Step 3: Insert element (ArrayList handles shifting)
        list.add(pos - 1, newElement);

        // Step 4: Print updated list
        System.out.println("Updated list:");
        for (int num : list) 
        {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
// Enter number of elements: 5
// Enter 5 elements:
// 1 2 3 4 5
// Enter position to insert (1 to 6): 3
// Enter new element: 7
// Updated list:
// 1 2 7 3 4 5