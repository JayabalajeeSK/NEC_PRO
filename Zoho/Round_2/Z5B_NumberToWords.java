package Zoho.Round_2;

import java.util.Scanner;

public class Z5B_NumberToWords {

    static String[] units = 
        { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    static String[] tenToNineteen = 
        { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

    static String[] tens = 
        { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

    static String convertTwoDigits(int number) 
    {
        if (number < 10) return units[number];
        else if (number < 20) return tenToNineteen[number - 10];
        else 
        {
            int t = number / 10;
            int u = number % 10;
            return tens[t] + (u > 0 ? " " + units[u] : "");
        }
    }

    static String convertThreeDigits(int number) 
    {
        int hundreds = number / 100;
        int remainder = number % 100;
        StringBuilder sb = new StringBuilder();
        if (hundreds > 0) 
        {
            sb.append(units[hundreds]).append(" hundred");
            if (remainder > 0) sb.append(" and ");
            else return sb.toString() + " only";
        }
        if (remainder > 0) sb.append(convertTwoDigits(remainder));
        return sb.toString();
    }

    static String convertToWords(long number) 
    {
        if (number == 0) return "zero";
        StringBuilder words = new StringBuilder();

        long crore = number / 10000000;
        number %= 10000000;
        long lakh = number / 100000;
        number %= 100000;
        long thousand = number / 1000;
        number %= 1000;
        long hundred = number; 

        if (crore > 0) words.append(convertThreeDigits((int) crore)).append(" crore ");
        if (lakh > 0) words.append(convertThreeDigits((int) lakh)).append(" lakh ");
        if (thousand > 0) words.append(convertThreeDigits((int) thousand)).append(" thousand ");
        if (hundred > 0) words.append(convertThreeDigits((int) hundred));

        return words.toString().trim();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong(); 
        sc.close();

        System.out.println(convertToWords(number));
    }
}
// 30102002
// three crore one lakh two thousand two