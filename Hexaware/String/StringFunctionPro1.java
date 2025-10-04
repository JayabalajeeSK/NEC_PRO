package Hexaware.String;


import java.util.Arrays;

public class StringFunctionPro1 {
    public static void main(String[] args) {
        
        String s1 = "Hello";
        System.out.println(s1.charAt(1)); // e

        String s2 = "Hello";
        System.out.println(s2.length()); // 5

        String s3 = "Hello";
        System.out.println(s3.substring(2)); // llo

        String s4 = "Hello";
        System.out.println(s4.substring(1, 4)); // ell

        String s5 = "Hello World";
        System.out.println(s5.contains("World")); // true

        System.out.println("Java".equals("java")); // false
        System.out.println("Java".equalsIgnoreCase("java")); // true

        System.out.println("apple".compareTo("banana")); // negative value
        System.out.println("Apple".compareToIgnoreCase("apple")); // 0

        System.out.println("Hello".concat(" World")); // Hello World
        System.out.println("JAVA".toLowerCase()); // java
        System.out.println("java".toUpperCase()); // JAVA

        System.out.println("   Hi  ".trim()); // Hi
        System.out.println("".isEmpty()); // true
        System.out.println("   ".isBlank()); // true (Java 11+)

        String s6 = "a,b,c";
        System.out.println(Arrays.toString(s6.split(","))); // [a, b, c]

        System.out.println(String.join("-", "a", "b", "c")); // a-b-c

        System.out.println("banana".replace('a', 'o')); // bonono
        System.out.println("Java is fun".replace("fun", "cool")); // Java is cool
        System.out.println("abc123xyz".replaceAll("\\d", "#")); // abc###xyz
        System.out.println("abc123123".replaceFirst("\\d", "#")); // abc#23123

        System.out.println("Hello".startsWith("He")); // true
        System.out.println("Hello".endsWith("lo")); // true

        System.out.println("banana".indexOf('a')); // 1
        System.out.println("banana".indexOf("na")); // 2
        System.out.println("banana".lastIndexOf('a')); // 5
        System.out.println("banana".lastIndexOf("na")); // 4

        String s7 = new String("Java");
        String s8 = s7.intern();
        System.out.println(s7 == s8); // false

        System.out.println("12345".matches("\\d+")); // true
        System.out.println(Arrays.toString("Java".toCharArray())); // [J, a, v, a]

        System.out.println(String.format("My name is %s and age %d", "JB", 22));
        // My name is JB and age 22

        System.out.println("   Hello   ".strip()); // Hello (Java 11+)
        System.out.println("   Hello".stripLeading()); // Hello
        System.out.println("Hello   ".stripTrailing()); // Hello

        System.out.println("Hi ".repeat(3)); // Hi Hi Hi

        String s9 = "One\nTwo\nThree";
        System.out.println(s9.lines().toList()); // [One, Two, Three] (Java 11+)

        System.out.println("A".codePointAt(0)); // 65
        System.out.println("AB".codePointBefore(1)); // 65
        System.out.println("Hello".codePointCount(0, 5)); // 5

        String s10 = "ABC";
        byte[] arr = s10.getBytes();
        System.out.println(Arrays.toString(arr)); // [65, 66, 67]
    }
}

// e
// 5
// llo
// ell
// true
// false
// true
// -1
// 0
// Hello World
// java
// JAVA
// Hi
// true
// true
// [a, b, c]
// a-b-c
// bonono
// Java is cool
// abc###xyz
// abc#23123
// true
// true
// 1
// 2
// 5
// 4
// false
// true
// [J, a, v, a]
// My name is JB and age 22
// Hello
// Hello
// Hello
// Hi Hi Hi
// [One, Two, Three]
// 65
// 65
// 5
// [65, 66, 67]