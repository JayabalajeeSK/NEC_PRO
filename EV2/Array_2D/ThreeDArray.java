package EV2.Array_2D;

import java.util.Scanner;

public class ThreeDArray 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Get dimensions from user
        System.out.print("Enter depth (number of 2D matrices): ");
        int depth = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create 3D array
        int[][][] arr = new int[depth][rows][cols];

        // Input elements
        System.out.println("Enter elements:");
        for (int d = 0; d < depth; d++) 
        {
            System.out.println("Matrix " + (d + 1) + ":");
            for (int i = 0; i < rows; i++) 
            {
                for (int j = 0; j < cols; j++) 
                {
                    arr[d][i][j] = sc.nextInt();
                }
            }
        }

        // Print elements
        System.out.println("\n3D Array:");
        for (int d = 0; d < depth; d++) 
        {
            System.out.println("Matrix " + (d + 1) + ":");
            for (int i = 0; i < rows; i++) 
            {
                for (int j = 0; j < cols; j++) 
                {
                    System.out.print(arr[d][i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
// Enter depth (number of 2D matrices): 2
// Enter number of rows: 2
// Enter number of columns: 2
// Enter elements:
// Matrix 1:
// 1 3
// 2 4
// Matrix 2:
// 2 5 
// 7 9

// 3D Array:
// Matrix 1:
// 1 3
// 2 4

// Matrix 2:
// 2 5
// 7 9