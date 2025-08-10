package EV2.Array_2D.Programs;
import java.util.Scanner;

public class BorderSum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input size
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

        int sum = 0;

        // Calculate border sum
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) 
                {
                    sum = sum + matrix[i][j];
                }
            }
        }

        System.out.println("Border sum: " + sum);

        sc.close();
    }
}
// Enter rows: 3
// Enter columns: 2
// Enter matrix elements:
// 1 2
// 3 4
// 3 8
// Border sum: 21

// Enter rows: 3
// Enter columns: 3
// Enter matrix elements:
// 1 2 3 
// 4 5 6
// 7 8 9
// Border sum: 40