package EV2.Array_2D.Rotation;

import java.util.Scanner;

public class AntiClockwiseRotation 
{

    // Rotate Matrix Anti-Clockwise (square matrix only)
    public static void rotateMatrixAntiClockwise(int[][] mat) 
    {
        int N = mat.length;
        for (int x = 0; x < N / 2; x++) 
        {
            for (int y = x; y < N - 1 - x; y++) 
            {
                int temp = mat[x][y];
                mat[x][y] = mat[y][N - 1 - x];
                mat[y][N - 1 - x] = mat[N - 1 - x][N - 1 - y];
                mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];
                mat[N - 1 - y][x] = temp;
            }
        }
    }

    // Print using enhanced for loop
    public static void print2DArray(int[][] mat) {
        for (int[] row : mat) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Get rows and columns from user
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if (rows != cols) 
        {
            System.out.println("Error: Rotation works only for square matrices.");
            sc.close();
            return;
        }

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

        // Rotate once
        rotateMatrixAntiClockwise(arr);

        System.out.println("\nMatrix after Anti-Clockwise Rotation:");
        print2DArray(arr);

        sc.close();
    }
}
// Enter number of rows: 3
// Enter number of columns: 3
// Enter elements:
// 1 3 5 
// 2 5 7
// 4 7 9

// Original Matrix:
// 1 3 5
// 2 5 7
// 4 7 9

// Matrix after Anti-Clockwise Rotation:
// 5 7 9
// 3 5 7
// 1 2 4