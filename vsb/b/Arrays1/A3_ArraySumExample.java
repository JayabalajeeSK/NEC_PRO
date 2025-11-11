package vsb.b.Arrays1;

import java.util.Scanner;

public class A3_ArraySumExample 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        int sum = 0;

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i]; 
        }

        System.out.println("You entered:");
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }

        System.out.println("\nSum of elements: " + sum);
        sc.close();
    }
}
// Enter number of elements: 5
// Enter 5 numbers:
// 1 4 6 8 9
// You entered:
// 1 4 6 8 9
// Sum of elements: 28