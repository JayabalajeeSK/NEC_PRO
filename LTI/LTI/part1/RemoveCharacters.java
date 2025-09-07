package LTI.part1;
import java.util.Scanner;
public class RemoveCharacters
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.next();
        str1=str1.replaceAll(str2,"");
        System.out.println(str1);
        sc.close();
    }
}

// jayabalajee
// a
// jybljee