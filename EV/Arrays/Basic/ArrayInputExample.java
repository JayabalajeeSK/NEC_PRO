package EV.Arrays.Basic;

import java.util.Scanner;
public class ArrayInputExample 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Get array elements from the user
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }

        // Print array elements
        System.out.println("You entered:");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
// Enter 5 numbers:
// 1 3 5 7 8
// You entered:
// 1 3 5 7 8
