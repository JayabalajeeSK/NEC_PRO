package vsb.b.part1;

public class OperatorPrecedence 
{
    public static void main(String[] args) 
    {

        int a = 10, b = 5, c = 2, result;

        // 1️⃣ Parentheses ()
        result = (a + b) * c;
        System.out.println(result); 

        // 2️⃣ Unary Operators ++, --, -, +
        int unary = -a + ++b;  // ++b = 6, so -10 + 6 = -4
        System.out.println(unary);

        // 3️⃣ Multiplication, Division, Modulus
        result = a * b / c % 3; // (10*6)/2%3 = 60/2%3 = 30%3 = 0
        System.out.println(result);

        // 4️⃣ Addition, Subtraction
        result = a + b - c;
        System.out.println(result);

        // 5️⃣ Relational Operators
        boolean rel = a > b && b >= c;
        System.out.println(rel);

        // 6️⃣ Equality Operators
        boolean eq = (a == b) || (a != c);
        System.out.println(eq);

        // 7️⃣ Logical AND (&&)
        boolean andResult = (a > b) && (b > c);
        System.out.println(andResult);

        // 8️⃣ Logical OR (||)
        boolean orResult = (a < b) || (b > c);
        System.out.println(orResult);

        // 9️⃣ Ternary Conditional (?:)
        int ternary = (a > b) ? a : b;
        System.out.println(ternary);

        // 🔟 Assignment (=, +=, -=, etc.)
        int assign = 10;
        assign += 5;  // assign = assign + 5
        System.out.println(assign);

        // 💡 Combine all (complex expression)
        int complex = a + b * c - (a / b) + (a > b ? a : b);
        System.out.println(complex);
    }
}
// 30
// -4
// 0
// 14
// true
// true
// true
// true
// 10
// 15
// 31