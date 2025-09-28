//1
#include <stdio.h> // Include standard I/O library for printf

void main() // main function, entry point (Java: public static void main(String[] args))
{
    int i; // Declare integer variable i

    for(i = 1; i < 4; i++) // Loop from 1 to 3
    {
        switch(i) // Switch statement checks value of i
        {
            case 1: printf("%d", i); break; // i=1 → print 1 and break
            case 2: printf("%d", i); break; // i=2 → print 2 and break
            case 3: printf("%d", i); break; // i=3 → print 3 and break
        }
    }

    switch(i) // i=4 after loop
    {
        case 4: printf("%d", i); break; // Print 4
    }
}

// Output: 1234


//2
#include <stdio.h>

void main()
{
    char *s = "\12345s\n"; 
    /* \123 is octal escape → decimal 83 → 'S'
       So string = "S45s\n"
       sizeof(s) → size of pointer (char*) not string content, usually 4 or 8 bytes depending on system
    */
    printf("%d", sizeof(s)); 
}

// Output (on 64-bit system): 8
// On 32-bit system: 4


//3
#include <stdio.h>

int main() 
{
    static int i = 3; // Static variable keeps value across recursive calls
    printf("%d", i--); // Print i, then decrement
    return i > 0 ? main() : 0; // Recursively call main until i <= 0
}

// Output: 321


//4
#include <stdio.h>

int main() 
{
    char *s[] = {"dharmr'a", "hewlett-packard", "siemens", "ibm"}; 
    /* Array of string pointers, like Java String[] s = {...} */
    char **p;
    p = s; // p points to first element (s[0])

    printf("%s", ++*p); 
    // *p → s[0] → "dharmr'a", ++*p → increment first char 'd' → 'e', prints "harmr'a"

    printf("%s", *p++); 
    // *p = s[0] ("eharmr'a" now after previous increment), p++ moves pointer to s[1], prints "harmr'a"

    printf("%s", ++*p); 
    // p points to s[1]="hewlett-packard", ++*p increments first char 'h'→'i', prints "iewlett-packard"
}

// Output: harmr'aharmr'ai... (see above explanation)


//5
#include <stdio.h>
#include <malloc.h>
#include <string.h>

int main() 
{
    int i;
    char a[] = "String"; // Array of chars
    char *p = "NewString"; // Pointer to string literal
    char *temp;

    temp = malloc(strlen(p) + 1); // Allocate memory for temp
    p = malloc(strlen(temp) + 1); // Allocate memory for p (temp uninitialized!)
    strcpy(p, temp); // Copy uninitialized memory → undefined behavior
    printf("%s", p); // Undefined output
}


//6
#include <stdio.h>

int main() {
    int n = 12, res = 1;
    while (n > 3) 
    {
        n -= 3; // Subtract 3 from n
        res *= 3; // Multiply res by 3
    }
    printf("%d", n * res); 
    /* Loop: n=12→9→6→3, res=1→3→9→27
       Final n=3, res=27, n*res=81
    */
}

// Output: 81


//7
#include <stdio.h>

void fun(int b[][3]) 
{
    ++b; // Move pointer to next row (b now points to row 1)
    b[1][1] = 5; // b[1] = row 2 (original a[2]), b[1][1] = a[2][1] =5
}

int main() 
{
    int a[3][3] = {9,8,7,6,5,4,3,2,1};
    fun(a);
    printf("%d\n", a[2][1]); // Prints 5
}

// Output: 5


//8
#include <stdio.h>
#include <string.h>

void main() 
{
    int i, n;
    char x[5];
    strcpy(x, "Zoho"); // x = {'Z','o','h','o','\0'}
    n = strlen(x); // n=4
    *x = *(x + (n - 1)); 
    // x[0] = x[3] → 'o', string now "ooho"
    printf("%s", x); // prints "ooho"
}

// Output: ooho


//9
#include <stdio.h>

void main() 
{
    int c[] = {5, 4, 3, 4, 5};
    int j, *q = c; // pointer q points to c[0]

    for (j = 0; j < 5; j++) 
    {
        printf("%d", *c); // Always prints first element 5
        ++q; // q moves forward, but *c unchanged
    }
}

// Output: 55555


//10
#include <stdio.h>

void main() 
{
    int i = 1;
    for (i = 0; i = -1; i = 1) 
    {
        printf("%d", i); 
        if (i != 1) break;
    }
}

// i=-1 → condition i=-1 (assignment returns -1 → true)  
// Infinite loop. Prints 0 indefinitely in C (logic error)


//11
#include <stdio.h>

void main() 
{
    int s[] = {1,0,5,0,10,0};
    int f[] = {2,4,6,8,10,12};
    int n = 6, i = 0, j = 0;

    for(j = 1; j < n; j++) 
    {
        if(s[j] >= f[i]) 
        {
            printf("%d", i); // print previous activity index
            i = j; // select current activity
        }
    }
}

// Output depends on arrays: 024


//12
#include <stdio.h>

void f(int *a, int m) 
{
    int j = 0;
    for(j = 0; j < m; j++) {
        *(a + j) = *(a + j) - 5; // subtract 5 from each element
    }
}

void main() 
{
    int a[] = {'f', 'g', 'h', 'i', 'j'}; // ASCII values 102-106
    int j = 0;
    f(a, 5);
    for(j = 0; j <= 4; j++)
        printf("%c\t", a[j]); 
    // Output: 'a' 'b' 'c' 'd' 'e'
}

// Output: a b c d e


//13
#include <stdio.h>

void main() 
{
    int i = 0, j = 0, sum = 0;
    for(i = 1; i < 500; i *= 3)
        for(j = 0; j < i; j++)
            sum++;
    printf("%d", sum);
}

// i=1,3,9,27,81,243 → sum = 1+3+9+27+81+243 = 364
// Output: 364


//14
#include <stdio.h>

void main() 
{
    int n;
    for(n = 6; n != 1; n--)
        printf("%d", n--); 
        // n decremented twice per iteration
}

// Output: 6 4 2


//15
#include <stdio.h>
#include <string.h>

void main() 
{
    char *x = "Alice"; // String literal → read-only in C
    int i, n = strlen(x);

    *x = x[n]; // Undefined behavior (modifying literal)
    for(i = 0; i <= n; i++) 
    {
        printf("%s", x);
        x++; 
        printf("\n");
    }

    return 0;
}

// Undefined behavior in C, may crash


//16
#include <stdio.h>

struct value 
{
    int bit1:1; // 1 bit
    int bit3:4; // 4 bits
    int bit4:4; // 4 bits
} bit;

int main() 
{
    printf("%d\n", sizeof(bit)); 
    // size depends on compiler, usually 4 bytes (int)
}

// Output: 4


//17
#include <stdio.h>
#include <stdlib.h>

struct node 
{
    int data;
    float d;
    struct node *link;
};

int main() 
{
    struct node *p, *q;
    p = (struct node*) malloc(sizeof(struct node)); // Allocate memory
    q = (struct node*) malloc(sizeof(struct node)); 
    printf("%d,%d\n", sizeof(p), sizeof(q)); 
    // sizeof pointer → usually 8 bytes (64-bit system)
}

// Output: 8,8


//34
#include <stdio.h>

void main() 
{
    printf("%d\n", sizeof(4)/sizeof(2.0)); 
    // sizeof(4)=4 bytes (int), sizeof(2.0)=8 bytes (double), 4/8=0
    printf("%d\n", sizeof(2.0)/sizeof(4)); 
    // 8/4 = 2
}

// Output:
// 0
// 2