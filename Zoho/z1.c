//1
void main()
{
    int a[10], i=0;

    for(i=0; i<10; i++)
        a[i] = 9 - i;

    for(i=0; i<10; i++)
        a[i] = a[a[i]];

    for(i=0; i<10; i++)
        printf("%d", a[i]);
}

//2
void printout(char *pstr)
{
    int iretval = 0;

    if (pstr) 
    {
        while (*pstr && *pstr <= '9' && *pstr >= '0') 
        {
            iretval = (iretval * 10) + (*pstr - '0');
            pstr++;
        }
    }
    printf("%d\n", iretval);
}

void main()
{
    printout("X32");
    printout("47X74");
}

//3
void main()
{
    int a[] = {8,9,9,9};
    int r[5] = {0,0,0,0,0};
    int i = 0, m = 1, s = 4;

    for(i = s-1; i >= 0; i--) 
    {
        r[i+1] = (a[i] + m) % 10;
        m = (a[i] + m) / 10;
    }

    r[0] = m;

    for(i = 1; i <= s; i++)
        printf("%d", r[i]);
}

//4
int i = 0;

int fun(int a)
{
    i++;
    if (a > 99)
        return a - 12;
    return fun(fun(a + 25));
}

void main()
{
    printf("%d", fun(69));
    printf("%d", i);
}

//5
int max(int x, int y)
{
    return (y > x) ? y : x;
}

void main()
{
    int a[] = {-6, -7, 8, -9, -2, 3, -4, 5};
    int value = a[0], ctval = a[0];
    int i = 0, n = 8;

    for(i = 1; i < n; i++)
    {
        ctval = max(a[i], ctval + a[i]);
        value = max(value, ctval);
    }

    printf("%d", value);
}

//6
void main()
{
    int a = 30, b = 40, x;
    x = (a = 10) & (b = 50);
    printf("x=%d\n", x);
}

//7
void main()
{
    int x = 0, y = 1;
    y = x;
    x = !y;
    printf("x=%d y=%d\n", x, y);
}

//8
void main()
{
    int x = 3, y = 4, z = 4;
    printf("ans=%d\n", (z >= y >= x ? 100 : 200));
}

//9
void main()
{
    float a = 12.25, b = 13.65;

    if(a == b)
        printf("a and b are equal");
    else
        printf("a and b are not equal");
}

//10
void main()
{
    if('Z' < 'z')
        printf("Pilots are on strike...\n");
    else
        printf("for absolutely outlandish demands\n");
}

//11
void main()
{
    float a = 0.7;

    if(a < 0.7)
        printf("Stoned");
    else
        printf("Avenged");
}

//12
void main()
{
    float a = 0.5, b = 0.9;

    if(a && b > 0.9)
        printf("tce-cse-a\n");
    else
        printf("tce-cse-b\n");
}

//13
void main()
{
    int i;
    for(i = 1; i++ <= 5; printf("%d", i));
}

//14
void main()
{
    int i = 1, j = 1;

    for(; j; printf("%d%d\n", i, j))
        j = i++ <= 5;
}

//15
void main()
{
    int x = 3, y, z;
    z = y = x;
    z *= y = x * x;
    printf("x=%d y=%d z=%d\n", x, y, z);
}

//16
void main()
{
    int x = 3, z;
    z = x / ++x;
    printf("x=%d z=%d\n", x, z);
}

//17
void main()
{
    int x, y, z;
    x = y = z = 1;
    z = ++x || ++y && ++z;
    printf("x=%d y=%d z=%d\n", x, y, z);
}

//18
void main()
{
    char ch = 'E';
    switch(ch)
    {
        case(ch >= 65 && ch <= 90):
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

//19
void main()
{
    int i = 3;
    switch(i)
    {
        case 1: printf("cse\t");
        case 2: printf("It\n"); break;
        case 3: continue;
        default: printf("goodbye");
    }
}

//20
void main()
{
    char s;
    switch(s)
    {
        case '1': printf("database");
        case '2': printf("data-structure");
        default: printf("c");
                 printf("byebye");
    }
}

//21
void main()
{
    int k = -2, j = 4;
    switch(k /= j / k)
    {
        default: printf("lenovo");
        case 0: printf("hp");
        case 1: printf("acer");
        case 2: printf("dell");
    }
}

//22
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

//23
void main()
{
    int i;
    for(i = 2; i <= 10; i++)
    {
        switch(i)
        {
            case 2: printf("0"); continue;
            case 3: break;
            case 4:
            case 5: printf("1"); break;
            default: printf("000");
        }
    }
}

//24
void main()
{
    char ch = 'E';
    switch(ch) 
    {
        case (ch >= 65 && ch <= 90):
            printf("Capital letter\n");
            break;

        case (ch >= 97 && ch <= 122):
            printf("small letter\n");
            break;

        case (ch >= 48 && ch <= 57):
            printf("Digit");
            break;

        default:
            printf("Any other");
    }
}

//25
void main()
{
    int i, j;
    for(j = 1; j <= 10; j++)
        for(i = 1; i <= 10; i++)
            if(j < 10)
            {
                printf("tcemitpsg");
            }
            else
                printf("annauniversity");
}

//26
int funcl(int k)
{
    k++;
    return k;
}

void main()
{
    int k = 35, z;
    k = funcl(k = funcl(k = funcl(k)));
    printf("k=%d\n", k);
}

//27
void pri(int, int);
void printit(float, int);

void main()
{
    float a = 3.14;
    int i = 99;
    pri(i, a);
    printit(a, i);
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
void main() 
{
    int k = 35, *z, *y;
    z = &k;
    y = z;
    *z++ = *y++;
    k++;
    printf("k=%d z=%d y=%d", k, z, y);
}

//29
void main() 
{
    int a = 100, *b, **c, ***d;
    b = &a;
    c = &b;
    d = &c;
    printf("%d %d %d %d", a, *b, **c, ***d);
}

//30
void main() 
{
    int z = 4;
    printf("%d\n", printf("%d%d\n", z, z-1));
}