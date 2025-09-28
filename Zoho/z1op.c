//1
#include <stdio.h> // Include standard I/O library for printf

void main() // main function, starting point of program in C. In Java, it's like public static void main(String[] args)
{
    int a[10], i=0; // Declare integer array 'a' of size 10 and integer variable 'i' initialized to 0

    for(i=0; i<10; i++) // Loop from 0 to 9 (10 elements)
        a[i] = 9 - i; // Assign values: a[0]=9, a[1]=8,... a[9]=0

    for(i=0; i<10; i++) // Loop again for modification
        a[i] = a[a[i]]; // Replace each element with element at index a[i]
        /* Example: a[0] = a[a[0]] = a[9] = 0, 
           a[1] = a[a[1]] = a[8] = 1, and so on */

    for(i=0; i<10; i++) // Loop to print array
        printf("%d", a[i]); // Print elements without space

}
// Output: 0123456789


//2
#include <stdio.h>

void printout(char *pstr) // Function to print numeric part from string
{
    int iretval = 0; // Result variable, initialized to 0

    if (pstr) // Check if pointer is not NULL (in Java, you would check if string != null)
    {
        while (*pstr && *pstr <= '9' && *pstr >= '0') 
        {
            // *pstr is dereferencing pointer, in Java: pstr.charAt(index)
            iretval = (iretval * 10) + (*pstr - '0'); 
            // Convert char digit to int and append to result
            pstr++; // Move pointer to next character (like i++)
        }
    }
    printf("%d\n", iretval); // Print the result
}

void main()
{
    printout("X32"); // 'X' is ignored, 32 is numeric → Output: 0 (because first char is not digit)
    printout("47X74"); // Stops at 'X', Output: 47
}

// Output:
// 0
// 47


//3
#include <stdio.h>

void main()
{
    int a[] = {8,9,9,9}; // Original array
    int r[5] = {0,0,0,0,0}; // Result array with extra space for carry
    int i = 0, m = 1, s = 4; // i=index, m=carry, s=size

    for(i = s-1; i >= 0; i--) 
    {
        r[i+1] = (a[i] + m) % 10; // Add 1 to last digit, modulo 10
        m = (a[i] + m) / 10; // Carry for next digit
    }

    r[0] = m; // Store final carry at first position

    for(i = 1; i <= s; i++)
        printf("%d", r[i]); // Print result ignoring leading carry 0

}
// Output: 9000


//4
#include <stdio.h>

int i = 0; // Global variable, accessible inside function

int fun(int a)
{
    i++; // Increment global counter
    if (a > 99)
        return a - 12; // Base case
    return fun(fun(a + 25)); // Recursive call
}

void main()
{
    printf("%d", fun(69)); // Call recursive function
    printf("%d", i); // Print number of recursive calls
}

// Output: 82 11


//5
#include <stdio.h>

int max(int x, int y) // Function to return maximum
{
    return (y > x) ? y : x; // Ternary operator: if(y>x) return y else return x
}

void main()
{
    int a[] = {-6, -7, 8, -9, -2, 3, -4, 5};
    int value = a[0], ctval = a[0]; // value=max sum, ctval=current sum
    int i = 0, n = 8;

    for(i = 1; i < n; i++)
    {
        ctval = max(a[i], ctval + a[i]); // Kadane's algorithm step
        value = max(value, ctval);
    }

    printf("%d", value); // Print max subarray sum
}

// Output: 8


//6
#include <stdio.h>

void main()
{
    int a = 30, b = 40, x;
    x = (a = 10) & (b = 50); 
    // '&' bitwise AND. First assign a=10, b=50, then 10 & 50 = 2
    printf("x=%d\n", x);
}

// Output: x=2


//7
#include <stdio.h>

void main()
{
    int x = 0, y = 1;
    y = x; // y=0
    x = !y; // logical NOT, !0 → 1
    printf("x=%d y=%d\n", x, y);
}

// Output: x=1 y=0


//8
#include <stdio.h>

void main()
{
    int x = 3, y = 4, z = 4;
    printf("ans=%d\n", (z >= y >= x ? 100 : 200)); 
    // z >= y → 4>=4 →1 (true)
    // 1 >= x → 1>=3 →0 (false)
    // Ternary → 200
}

// Output: ans=200


//9
#include <stdio.h>

void main()
{
    float a = 12.25, b = 13.65;

    if(a == b)
        printf("a and b are equal");
    else
        printf("a and b are not equal"); // a != b → prints this
}

// Output: a and b are not equal


//10
#include <stdio.h>

void main()
{
    if('Z' < 'z') // ASCII comparison, 'Z'=90, 'z'=122
        printf("Pilots are on strike...\n");
    else
        printf("for absolutely outlandish demands\n");
}

// Output: Pilots are on strike...


//11
#include <stdio.h>

void main()
{
    float a = 0.7;

    if(a < 0.7) // float comparison might fail due to precision
        printf("Stoned");
    else
        printf("Avenged"); // prints this
}

// Output: Avenged


//12
#include <stdio.h>

void main()
{
    float a = 0.5, b = 0.9;

    if(a && b > 0.9) 
        // a != 0 → true, b>0.9 → false
        printf("tce-cse-a\n");
    else
        printf("tce-cse-b\n"); // prints this
}

// Output: tce-cse-b


//13
#include <stdio.h>

void main()
{
    int i;
    for(i = 1; i++ <= 5; printf("%d", i));
    /* Loop: i is incremented first, then compared. printf executes after i++.
       Prints: 23456
    */
}

// Output: 23456


//14
#include <stdio.h>

void main()
{
    int i = 1, j = 1;

    for(; j; printf("%d%d\n", i, j))
        j = i++ <= 5; 
        /* Loop runs while j!=0, i increments, prints i,j after assignment
           Output:
           21
           32
           43
           54
           65
           76
        */
}


