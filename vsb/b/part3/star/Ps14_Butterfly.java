package vsb.b.part3.star;

import java.util.Scanner;

public class Ps14_Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt(); // Example: 5

        for (int i = 1; i <= n; i++) {

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

            for (int i = n; i >= 1; i--) {

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = n; i >= 1; i--) {
            // print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
// Enter n: 5
// *
// **
// ***
// ****
// *****
// *****
// ****
// ***
// **
// *
//     *
//    **
//   ***
//  ****
// *****
// *****
//  ****
//   ***
//    **
//     *