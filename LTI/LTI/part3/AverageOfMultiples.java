package LTI.part3;

import java.util.Scanner;

public class AverageOfMultiples 
{

    public static double average(int n, int p) 
    {
        int sum = 0;
        for (int i = n; i <= n * p; i += n) 
        {
            sum = sum + i;
        }
        return (double) sum / p;  
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int p = sc.nextInt(); 
        System.out.println(average(n, p));
        sc.close();
    }
}
// 3
// 4
// 7.5