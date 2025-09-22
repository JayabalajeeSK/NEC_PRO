package LTI.part3;

import java.util.Scanner;

public class AirportLuggage 
{
    public static int weightMachine(int N, int[] weights, int T) 
    {
        int amount = 0; 
        
        for (int i = 0; i < N; i++) 
        {
            amount = amount + 1;
            
            if (weights[i] > T) 
            { 
                amount = amount + 1;      
            }
        }
        return amount; 
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); 
        int[] weights = new int[N]; 

      
        for (int i = 0; i < N; i++) 
        {
            weights[i] = sc.nextInt();
        }

        int T = sc.nextInt(); 

        System.out.println(weightMachine(N, weights, T));
        
        sc.close();
    }
}
// 4
// 1 2 3 4
// 3
// 5