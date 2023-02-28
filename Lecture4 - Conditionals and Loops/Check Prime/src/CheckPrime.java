import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int div = 2;
        boolean isPrime = (n == 1) ? false : true;
        while (div < n) {
            if (n % div == 0) {
                isPrime = false;
                break;
            }
            div++;
        }
        if (isPrime) {
            System.out.println(n + " is Prime");
        } else {
            System.out.println(n + " is not Prime");
        }
    }
}
