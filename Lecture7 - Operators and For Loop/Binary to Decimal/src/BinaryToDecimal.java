import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int dec = 0;
        int wt = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            dec = dec + lastDigit * (int) Math.pow(2, wt);
            wt++;
            n /= 10;
        }
        System.out.println(dec);
    }
}
