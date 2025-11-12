package vsb.b.Functions;


public class F1_Fun
{
    public int addNumbers(int a, int b) 
    {
        int sum = a + b;  
        return sum;       
    }

    public static int mobile() 
    {
        return 117718;       
    }
        
    public static void displayMessage() 
    {
        System.out.println("Hii");
    }

    public static void displayMessage(String name) 
    {
        System.out.println("Hii "+name);
    }

    public static void main(String[] args) 
    {
        F1_Fun f1 = new F1_Fun();
        displayMessage();
        displayMessage("jaya");

        mobile();
        System.out.println(mobile());

        int result = f1.addNumbers(5, 3);
        System.out.println("Sum: " + result);
    }
}
// Hii
// Hii jaya
// 117718
// Sum: 8