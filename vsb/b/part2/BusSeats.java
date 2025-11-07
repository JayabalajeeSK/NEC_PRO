package vsb.b.part2;

import java.util.Scanner;

public class BusSeats 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bus Name (a or b): ");
        char bus = sc.next().toLowerCase().charAt(0);

        switch(bus) 
        {

            case 'a':
                System.out.println("Bus A Selected (20 Seats)");

                for(int seat = 1; seat <= 20; seat++) 
                {

                    if(seat == 1 || seat == 2 || seat == 5 || seat == 6 ||seat == 9 || seat == 10 || seat == 13 || seat == 14 || seat == 17 || seat == 18) 
                    {

                        System.out.println(seat + " - Ladies");

                    } 
                    else 
                    {

                        System.out.println(seat + " - Mens");

                    }
                }
                break;


            case 'b':
                System.out.println("Bus B Selected (6 Seats)");

                for(int seat = 1; seat <= 6; seat++) 
                {

                    if(seat % 2 != 0) 
                    {
                        System.out.println(seat + " - Ladies");
                    } 
                    else 
                    {
                        System.out.println(seat + " - Mens");
                    }
                }
                break;


            default: System.out.println("Invalid Bus Name! Choose a or b.");
        }

        sc.close();
    }
}
// Enter Bus Name (a or b): A
// Bus A Selected (20 Seats)
// 1 - Ladies
// 2 - Ladies
// 3 - Mens
// 4 - Mens
// 5 - Ladies
// 6 - Ladies
// 7 - Mens
// 8 - Mens
// 9 - Ladies
// 10 - Ladies
// 11 - Mens
// 12 - Mens
// 13 - Ladies
// 14 - Ladies
// 15 - Mens
// 16 - Mens
// 17 - Ladies
// 18 - Ladies
// 19 - Mens
// 20 - Mens

// Enter Bus Name (a or b): b
// Bus B Selected (6 Seats)
// 1 - Ladies
// 2 - Mens
// 3 - Ladies
// 4 - Mens
// 5 - Ladies
// 6 - Mens