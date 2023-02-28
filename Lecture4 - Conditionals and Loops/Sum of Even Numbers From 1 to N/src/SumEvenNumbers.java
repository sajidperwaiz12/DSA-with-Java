import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);
    }
}
