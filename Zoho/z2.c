//1
#include <stdio.h>

void main() 
{
    int i;
    for(i = 1; i < 4; i++) 
    {
        switch(i) 
        {
            case 1: printf("%d", i); break;
            case 2: printf("%d", i); break;
            case 3: printf("%d", i); break;
        }
    }

    switch(i) 
    {
        case 4: printf("%d", i); break;
    }
}

//2
void main()
{
    char *s = "\12345s\n";
    printf("%d", sizeof(s));
}

//3
int main() 
{
    static int i = 3;
    printf("%d", i--);
    return i > 0 ? main() : 0;
}

//4
int main() 
{
    char *s[] = {"dharmr'a", "hewlett-packard", "siemens", "ibm"};
    char **p;
    p = s;

    printf("%s", ++*p);
    printf("%s", *p++);
    printf("%s", ++*p);
}

//5
#include <stdio.h>
#include <malloc.h>
#include <string.h>

int main() 
{
    int i;
    char a[] = "String";
    char *p = "NewString";
    char *temp;

    temp = malloc(strlen(p) + 1);   // Allocate memory for temp
    p = malloc(strlen(temp) + 1);   // Allocate memory for p (but temp not initialized!)
    strcpy(p, temp);                 // Copy from uninitialized temp
    printf("%s", p);
}

//6
int main() {
    int n = 12, res = 1;
    while (n > 3) 
    {
        n -= 3;
        res *= 3;
    }
    printf("%d", n * res);
}

//7
void fun(int[][3]);

int main() 
{
    int a[3][3] = {9,8,7,6,5,4,3,2,1};
    fun(a);
    printf("%d\n", a[2][1]);
}

void fun(int b[][3]) 
{
    ++b;
    b[1][1] = 5;
}

//8
void main() 
{
    int i, n;
    char x[5];
    strcpy(x, "Zoho");
    n = strlen(x);
    *x = *(x + (n - 1));
    printf("%s", x);
}

//9
void main() 
{
    int c[] = {5, 4, 3, 4, 5};
    int j, *q = c;

    for (j = 0; j < 5; j++) 
    {
        printf("%d", *c);
        ++q;
    }
}

//10
void main() 
{
    int i = 1;
    for (i = 0; i = -1; i = 1) 
    {
        printf("%d", i);
        if (i != 1) break;
    }
}

//11
void main() 
{
    int s[] = {1,0,5,0,10,0};
    int f[] = {2,4,6,8,10,12};
    int n = 6, i = 0, j = 0;

    for(j = 1; j < n; j++) 
    {
        if(s[j] >= f[i]) 
        {
            printf("%d", i);
            i = j;
        }
    }
}

//12
void f(int *a, int m) 
{
    int j = 0;
    for(j = 0; j < m; j++) {
        *(a + j) = *(a + j) - 5;
    }
}

void main() 
{
    int a[] = {'f', 'g', 'h', 'i', 'j'};
    int j = 0;
    f(a, 5);
    for(j = 0; j <= 4; j++)
        printf("%c\t", a[j]);
}

//13
void main() 
{
    int i = 0, j = 0, sum = 0;
    for(i = 1; i < 500; i *= 3)
        for(j = 0; j < i; j++)
            sum++;
    printf("%d", sum);
}

//14
void main() 
{
    int n;
    for(n = 6; n != 1; n--)
        printf("%d", n--);
}

//15
void main() 
{
    char *x = "Alice";
    int i, n = strlen(x);

    *x = x[n];

    for(i = 0; i <= n; i++) 
    {
        printf("%s", x);
        x++;
        printf("\n", x);
    }

    return 0;
}

//16
struct value 
{
    int bit1:1;
    int bit3:4;
    int bit4:4;
} bit;

int main() 
{
    printf("%d\n", sizeof(bit));
    return 0;
}

//17
struct node 
{
    int data;
    float d;
    struct node *link;
};

int main() 
{
    struct node *p, *q;
    p = (struct node*) malloc(sizeof(struct node));
    q = (struct node*) malloc(sizeof(struct node));
    printf("%d,%d\n", sizeof(p), sizeof(q));
    return 0;
}

//34
void main() 
{
    printf("%d\n", sizeof(4)/sizeof(2.0));
    printf("%d\n", sizeof(2.0)/sizeof(4));
}

