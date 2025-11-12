package vsb.b.Functions;

import java.util.Scanner;

public class F3_ArmstrongCheck 
{
    static boolean isArmstrong(int num) 
    {
        int original = num;
        int result = 0;
        int digits = String.valueOf(num).length(); 

        while (num > 0) 
        {
            int rem = num % 10;
            result = result + (int) Math.pow(rem, digits); 
            num = num / 10;
        }

        return result == original; 
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isArmstrong(n)) System.out.println(n + " is an Armstrong number.");
        else System.out.println(n + " is not an Armstrong number.");

        sc.close();
    }
}
// Enter a number: 153
// 153 is an Armstrong number.

// Enter a number: 157
// 157 is not an Armstrong number.