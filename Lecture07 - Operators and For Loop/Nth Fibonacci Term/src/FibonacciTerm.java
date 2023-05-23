import java.util.Scanner;

public class FibonacciTerm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f1 = 1, f2 = 1, f3 = 0;
        if (n == 1 || n == 2) {
            System.out.println("1");
            return;
        }
        for (int i = 1; i <= n - 2; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        System.out.println(f3);
    }
}
