package vsb.b.Arrays1;

import java.util.Scanner;

public class A8_TwoDArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
       
        int[][] arr = new int[rows][cols];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
   
        System.out.println("\nThe 2D array (Normal loop):");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nThe 2D array (Enhanced for loop):");
        for (int[] row : arr) 
        { 
            for (int value : row) 
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// Enter number of rows: 3
// Enter number of columns: 4
// Enter elements:
// 1 2 3 4 
// 6 7 8 5
// 3 5 8 9

// The 2D array (Normal loop):
// 1 2 3 4
// 6 7 8 5
// 3 5 8 9

// The 2D array (Enhanced for loop):
// 1 2 3 4
// 6 7 8 5 
// 3 5 8 9