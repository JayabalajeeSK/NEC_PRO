import java.util.Scanner;

public class BitConv 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input: Decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // Convert to Binary
        String binary = Integer.toBinaryString(decimal);

        int decimalOp = Integer.parseInt(binary,2);

        // Output
        System.out.println("Binary representation: " + binary);
        System.out.println("Decimal representation: " + decimalOp);

        sc.close();
    }
}
// Enter a decimal number: 12
// Binary representation: 1100
// Decimal representation: 12

