import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printNTo1(n);
    }

    public static void printNTo1(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);
    }
}
