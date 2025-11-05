package vsb.b.part2;

import java.util.Scanner;

public class LeapYear 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400==0)
        {
            System.out.println("leapYear");
        }
        else if(year%100==0)
        {
            System.out.println("not Leapyear");
        }
        else if(year%4==0)
        {
            System.out.println("LeapYear");
        }
        else
        {
            System.out.println("Not Leapyear");
        }
        sc.close();

    }

}