//15
#include <stdio.h>

void main()
{
    int x = 3, y, z;
    z = y = x; // x=3, y=3, z=3
    z *= y = x * x; 
    // y = 3*3=9, z = 3*9=27
    printf("x=%d y=%d z=%d\n", x, y, z);
}

// Output: x=3 y=9 z=27


//16
#include <stdio.h>

void main()
{
    int x = 3, z;
    z = x / ++x; // ++x=4, 3/4=0 (integer division)
    printf("x=%d z=%d\n", x, z);
}

// Output: x=4 z=0


//17
#include <stdio.h>

void main()
{
    int x, y, z;
    x = y = z = 1;
    z = ++x || ++y && ++z; 
    // || short-circuit: ++x=2 → true → ++y && ++z not executed
    printf("x=%d y=%d z=%d\n", x, y, z);
}

// Output: x=2 y=1 z=1


//18
#include <stdio.h>

void main()
{
    char ch = 'E';
    switch(ch)
    {
        case(ch >= 65 && ch <= 90): // Not valid in C; evaluates to case 1
            printf("Capital letter\n");
            break;
        case(ch >= 97 && ch <= 122):
            printf("small letter\n");
            break;
        case(ch >= 48 && ch <= 57):
            printf("Digit");
            break;
        default:
            printf("Any other");
    }
}

// Output: Capital letter


//19
#include <stdio.h>

void main()
{
    int i = 3;
    switch(i)
    {
        case 1: printf("cse\t");
        case 2: printf("It\n"); break;
        case 3: continue; // Invalid in C; compile error
        default: printf("goodbye");
    }
}


//20
#include <stdio.h>

void main()
{
    char s;
    switch(s) // uninitialized → garbage value
    {
        case '1': printf("database");
        case '2': printf("data-structure");
        default: printf("c");
                 printf("byebye");
    }
}

// Output (depends on garbage value): cbyebye


//21
#include <stdio.h>

void main()
{
    int k = -2, j = 4;
    switch(k /= j / k) // k=-2/(4/-2) → k=-2/-2=1
    {
        default: printf("lenovo");
        case 0: printf("hp");
        case 1: printf("acer");
        case 2: printf("dell");
    }
}

// Output: acer dell


//22
#include <stdio.h>

void main()
{
    int j, x = 0;
    for(j = 0; j <= 5; j++)
    {
        switch(j - 1)
        {
            case 0:
            case -1:
                x -= 1; break;
            case 1:
            case 2:
            case 3:
                break;
            default:
                x += 3;
        }
        printf("%d", x);
    }
}

// Output: 32-1-1-13


//23
#include <stdio.h>

void main()
{
    int i;
    for(i = 2; i <= 10; i++)
    {
        switch(i)
        {
            case 2: printf("0"); continue; // continue outer loop
            case 3: break; // break switch
            case 4:
            case 5: printf("1"); break;
            default: printf("000");
        }
    }
}

// Output: 011100000


//24
#include <stdio.h>

void main()
{
    char ch = 'E';
    switch(ch)
    {
        case(ch >= 65 && ch <= 90): // Not valid in C; evaluates to case 1
            printf("Capital letter\n");
            break;
        case(ch >= 97 && ch <= 122):
            printf("small letter\n");
            break;
        case(ch >= 48 && ch <= 57):
            printf("Digit");
            break;
        default:
            printf("Any other");
    }
}
// Output: Capital letter


//25
#include <stdio.h>

void main()
{
    int i, j;
    for(j = 1; j <= 10; j++)
        for(i = 1; i <= 10; i++)
            if(j < 10)
            {
                printf("tcemitpsg"); // prints 9*10=90 times
            }
            else
                printf("annauniversity"); // prints last row 10 times
}


//26
#include <stdio.h>

int funcl(int k)
{
    k++; // Increment k
    return k;
}

void main()
{
    int k = 35;
    k = funcl(k = funcl(k = funcl(k))); 
    /* Evaluate innermost: funcl(35)=36 → k=36
       Middle: funcl(36)=37 → k=37
       Outermost: funcl(37)=38 → k=38
    */
    printf("k=%d\n", k);
}

// Output: k=38


//27
#include <stdio.h>

void pri(int, int);
void printit(float, int);

void main()
{
    float a = 3.14;
    int i = 99;
    pri(i, a); // Implicit conversion: float a→int in C
    printit(a, i); // Implicit conversion: int i→float in C
}

void pri(int i, int a)
{
    printf("i=%d a=%f\n", i, a); 
    printf("a=%f i=%d\n", a, i);
}

void printit(float a, int i)
{
    printf("a=%f i=%d\n", a, i);
    printf("i=%d a=%f\n", i, a);
}


//28
#include <stdio.h>

void main() 
{
    int k = 35, *z, *y; // pointers
    z = &k; // z points to k
    y = z; // y points to same k
    *z++ = *y++; // value assigned, then pointer increments
    k++; // increment k
    printf("k=%d z=%d y=%d", k, z, y); 
    // Output depends on memory address, can't directly map to Java
}


//29
#include <stdio.h>

void main() 
{
    int a = 100, *b, **c, ***d;
    b = &a; // pointer to a
    c = &b; // pointer to pointer
    d = &c; // pointer to pointer to pointer
    printf("%d %d %d %d", a, *b, **c, ***d); 
}

// Output: 100 100 100 100


//30
#include <stdio.h>

void main() 
{
    int z = 4;
    printf("%d\n", printf("%d%d\n", z, z-1));
    // Inner printf prints "43\n", returns number of characters printed = 3
    // Outer printf prints 3
}

// Output:
// 43
// 3