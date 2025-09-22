package EV2.BasicTopics;

class MathOperation 
{
    int add(int a, int b) 
    {
        return a + b;
    }
    double add(double a, double b) 
    {
        return a + b;
    }
}

public class MOL_Main {
    public static void main(String[] args) 
    {
        MathOperation m = new MathOperation();
        System.out.println(m.add(5, 3));      // Calls int version
        System.out.println(m.add(5.5, 3.3));  // Calls double version
    }
}
// 8
// 8.8

