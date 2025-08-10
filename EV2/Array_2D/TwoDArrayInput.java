package EV2.Array_2D;

import java.util.Scanner;

public class TwoDArrayInput 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Get rows and columns from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create 2D array
        int[][] arr = new int[rows][cols];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print using normal loop
        System.out.println("\nThe 2D array (Normal loop):");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Print using enhanced for loop
        System.out.println("\nThe 2D array (Enhanced for loop):");
        for (int[] row : arr) 
        {   // row is a 1D array
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
// Enter number of columns: 3
// Enter elements:
// 1 2 4
// 3 4 6
// 6 8 9

// The 2D array (Normal loop):
// 1 2 4
// 3 4 6
// 6 8 9

// The 2D array (Enhanced for loop):
// 1 2 4
// 3 4 6
// 6 8 9