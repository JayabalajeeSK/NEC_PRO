package vsb.b.part3.star;

import java.util.Scanner;

public class Ps6_InvertedFilledPyramid {
    public static void main(String[] args) {
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
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
// Enter n: 3
// *****
//  ***
//   *