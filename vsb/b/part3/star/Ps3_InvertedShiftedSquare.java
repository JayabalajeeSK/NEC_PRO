package vsb.b.part3.star;

import java.util.Scanner;

public class Ps3_InvertedShiftedSquare 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) 
        {

            for(int s = 1; s < i; s++) 
            {
                System.out.print(" ");
            }

            for(int j = 1; j <= n; j++) 
            {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
// Enter n: 3
//   ***
//  ***
// ***