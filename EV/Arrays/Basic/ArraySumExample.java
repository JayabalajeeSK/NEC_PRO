package EV.Arrays.Basic;

import java.util.Scanner;
public class ArraySumExample 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Get array size
        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        // Input elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i]; // Add to sum while reading
        }

        // Print elements
        System.out.println("You entered:");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }

        // Print sum
        System.out.println("\nSum of elements: " + sum);

        sc.close();
    }
}
// Enter 5 numbers:
// 1 3 7 2 4
// You entered:
// 1 3 7 2 4
// Sum of elements: 17