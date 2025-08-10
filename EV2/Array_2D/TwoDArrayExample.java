package EV2.Array_2D;
public class TwoDArrayExample 
{
    public static void main(String[] args) 
    {
        int[][] arr = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = arr.length;        // Number of rows
        int cols = arr[0].length;     // Number of columns (from first row)

        for (int i = 0; i < rows; i++) 
        { // Loop through rows
            for (int j = 0; j < cols; j++) 
            { // Loop through columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
// 1 2 3 
// 4 5 6
// 7 8 9