package vsb.b.part1;

public class Expression 
{
    public static void main(String[] args) 
    {
        int a = 10, b = 5, c = 3;


        int sum = a + b * c;

        boolean check = a > b;


        boolean logic = (a > b) && (b > c);


        int x = a + b;


        System.out.println(a++);
        a++;
        System.out.println(a++);
        b--;


        int max = (a > b) ? a : b;

        double power = Math.pow(b, c);

        System.out.println("Arithmetic: " + sum);

        System.out.println("Relational: " + check);

        System.out.println("Logical: " + logic);

        System.out.println("Assignment: " + x);

        System.out.println("After Post Increment/Decrement: a = " + a + ", b = " + b);

        ++a;
        --b;

        System.out.println("After Pre Increment/Decrement: a = " + a + ", b = " + b);

        System.out.println("Conditional (Ternary): " + max);
        
        System.out.println("Method Call: " + power);
    }
}
// 10
// 12
// Arithmetic: 25
// Relational: true
// Logical: true
// Assignment: 15
// After Post Increment/Decrement: a = 13, b = 4
// After Pre Increment/Decrement: a = 14, b = 3
// Conditional (Ternary): 13
// Method Call: 64.0