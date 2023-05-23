import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(productOfDigits(n));
    }

    public static int productOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) * productOfDigits(n / 10);
    }
}
