package vsb.b.part3.star;

import java.util.Scanner;

public class Ps7_InvertedHollowPyramid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) 
        {
            for(int s = 1; s <= n - i; s++) 
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * i - 1); j++) 
            {
                if(i == n || j == 1 || j == (2 * i - 1)) 
                {
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
// Enter n: 3
// *****
//  * *
//   *