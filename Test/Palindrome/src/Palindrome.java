import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n) {
        return n == reverse(n);
    }

    public static int reverse(int n) {
        if (n < 10) {
            return n;
        }
        int digits = (int) Math.log10(n) + 1;
        return (n % 10) * (int) Math.pow(10, digits - 1) + reverse(n / 10);
    }
}
