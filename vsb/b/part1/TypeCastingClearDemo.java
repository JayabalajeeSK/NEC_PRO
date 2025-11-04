package vsb.b.part1;




public class TypeCastingClearDemo 
{
    public static void main(String[] args) 
    {
  
        //////////////////////////////////////////////
        // byte → short
        System.out.println();
        byte b = 5;
        short s1 = b; // Implicit
        System.out.println("byte -> short (Implicit): " + s1);

        // byte b2 = s1; // ERROR

        byte b2 = (byte) s1;
        System.out.println("short -> byte (Explicit): " + b2);


        //////////////////////////////////////////////
        // short → int
        System.out.println();
        short s = 120;
        int i1 = s; // Implicit
        System.out.println("short -> int (Implicit): " + i1);

        // short s2 = i1; // ERROR

        short s2 = (short) i1;
        System.out.println("int -> short (Explicit): " + s2);


        //////////////////////////////////////////////
        // int → long
        System.out.println();
        int i = 10000;
        long l1 = i; // Implicit
        System.out.println("int -> long (Implicit): " + l1);

        // int i2 = l1; // ERROR

        int i2 = (int) l1;
        System.out.println("long -> int (Explicit): " + i2);

    }
}

// byte -> short (Implicit): 5
// short -> byte (Explicit): 5

// short -> int (Implicit): 120
// int -> short (Explicit): 120

// int -> long (Implicit): 10000
// long -> int (Explicit): 10000