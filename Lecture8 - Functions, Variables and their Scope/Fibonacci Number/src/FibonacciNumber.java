import java.util.Scanner;

public class FibonacciNumber {
    public static boolean checkMember(int n){

        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int f1 = -1, f2 = 1, f3 = 0;
        while (f3 <= n) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            if (f3 == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(checkMember(n));
    }
}
