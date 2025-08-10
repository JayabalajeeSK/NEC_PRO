import java.util.Scanner;

public class J_2D_array
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
// Define number of rows and columns
// Example input:
// 2 2
// 1 2
// 3 4
int rows = scanner.nextInt();
int cols = scanner.nextInt();
int[][] numbers = new int[rows][cols];
// Read elements of 2D array
for (int i = 0; i < rows; i++)
{
for (int j = 0; j < cols; j++)
{
numbers[i][j] = scanner.nextInt();
}
}

// Printing the 2D array
for (int i = 0; i < rows; i++)
{
for (int j = 0; j < cols; j++)
{
System.out.print(numbers[i][j] + " ");
}
System.out.println();
}
scanner.close();
}
}
// 2
// 2

// 1 2
// 3 4

// 1 2
// 3 4