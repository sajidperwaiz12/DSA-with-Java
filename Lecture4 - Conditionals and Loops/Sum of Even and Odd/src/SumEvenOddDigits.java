import java.util.Scanner;

public class SumEvenOddDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit % 2 == 0) {
                evenSum += lastDigit;
            } else {
                oddSum += lastDigit;
            }
            n /= 10;
        }
        System.out.println(evenSum + " " + oddSum);
    }
}
