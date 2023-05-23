import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        int[] temp = new int[n - k];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i + k];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i + k] = temp[temp.length - i - 1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
