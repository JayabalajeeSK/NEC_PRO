package vsb.b.part2;

import java.util.Scanner;

public class Result 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        int attendence = sc.nextInt();
        if(mark>=40)
        {
            if(attendence>=75)
            {
                System.out.println("Pass");
            }
            else if(attendence>=60 && attendence <75)
            {
                attendence = 75;
                System.out.println("Pass");
            }
            else System.out.println("Fail");
        }
        else System.out.println("Fail");
        sc.close();

    }
    
}
