import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long bin = 0;
        int wt = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + rem * (long) Math.pow(10 , wt);
            wt++;
            n /= 2;
        }
        System.out.println(bin);
    }
}
