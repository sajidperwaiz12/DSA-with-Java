import java.util.*;
import java.io.*;

public class SumXor {
    public static int circularArray(int[] A) {
        int[] b = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int lIndex = i - 1 < 0 ? A.length - 1 : i - 1;
            int rIndex = (i + 1) % A.length;
            b[i] = Math.abs(A[lIndex] - A[rIndex]);
        }
        int result = 0;
        for (int i = 0; i < b.length; i++) {
            result = (result + (b[i]^i)) % 1000000007;
        }
        return result % 1000000007;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }

        int result = circularArray(A);
        System.out.println(result);
        return;
    }
}
