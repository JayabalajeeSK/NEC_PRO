package EV2.Array_2D.Programs;

import java.util.Scanner;

public class DiagonalTraversal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Traverse diagonals
        System.out.print("Diagonal Zig-Zag Order: ");
        for (int d = 0; d < rows + cols - 1; d++) 
        {
            // Determine starting point
            int row = (d < cols) ? 0 : d - cols + 1;
            int col = (d < cols) ? d : cols - 1;

            // Store the diagonal temporarily
            int[] temp = new int[Math.min(d + 1, Math.min(rows, cols))];
            int idx = 0;

            while (row < rows && col >= 0) 
            {
                temp[idx++] = matrix[row][col];
                row++;
                col--;
            }

            // Reverse every alternate diagonal
            if (d % 2 == 0) 
            {
                for (int i = idx - 1; i >= 0; i--) 
                {
                    System.out.print(temp[i] + " ");
                }
            } 
            else 
            {
                for (int i = 0; i < idx; i++) 
                {
                    System.out.print(temp[i] + " ");
                }
            }
        }
        sc.close();
    }
}
// Enter rows: 3
// Enter columns: 3
// Enter matrix elements:
// 1 2 3
// 4 5 6
// 7 8 9
// Diagonal Zig-Zag Order: 1 2 4 7 5 3 6 8 9
