package Zoho.Round_2.ZP;

import java.util.Scanner;

public class ZP1_DiagonalSum 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[10][10];

        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++) 
            {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();


        int sum = 0;
        for (int i = 0; i < 10; i++) 
        {
            sum = sum + arr[i][i];
        }

        System.out.println(sum);
    }
}

//               1 22 33 44 55 66 77 88 99 100
//               100 1 88 77 66 55 44 33 22 11
//               88 88 1 66 55 44 33 22 11 100
//               88 77 66 1 44 33 22 11 100 99
//               77 66 55 44 1 22  11 88 99 100
//               66 55 44 33 22 1 77 88 99 100
//               44 33 22 11 100 99 1 77 66 55
//               33 22 11 100 99 88 77 1 55 44
//               22 11 100 99 88 77 66 55 1 33
//               100 11 22 33 44 55 99 88 77 1
// 10

//                1 2 3 4 5 6 7 8 9 0 
//                0 1 2 3 4 5 6 7 8 0
//                3 4 5 6 7 8 9 6 4 0
//                2 3 4 5 6 7 8 9 3 2
//                3 4 5 6 7 4 3 2 1 3
//                3 4 5 6 2 4 4 2 4 6
//                2 3 4 6 2 4 6 2 3 5
//                2 3 5 6 2 4 6 2 3 5
//                2 4 6 2 1 4 3 3 5 2
//                3 3 5 2 4 6 2 1 4 6
// 42