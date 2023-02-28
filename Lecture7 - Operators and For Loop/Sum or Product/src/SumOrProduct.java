import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        switch (c) {
            case 1:
                int sum = 0;
                for (int i = 1; i <= n; i++) {
                    sum += i;
                }
                System.out.println(sum);
                break;

            case 2:
                int prod = 1;
                for (int i = 1; i <= n; i++) {
                    prod *= i;
                }
                System.out.println(prod);
                break;

            default:
                System.out.println("-1");
        }
    }
}
