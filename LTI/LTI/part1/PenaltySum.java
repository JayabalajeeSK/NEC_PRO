package LTI.part1;
import java.util.*;

public class PenaltySum 
{
	static int Penalty(int arr[] ,int n)
	{
		Arrays.sort(arr);
		int sum = 0;

		sum = sum + Math.abs(arr[0] - arr[1]);
		sum = sum + Math.abs(arr[n-1] - arr[n-2]);
		
		for (int i = 1; i < n - 1; i++)
		{
			sum = sum + Math.min(
								Math.abs(arr[i] - arr[i-1]),
								Math.abs(arr[i] - arr[i+1])
								);
		}
		return sum;
	}	

	
	public static void main(String args[])
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0 ; i<n ; i++)
		{
	        arr[i] = sc.nextInt();
		}

		System.out.println(""+ Penalty(arr, n));
		sc.close();
	}
}
// 6
// 5 10 1 4 8 7
// 9

// 3
// 4 1 5
// 5