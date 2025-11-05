package vsb.b.part2;

import java.util.Scanner;

public class LeapHeapTernary 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String leap = year%400==0 ? "Leap" : year%100==0 ? "Not Leap": year%4==0 ? "leap": "not leap";
        System.out.println(leap);
        sc.close();
        
    }
    
}
