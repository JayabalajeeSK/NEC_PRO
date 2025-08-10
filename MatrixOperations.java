import java.util.Scanner;

public class MatrixOperations 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];

        // Input Matrix A
        System.out.println("\nEnter Matrix A:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                A[i][j] = sc.nextInt();

        // Input Matrix B
        System.out.println("\nEnter Matrix B:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                B[i][j] = sc.nextInt();

        // ADDITION
        System.out.println("\nMatrix Addition:");
        int[][] add = new int[rows][cols];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                add[i][j] = A[i][j] + B[i][j];
            }
        }
        printMatrix(add);

        // SUBTRACTION
        System.out.println("\nMatrix Subtraction (A - B):");
        int[][] sub = new int[rows][cols];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                sub[i][j] = A[i][j] - B[i][j];
            }
        }
        printMatrix(sub);

        // MULTIPLICATION
        if (cols == rows) 
        { // check compatibility
            System.out.println("\nMatrix Multiplication (A * B):");
            int[][] mul = new int[rows][cols];
            for (int i = 0; i < rows; i++)
            {
                for (int j = 0; j < cols; j++)
                {
                    for (int k = 0; k < cols; k++)
                    {
                        mul[i][j] += A[i][k] * B[k][j];
                    }
                }
            }    
            printMatrix(mul);
        } 
        else 
        {
            System.out.println("\nMatrix multiplication not possible (cols of A != rows of B)");
        }

        // TRANSPOSE of A
        System.out.println("\nTranspose of Matrix A:");
        int[][] transA = new int[cols][rows];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                transA[j][i] = A[i][j];
            }
        }
        printMatrix(transA);

        // TRANSPOSE of B
        System.out.println("\nTranspose of Matrix B:");
        int[][] transB = new int[cols][rows];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                transB[j][i] = B[i][j];
            }
        printMatrix(transB);
        }

        sc.close();
    }

    // Utility method to print a matrix
    static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) 
        {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
// Enter number of rows: 2
// Enter number of columns: 2

// Enter Matrix A:
// 1 2
// 3 4

// Enter Matrix B:
// 2 3
// 4 5

// Matrix Addition:
// 3 5
// 7 9

// Matrix Subtraction (A - B):
// -1 -1
// -1 -1

// Matrix Multiplication (A * B):
// 10 13
// 22 29

// Transpose of Matrix A:
// 1 3 
// 2 4

// Transpose of Matrix B:
// 2 0
// 3 0
// 2 4
// 3 5
