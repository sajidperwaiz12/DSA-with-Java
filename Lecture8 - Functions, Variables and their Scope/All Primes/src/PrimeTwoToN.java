import java.util.Scanner;

public class PrimeTwoToN {
    public static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            // need to check if i is prime
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

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
        printPrime(n);
    }
}
