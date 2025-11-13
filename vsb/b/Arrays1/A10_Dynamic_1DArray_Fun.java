package vsb.b.Arrays1;

import java.util.Scanner;

public class A10_Dynamic_1DArray_Fun 
{

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) 
    {

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = get_1DArrayValues(size); 
        displayArrayEnhanced(arr); 
        displayArrayNormal(arr);

        sc.close();
    }

    //////////////////////////////////////////////////////////////
    static int[] get_1DArrayValues(int size) 
    {
        
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) 
        {
            arr[i] = sc.nextInt(); 
        }
        return arr; 
    }

   
    static void displayArrayEnhanced(int[] arr) 
    {
        System.out.println("Array elements are:");
        for (int val : arr) 
        {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    

    static void displayArrayNormal(int[] arr) 
    {
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
// Enter size of array: 5
// Enter 5 elements:
// 3 1 7 9 3
// Array elements are:
// 3 1 7 9 3
// Array elements are:
// 3 1 7 9 3