package LTI.part5;
import java.util.Scanner;

public class SubstringCheck 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.contains(str2)) 
        {
            System.out.println("Output: 1 (Yes, it is a substring)");
        } 
        else 
        {
            System.out.println("Output: 0 (Not a substring)");
        }

        sc.close();
    }
}
// Enter first string: programming
// Enter second string: gram
// Output: 1 (Yes, it is a substring)
