package EV2.Array_2D.Programs;


import java.util.Scanner;

public class TransposeSymmetricMatrix 
{

    // Transpose using new array
    public static int[][] transposeMatrix(int[][] mat) 
    {
        int rows = mat.length;
        int cols = mat[0].length;

        int[][] trans = new int[cols][rows]; // swapped dimensions

        for (int i = 0; i < rows; i++) 
        {     
            for (int j = 0; j < cols; j++) 
            { 
                trans[j][i] = mat[i][j];
            }
        }

        System.out.println("\nMatrix after Transpose:");
        print2DArray(trans);

        return trans; // return the transposed matrix
    }

    // Check if symmetric (only for square matrices)
    public static boolean isSymmetric(int[][] mat) 
    {
        int rows = mat.length;
        int cols = mat[0].length;

        if (rows != cols) 
        {
            return false; // not a square matrix
        }

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (mat[i][j] != mat[j][i]) 
                {
                    return false;
                }
            }
        }
        return true;
    }

    // Print using enhanced for loop
    public static void print2DArray(int[][] mat) 
    {
        for (int[] row : mat) 
        {
            for (int value : row) 
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
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

        System.out.println("\nOriginal Matrix:");
        print2DArray(arr);

        // Get the transposed matrix
        transposeMatrix(arr);

        // Check symmetry
        if (isSymmetric(arr)) 
        {
            System.out.println("\nThe matrix is symmetric.");
        } 
        else 
        {
            System.out.println("\nThe matrix is NOT symmetric.");
        }

        sc.close();
    }
}
// Enter number of rows: 2
// Enter number of columns: 3
// Enter elements:
// 1 2 3
// 4 5 6

// Original Matrix:
// 1 2 3
// 4 5 6

// Matrix after Transpose:
// 1 4
// 2 5
// 3 6

// The matrix is NOT symmetric.


// Enter number of rows: 2
// Enter number of columns: 2
// Enter elements:
// 1 2
// 2 8

// Original Matrix:
// 1 2
// 2 8

// Matrix after Transpose:
// 1 2
// 2 8

// The matrix is symmetric.