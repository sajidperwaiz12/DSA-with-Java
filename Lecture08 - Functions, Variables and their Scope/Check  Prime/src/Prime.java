import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n) {
        int div = 2;
        while (div < n) {
            if (n % div == 0) {
                return false;
            }
            div++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(isPrime(n));
    }
}
