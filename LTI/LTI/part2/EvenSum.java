package LTI.part2;

import java.util.Scanner;

public class EvenSum 
{
    public static int sumEven(int N) 
    {
        int sum = 0;
        for (int i = 2; i <= N; i = i + 2) 
        {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sumEven(num)); 
        sc.close();
    }
}
// 6
// 12