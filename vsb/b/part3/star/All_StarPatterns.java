package vsb.b.part3.star;

import java.util.*;

public class All_StarPatterns {

    // 1. Solid Square
    static void solidSquare(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // 2. Hollow Square
    static void hollowSquare(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 3. Left Triangle
    static void leftTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 4. Inverted Left Triangle
    static void invertedLeftTriangle(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 5. Right Triangle
    static void rightTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 6. Inverted Right Triangle
    static void invertedRightTriangle(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    // 7. Pyramid
    static void filledPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print("  ");
            for(int j=1;j<=2*i-1;j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 8. Hollow Pyramid
    static void hollowPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print("  ");
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1 || i==n)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 9. Inverted Filled Pyramid
    static void invertedFilledPyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++) System.out.print("  ");
            for(int j=1;j<=2*i-1;j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 10. Inverted Hollow Pyramid
    static void invertedHollowPyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++) System.out.print("  ");
            for(int j=1;j<=2*i-1;j++){
                if(j==1 || j==2*i-1 || i==n)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 11. Diamond
    static void diamond(int n){
        filledPyramid(n);
        invertedFilledPyramid(n-1);
    }

    // 12. Hollow Diamond
    static void hollowDiamond(int n){
        hollowPyramid(n);
        invertedHollowPyramid(n-1);
    }

    // 13. Left Arrow
    static void leftArrow(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 14. Right Arrow
    static void rightArrow(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i-1;j++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 15. Cross (X)
    static void cross(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==i || j==n-i+1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 16. Plus (+)
    static void plus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==n/2+1 || j==n/2+1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 17. Number Pyramid
    static void numberPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print(j+" ");
            System.out.println();
        }
    }

    // 18. Floyd's Triangle
    static void floyd(int n){
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print(k++ +" ");
            System.out.println();
        }
    }

    // 19. Binary Triangle
    static void binaryTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((i+j)%2+" ");
            }
            System.out.println();
        }
    }

    // 20. Butterfly Pattern
    static void butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) System.out.print("* ");
            for(int j=1;j<=2*(n-i);j++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) System.out.print("* ");
            for(int j=1;j<=2*(n-i);j++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 21. Checkerboard
    static void checkerBoard(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((i+j)%2==0? "* ":"  ");
            }
            System.out.println();
        }
    }

    // 22. Zigzag
    static void zigzag(int n){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=n;j++){
                if((i+j)%4==0 || (i==2 && j%2==0))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 23. Ladder
    static void ladder(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++) System.out.print("* ");
            System.out.println();
            for(int k=1;k<=2;k++) System.out.println();
        }
    }

    // 24. Hollow Diamond in Square
    static void hollowDiamondSquare(int n){
        int mid=n/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Math.abs(i-mid)+Math.abs(j-mid)==mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // 25. Heart Pattern
    static void heart(int n){
        for(int i=n/2;i<=n;i+=2){
            for(int j=1;j<=n-i;j+=2) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            for(int j=1;j<=n-i;j++) System.out.print("  ");
            for(int j=1;j<=i;j++) System.out.print("* ");
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++) System.out.print("  ");
            for(int j=1;j<=2*i;j++) System.out.print("* ");
            System.out.println();
        }
    }

    // 26. Star Box Pattern
    static void starBox(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();

        solidSquare(n);
        hollowSquare(n);
        leftTriangle(n);
        invertedLeftTriangle(n);
        rightTriangle(n);
        invertedRightTriangle(n);
        filledPyramid(n);
        hollowPyramid(n);
        invertedFilledPyramid(n);
        invertedHollowPyramid(n);
        diamond(n);
        hollowDiamond(n);
        leftArrow(n);
        rightArrow(n);
        cross(n);
        plus(n);
        numberPyramid(n);
        floyd(n);
        binaryTriangle(n);
        butterfly(n);
        checkerBoard(n);
        zigzag(n);
        ladder(n);
        hollowDiamondSquare(n);
        heart(n);
        starBox(n);
        sc.close();
    }
}
// Enter n: 3
// * * * 
// * * * 
// * * *

// * * *
// *   *
// * * *

// *
// * *
// * * *

// * * *
// * *
// *

//     *
//   * *
// * * *

// * * *
//   * *
//     *

//     *
//   * * *
// * * * * *

//     *
//   *   *
// * * * * *

// * * * * *
//   * * *
//     *

// * * * * *
//   *   *
//     *

//     *
//   * * *
// * * * * *
// * * *
//   *

//     *
//   *   *
// * * * * *
// * * *
//   *

//     *
//   * *
// * * *
//   * *
//     *

// *
//   * *
//     * * *
//     * * *
//   * *
// *

// *   *
//   *
// *   *
//   *
// * * *
//   *

//     1
//   1 2
// 1 2 3

// 1
// 2 3
// 4 5 6

// 0
// 1 0
// 0 1 0

// *         *
// * *     * *
// * * * * * *
// * * * * * *
// * *     * *
// *         *

// *   *
//   *
// *   *
//     *
//   *
// *
// * * *


// * * *


// * * * 


//   *
// *   *
//   *
//   *     *
// * * * * * *
// * * * * * *
//   * * * *
//     * *
// * * *
// *   *
// * * *

