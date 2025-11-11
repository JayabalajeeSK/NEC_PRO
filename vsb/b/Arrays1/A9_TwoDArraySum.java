package vsb.b.Arrays1;

import java.util.Scanner;

public class A9_TwoDArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
       
        int[][] arr = new int[rows][cols];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
   

        System.out.println("\nThe 2D array (Normal loop):");
        int sum = 0;
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);


        System.out.println("\nThe 2D array (Enhanced for loop):");
        int sum1=0;
        for (int[] row : arr) 
        { 
            for (int value : row) 
            {
                sum1 = sum1 + value;
            }
        }
        System.out.println(sum1);
        sc.close();
    }
}
// Enter number of rows: 2   
// Enter number of columns: 3
// Enter elements:
// 2 3 4
// 8 7 6

// The 2D array (Normal loop):
// 30

// The 2D array (Enhanced for loop):
// 30