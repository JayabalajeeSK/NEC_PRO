package Zoho.Round_2;

import java.util.Scanner;

public class Z5_NumberToWords 
{
    
    static String[] units = 
    { 
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 
    };
    
    static String[] tenToNineteen = 
    { 
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" 
    };
    
    static String[] tens = 
    { 
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" 
    };
    
    public static String convertToWords(int number) 
    {
        if (number == 0) 
        {
            return "zero";
        }

        StringBuilder words = new StringBuilder();

        int hundredsPlace = number / 100;
        int remainder = number % 100;

        if (hundredsPlace > 0) 
        {
            words.append(units[hundredsPlace]).append(" hundred");
            if (remainder != 0) 
            {
                words.append(" and ");
            } 
            else 
            {
                words.append(" only");
                return words.toString();
            }
        }

        if (remainder >= 10 && remainder <= 19) 
        {
            words.append(tenToNineteen[remainder - 10]);
        } 
        else 
        {
            int tensPlace = remainder / 10;
            int unitsPlace = remainder % 10;

            if (tensPlace > 0) 
            {
                words.append(tens[tensPlace]);
                if (unitsPlace > 0) 
                {
                    words.append(" ");
                }
            }

            if (unitsPlace > 0) 
            {
                words.append(units[unitsPlace]);
            }
        }

        return words.toString();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        System.out.println(convertToWords(number));
    }
}
// 30
// thirty

// 312 
// three hundred and twelve