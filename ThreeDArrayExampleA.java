import java.util.Scanner;

public class ThreeDArrayExampleA 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Read dimensions of 3D array
        // Example input:
        // 2 2 2
        // 1 2
        // 3 4
        // 5 6
        // 7 8
        int x = scanner.nextInt(); // number of tables
        int y = scanner.nextInt(); // number of rows per table
        int z = scanner.nextInt(); // number of columns per row

        int[][][] numbers = new int[x][y][z];

        // Read elements of 3D array
        for (int i = 0; i < x; i++) 
        {
            for (int j = 0; j < y; j++) 
            {
                for (int k = 0; k < z; k++) 
                {
                    numbers[i][j][k] = scanner.nextInt();
                }
            }
        }

        // Print 3D array in same format
        for (int i = 0; i < x; i++) 
        {
            System.out.println("Table " + (i + 1));
            for (int j = 0; j < y; j++) 
            {
                for (int k = 0; k < z; k++) 
                {
                    System.out.print(numbers[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
// 2
// 2
// 2
// 1 2 
// 4 5 

// 6 7 
// 8 9
// Table 1
// 1 2
// 4 5
// Table 2
// 6 7
// 8 9
