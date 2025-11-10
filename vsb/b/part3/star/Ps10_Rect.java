package vsb.b.part3.star;

import java.util.Scanner;

public class Ps10_Rect 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
// Enter rows: 3
// Enter columns: 4
// ****
// ****
// ****