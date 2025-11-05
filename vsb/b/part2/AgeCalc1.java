package vsb.b.part2;

import java.util.Scanner;

public class AgeCalc1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("Eligible to Vote");
        }
        else System.out.println("Not Eligble to vote");
        sc.close();
    }
    
}
