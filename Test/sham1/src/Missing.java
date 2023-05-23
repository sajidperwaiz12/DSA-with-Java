import java.util.*;
import java.io.*;

public class Missing {
    public static int missingKeyboards(int[] Arr) {
        int n = Arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (Arr[i] > max) {
                max = Arr[i];
            }

            if (min > Arr[i]) {
                min = Arr[i];
            }
        }
        int t = max - min + 1;
        return t - n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int[] Arr = new int[N];
        for (int j = 0; j < N; j++) {
            Arr[j] = scan.nextInt();
        }
        int result;
        result = missingKeyboards(Arr);
        System.out.println(result);
        return;
    }
}
