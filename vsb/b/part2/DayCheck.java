package vsb.b.part2;

import java.util.Scanner;

public class DayCheck 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day name: ");
        String day = sc.nextLine();   

        switch(day.toLowerCase()) 
        {   
            case "monday": System.out.println("Start of the week"); break;

            case "tuesday": System.out.println("Second day of the week"); break;

            case "wednesday": System.out.println("Mid week"); break;

            case "thursday": System.out.println("Almost weekend"); break;

            case "friday": System.out.println("Weekend is near");break;

            case "sunday": 
            System.out.println("Weekend1");
            case "saturday":
            System.out.println("Weekend2");
            break;
            
            default: System.out.println("Invalid Day");
        }

        sc.close();
    }
}
