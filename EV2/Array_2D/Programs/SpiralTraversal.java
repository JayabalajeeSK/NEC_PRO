package EV2.Array_2D.Programs;

import java.util.Scanner;

public class SpiralTraversal 
{

    public static void printSpiral(int[][] mat) 
    {
        int top = 0;
        int bottom = mat.length - 1;
        int left = 0;
        int right = mat[0].length - 1;

        System.out.println("\nSpiral Order:");
        while (top <= bottom && left <= right) 
        {
            // Traverse from Left to Right
            for (int i = left; i <= right; i++) 
            {
                System.out.print(mat[top][i] + " ");
            }
            top++;

            // Traverse from Top to Bottom
            for (int i = top; i <= bottom; i++) 
            {
                System.out.print(mat[i][right] + " ");
            }
            right--;

            // Traverse from Right to Left
            if (top <= bottom) 
            {
                for (int i = right; i >= left; i--) 
                {
                    System.out.print(mat[bottom][i] + " ");
                }
                bottom--;
            }

            // Traverse from Bottom to Top
            if (left <= right) 
            {
                for (int i = bottom; i >= top; i--) 
                {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
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

        // Print spiral
        printSpiral(arr);

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

// Spiral Order:
// 1 2 3 6 9 8 7 4 5 
