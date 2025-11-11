package vsb.b.Arrays1;

import java.util.Scanner;

public class A2_ArrayInputExample 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt();
        }

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