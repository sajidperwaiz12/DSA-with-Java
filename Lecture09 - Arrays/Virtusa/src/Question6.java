import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] d = new int[n+1];
        d[0] = 1;
        d[1] = 1;
        d[2] = 2;
        for (int i = 3; i <= n; i++) {
            d[i] = d[i-1] + d[i-2] +d[i-3];
        }
        System.out.println(d[n]);
    }
}
