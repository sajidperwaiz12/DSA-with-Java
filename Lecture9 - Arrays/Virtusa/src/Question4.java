import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[2 * n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i] * 12 + arr[i + 1];
            if (temp > max) {
                max = temp;
            }
        }

        System.out.println(max);
    }
}
