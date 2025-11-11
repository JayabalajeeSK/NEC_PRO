package vsb.b.part3.star;

import java.util.Scanner;

public class Ps13_XPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();  // Example: 5
        int mid = (n / 2) + 1;

        for(int i = 1; i <= n; i++) 
        {
            for(int j = 1; j <= n; j++) 
            {
                if( j == i || j == n - i + 1 || i == 1 || i == n || j == n || j == 1 || i==mid || j == mid ) 
                {
                    System.out.print("* ");
                } 
                // if(i == 1 || i == n || j == n || j == 1 )
                // {
                    
                // }
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
// Enter n: 9
// * * * * * * * * *
// * *     *     * *
// *   *   *   *   *
// *     * * *     *
// * * * * * * * * *
// *     * * *     *
// *   *   *   *   *
// * *     *     * *
// * * * * * * * * *