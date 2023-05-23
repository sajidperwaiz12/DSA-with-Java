import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextByte();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
