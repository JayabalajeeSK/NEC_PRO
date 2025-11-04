package vsb.b.part1;

public class StringTypeConversion {
    public static void main(String[] args) {

        System.out.println("=== ✅ All Types → String Conversions ===");

        // byte → String
        byte b = 10;
        String strByte = Byte.toString(b);
        System.out.println("byte -> String: " + strByte);

        // short → String
        short s = 200;
        String strShort = Short.toString(s);
        System.out.println("short -> String: " + strShort);

        // int → String
        int i = 5000;
        String strInt = Integer.toString(i);
        System.out.println("int -> String: " + strInt);

        // long → String
        long l = 100000L;
        String strLong = Long.toString(l);
        System.out.println("long -> String: " + strLong);

        // float → String
        float f = 12.34f;
        String strFloat = Float.toString(f);
        System.out.println("float -> String: " + strFloat);

        // double → String
        double d = 56.789;
        String strDouble = Double.toString(d);
        System.out.println("double -> String: " + strDouble);

        // boolean → String
        boolean flag = true;
        String strBool = Boolean.toString(flag);
        System.out.println("boolean -> String: " + strBool);

        // char → String
        char ch = 'A';
        String strChar = Character.toString(ch);
        System.out.println("char -> String: " + strChar);



        System.out.println("\n=== ✅ String → All Types Conversions ===");

        String byteStr = "10";
        byte b2 = Byte.parseByte(byteStr);
        System.out.println("String -> byte: " + b2);

        String shortStr = "200";
        short s2 = Short.parseShort(shortStr);
        System.out.println("String -> short: " + s2);

        String intStr = "5000";
        int i2 = Integer.parseInt(intStr);
        System.out.println("String -> int: " + i2);

        String longStr = "100000";
        long l2 = Long.parseLong(longStr);
        System.out.println("String -> long: " + l2);

        String floatStr = "12.34";
        float f2 = Float.parseFloat(floatStr);
        System.out.println("String -> float: " + f2);

        String doubleStr = "56.789";
        double d2 = Double.parseDouble(doubleStr);
        System.out.println("String -> double: " + d2);

        String boolStr = "true";
        boolean flag2 = Boolean.parseBoolean(boolStr);
        System.out.println("String -> boolean: " + flag2);

        String charStr = "Z";
        char ch2 = charStr.charAt(0);
        System.out.println("String -> char: " + ch2);
    }
}
// === ? All Types ? String Conversions ===
// byte -> String: 10
// short -> String: 200
// int -> String: 5000
// long -> String: 100000
// float -> String: 12.34
// double -> String: 56.789
// boolean -> String: true
// char -> String: A

// === ? String ? All Types Conversions ===
// String -> byte: 10
// String -> short: 200
// String -> int: 5000
// String -> long: 100000
// String -> float: 12.34
// String -> double: 56.789
// String -> boolean: true
// String -> char: Z