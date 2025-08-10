public class ThreeDArrayExample 
{
    public static void main(String[] args) 
    {
        int[][][] numbers = 
        {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {7, 8}
            }
        };

        // Printing 3D array
        for (int i = 0; i < 2; i++) 
        {
            System.out.println("Table " + (i + 1));
            for (int j = 0; j < 2; j++) 
            {
                for (int k = 0; k < 2; k++) 
                {
                    System.out.print(numbers[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
// Table 1
// 1 2 
// 3 4 
// Table 2
// 5 6 
// 7 8