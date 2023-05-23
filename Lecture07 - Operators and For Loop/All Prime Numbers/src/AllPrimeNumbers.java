import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 2; i <= n; i++) {
            int div = 2;
            boolean isPrime = true;
            while (div < i) {
                if (i % div == 0) {
                    isPrime = false;
                    break;
                }
                div++;
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
