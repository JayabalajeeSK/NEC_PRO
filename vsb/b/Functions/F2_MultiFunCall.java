package vsb.b.Functions;

class F2_MultiFun
{
    public int reverse(int n) 
    {
        int rev = 0;
        while (n > 0) 
        {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }

    public void printFibonacci(int n) 
    {
        int a = 0, b = 1;

        System.out.print(a + " " + b);

        for (int i = 2; i < n; i++) 
        {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }

    public double cgpa()
    {
        return 9.08;
    }

    public void congrats()
    {
        System.out.println("Vazthukal Vazthukal");
    }
}

public class F2_MultiFunCall 
{
    public static void main(String[] args) 
    {
        F2_MultiFun f2_fun = new F2_MultiFun();

        int rev =  f2_fun.reverse(123);
        System.out.println(rev);

        f2_fun.printFibonacci(5);

        double myCGPA = f2_fun.cgpa();
        System.out.println(myCGPA);

        f2_fun.congrats();
        
    }
    
}
// 321
// 0 1 1 2 3
// 9.08
// Vazthukal Vazthukal