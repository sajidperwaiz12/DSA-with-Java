import java.util.Scanner;

public class SumNTo1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(sumNTo1(n));
    }

    public static int sumNTo1(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNTo1(n - 1);
    }
}
