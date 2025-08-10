package EV2.Array_2D.Programs;

import java.util.Scanner;

public class MatrixOperations 
{

    // Addition
    public static int[][] addMatrices(int[][] A, int[][] B) 
    {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Subtraction
    public static int[][] subtractMatrices(int[][] A, int[][] B) 
    {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Multiplication (Matrix multiplication)
    public static int[][] multiplyMatrices(int[][] A, int[][] B) 
    {
        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) 
        {
            for (int j = 0; j < colsB; j++) 
            {
                int sum = 0; // temporary variable to store sum of products
                for (int k = 0; k < colsA; k++) 
                {
                    int product = A[i][k] * B[k][j]; // multiply single elements
                    sum = sum + product;             // add to sum
                }
                result[i][j] = sum; // store final sum in result cell
            }
        }
        return result;
    }


    // Element-wise Division
    public static double[][] divideMatrices(int[][] A, int[][] B) 
    {
        int rows = A.length;
        int cols = A[0].length;
        double[][] result = new double[rows][cols];

        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (B[i][j] != 0) 
                {
                    result[i][j] = (double) A[i][j] / B[i][j];
                } 
                else 
                {
                    System.out.println("Warning: Division by zero at [" + i + "][" + j + "]");
                    result[i][j] = Double.NaN; // Not a Number
                }
            }
        }
        return result;
    }

    // Print int matrix
    public static void printMatrix(int[][] mat) 
    {
        for (int[] row : mat) 
        {
            for (int val : row) 
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Print double matrix
    public static void printMatrix(double[][] mat) 
    {
        for (double[] row : mat) 
        {
            for (double val : row) 
            {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Get dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];

        // Input Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                A[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                B[i][j] = sc.nextInt();
            }
        }

        // Perform operations
        System.out.println("\nAddition:");
        printMatrix(addMatrices(A, B));

        System.out.println("\nSubtraction:");
        printMatrix(subtractMatrices(A, B));

        // Multiplication only possible if cols of A == rows of B
        if (cols == rows) 
        {
            System.out.println("\nMultiplication:");
            printMatrix(multiplyMatrices(A, B));
        } 
        else 
        {
            System.out.println("\nMultiplication not possible: cols of A must equal rows of B");
        }

        System.out.println("\nElement-wise Division:");
        printMatrix(divideMatrices(A, B));

        sc.close();
    }
}

// Addition:
// 3 5
// 7 9

// Subtraction:
// -1 -1
// -1 -1

// Multiplication:
// 10 13
// 22 29

// Element-wise Division:
// 0.5 0.6666666666666666 
// 0.75 0.8