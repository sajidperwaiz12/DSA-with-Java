import java.util.Scanner;

public class Matrix {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matrix = matrixInput();
        printMatrix(matrix);
    }

    public static int[][] matrixInput() {
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = i + j;
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] mat: matrix) {
            for (int ele: mat) {
                System.out.print(ele + "\t");
            }
            System.out.println();
        }
    }
}
