package ArrayProgram;

public class RotationRunner extends Rotation {
    public static void main(String[] args) {
        int[][] mat1 = { { 1, 2 }, { 3, 4 } };
        int[][] mat2 = { { 5, 6 }, { 7, 8 } };
        int[][] mat3 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("\n--- 2D Array Programs ---");
        print2DArray(mat1);
        // 2D Array:
        // [1, 2]
        // [3, 4]

        rotateMatrixClockwise(mat3);
        // 2D Array:
        // [7, 4, 1]
        // [8, 5, 2]
        // [9, 6, 3]
        rotateMatrixAntiClockwise(mat3);
        // [3, 6, 9]
        // [2, 5, 8]
        // [1, 4, 7]

    }
}