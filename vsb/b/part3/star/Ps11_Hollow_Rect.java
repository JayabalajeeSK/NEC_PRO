package vsb.b.part3.star;

import java.util.Scanner;

public class Ps11_Hollow_Rect 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                if(i == 0 || i == r-1 || j == 0 || j == c-1)
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
// Enter rows: 4
// Enter columns: 5
// *****
// *   *
// *   *
// *****