package vsb.b.Functions;

import java.util.Scanner;

public class F4_CheckAndPrintPrime 
{
    static boolean checkPrime(int num) 
    {
        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++) 
        {
            if (num % i == 0) return false;
        }
        return true;
    }

    static void printNPrimes(int n) 
    {
        int count = 0;
        int num = 2;

        System.out.println("First " + n + " Prime Numbers:");
        while (count < n) 
        {
            if (checkPrime(num)) 
            {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }

    // Main method
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check prime: ");
        int number = sc.nextInt();

        if (checkPrime(number)) System.out.println(number + " is a Prime Number");
        else System.out.println(number + " is Not a Prime Number");

        System.out.print("\nEnter how many prime numbers to print: ");
        int n = sc.nextInt();

        printNPrimes(n);

        sc.close();
    }
}
// Enter a number to check prime: 7
// 7 is a Prime Number

// Enter how many prime numbers to print: 15
// First 15 Prime Numbers:
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47

// Enter a number to check prime: 10
// 10 is Not a Prime Number

// Enter how many prime numbers to print: 87
// First 87 Prime Numbers:
// 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101 103 107 109 113 127 131 137 139 149 151 157 163 167 173 179 181 191 193 197 199 211 223 227 229 233 239 241 251 257 263 269 271 277 281 283 293 307 311 313 317 331 337 347 349 353 359 367 373 379 383 389 397 401 409 419 421 431 433 439 443 449