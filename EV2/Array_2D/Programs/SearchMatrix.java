package EV2.Array_2D.Programs;

import java.util.Scanner;

public class SearchMatrix 
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

        // Element to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (matrix[i][j] == key) 
                {
                    System.out.println("Element found at position (" + i + "," + j + ")");
                    found = true;
                }
            }
        }

        if (!found) 
        {
            System.out.println("Element not found.");
        }
    sc.close();
    }
}
// Enter rows: 3
// Enter columns: 2
// Enter matrix elements:
// 1 3
// 4 5
// 1 4
// Enter element to search: 4
// Element found at position (1,0)
// Element found at position (2,1)