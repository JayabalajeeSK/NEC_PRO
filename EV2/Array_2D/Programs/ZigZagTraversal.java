package EV2.Array_2D.Programs;

import java.util.Scanner;

public class ZigZagTraversal 
{

    public static void printZigZag(int[][] mat) 
    {
        int rows = mat.length;
        int cols = mat[0].length;

        System.out.println("\nZig-Zag Order:");
        for (int i = 0; i < rows; i++) 
        {
            if (i % 2 == 0) 
            { 
                // Left to right
                for (int j = 0; j < cols; j++) 
                {
                    System.out.print(mat[i][j] + " ");
                }
            } 
            else 
            { 
                // Right to left
                for (int j = cols - 1; j >= 0; j--) 
                {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Get rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

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

        // Print original matrix
        System.out.println("\nOriginal Matrix:");
        for (int[] row : arr) 
        {
            for (int value : row) 
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // Print zig-zag
        printZigZag(arr);

        sc.close();
    }
}
// Enter number of rows: 3
// Enter number of columns: 3
// Enter elements:
// 1 2 3 
// 4 5 6 
// 7 8 9

// Original Matrix:
// 1 2 3
// 4 5 6
// 7 8 9

// Zig-Zag Order:
// 1 2 3 6 5 4 7 8 9