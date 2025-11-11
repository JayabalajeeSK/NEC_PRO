package vsb.b.Arrays1;

import java.util.ArrayList;
import java.util.Scanner;

public class A6_InserRemoveElementArrayList {
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

        System.out.print("Enter position to insert (1 to " + (size + 1) + "):");
        int pos = sc.nextInt();

        System.out.print("Enter new element: ");
        int newElement = sc.nextInt();

        list.add(pos - 1, newElement);


        list.remove(Integer.valueOf(4));

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
// 1 4 6 4 7
// Enter position to insert (1 to 6):3
// Enter new element: 9
// Updated list:
// 1 9 6 4 7
