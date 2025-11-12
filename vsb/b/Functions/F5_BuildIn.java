package vsb.b.Functions;

import java.util.Arrays;

public class F5_BuildIn 
{
    public static void main(String[] args) 
    {
        System.out.println();
        System.out.println("String Start");

        String s1 = "Jayabalajee";

        System.out.println(s1.length());

        System.out.println(s1.charAt(2));

        System.out.println("Jaya".equals("jaya"));

        System.out.println("Jaya".equalsIgnoreCase("jaya"));

        System.out.println(s1.toCharArray());

        System.out.println(s1.toUpperCase());

        System.out.println(s1.toLowerCase());

        System.out.println(s1.substring(0, 3));

        System.out.println(s1.substring(4));

        System.out.println(s1.contains("jy"));

        System.out.println(s1.startsWith("J"));

        System.out.println(s1.endsWith("e"));

        System.out.println("Jaya".compareTo("Bala"));

        System.out.println("Jaya".compareTo("jaya"));

        System.out.println("Jaya".compareToIgnoreCase("jaya"));

        System.out.println("String End");
        System.out.println();

        // String Start
        // 11
        // y
        // false
        // true
        // Jayabalajee
        // JAYABALAJEE
        // jayabalajee
        // Jay
        // balajee
        // false
        // true
        // true
        // 8
        // -32
        // 0
        // String End

        //-----------------------------------------------------

        System.out.println();
        System.out.println("Array Start");
        int arr[] = {3, 5 , 1, 6, 7, 2};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int arr1[] = {3, 5 , 1, 6, 7, 2};
        System.out.println(Arrays.equals(arr, arr1));

        Arrays.fill(arr, 0);
        System.out.println(Arrays.toString(arr));

        System.out.println("Array End");
        System.out.println();

        // Array Start
        // [3, 5, 1, 6, 7, 2]
        // [1, 2, 3, 5, 6, 7]
        // false
        // [0, 0, 0, 0, 0, 0]
        // Array End

        //-----------------------------------------------------

        System.out.println();
        System.out.println("Integer Start");

        System.out.println(Integer.parseInt("123"));

        System.out.println(Integer.toBinaryString(8));

        System.out.println(Integer.valueOf("55"));

        System.out.println(Integer.compare(10, 5));

        System.out.println(Integer.sum(4, 9)); 

        System.out.println(Integer.max(5, 8));

        System.out.println(Integer.min(6 , 7));

        Integer n = 90;
        System.out.println(n.equals(3));

        System.out.println("Integer End");
        System.out.println();

        // Integer Start
        // 123
        // 1000
        // 55
        // 1
        // 13
        // 8
        // 6
        // false
        // Integer End

        //-----------------------------------------------------

        System.out.println("Character Start");
        System.out.println();

        System.out.println(Character.isDigit('5'));

        System.out.println(Character.isWhitespace(' '));

        System.out.println(Character.isUpperCase('A'));

        System.out.println(Character.isLowerCase('B'));

        System.out.println(Character.toUpperCase('d'));

        System.out.println(Character.toLowerCase('K'));

        System.out.println(Character.isAlphabetic('j'));

        System.out.println(Character.getNumericValue('9'));

        System.out.println(Character.compare('A', 'B'));

        System.out.println(Character.isLetter('A'));

        System.out.println("Character End");
        System.out.println();

        // Character Start
        // true
        // true
        // true
        // false
        // D
        // k
        // true
        // 9
        // -1
        // true
        // Character End

        //-----------------------------------------------------

        System.out.println();
        System.out.println("Math Start");

        System.out.println(Math.sqrt(25));

        System.out.println(Math.pow(2, 3));

        System.out.println(Math.abs(-1));

        System.out.println(Math.min(2, 4));

        System.out.println(Math.max(3,4));

        System.out.println(Math.round(4.5));

        System.out.println(Math.round(4.4));

        System.out.println(Math.ceil(4.4));

        System.out.println(Math.floor(4.9));

        System.out.println(Math.cbrt(27));

        System.out.println("Math End");
        System.out.println();

        // Math Start
        // 5.0
        // 8.0
        // 1
        // 2
        // 4
        // 5
        // 4
        // 5.0
        // 4.0
        // 3.0
        // Math End
        
    }
    
}
