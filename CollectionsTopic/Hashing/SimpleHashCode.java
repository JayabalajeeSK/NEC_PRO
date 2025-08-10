package CollectionsTopic.Hashing;

import java.util.Scanner;

public class SimpleHashCode 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Ask the user
        System.out.print("Enter a string or number: ");
        String input = sc.nextLine();

        // Get the hash code
        int hashCode = input.hashCode();

        // Output the result
        System.out.println("Hash code of \"" + input + "\" is: " + hashCode);

        sc.close();
    }
}
// Enter a string or number: cat
// Hash code of "cat" is: 98262

// Enter a string or number: 123
// Hash code of "123" is: 48690
